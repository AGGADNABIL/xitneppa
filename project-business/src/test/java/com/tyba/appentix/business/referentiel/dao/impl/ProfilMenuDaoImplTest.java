package com.tyba.appentix.business.referentiel.dao.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.tyba.appentix.business.referentiel.dao.ProfilMenuDaoJpa;
import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.appentix.common.AbstractDaoTest;
import com.tyba.technicalServices.log.ILogger;


public class ProfilMenuDaoImplTest  extends AbstractDaoTest {
	
	@Autowired
	ProfilMenuDaoJpa profilMenuDaoJpa;

	private ILogger logger;// = SL4JLogger.getInstance(EtudiantsDaoImplTest.class);
	
	@Test
	@Transactional
	@Rollback(true)
	public void findByIdTest(){
		
		logger.info("Test find by id ProfilMenu Start..");
        
		List<ProfilMenu> liste;
       
        liste = profilMenuDaoJpa.findAll();
        
        Assert.assertNotNull("findByAllProfilMenuTest",liste);
        
        logger.info("Test find by id etudiants Finished..");

		
	}
}
