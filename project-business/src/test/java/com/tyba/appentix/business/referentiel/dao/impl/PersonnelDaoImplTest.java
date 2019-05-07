package com.tyba.appentix.business.referentiel.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.tyba.appentix.business.referentiel.dao.PersonnelDaoJpa;
import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.common.AbstractDaoTest;
import com.tyba.technicalServices.log.ILogger;

public class PersonnelDaoImplTest extends AbstractDaoTest{
	
	private ILogger logger ;//= SL4JLogger.getInstance(EtudiantsDaoImplTest.class);

	@Autowired
	PersonnelDaoJpa personnelDaoJpa;
	
	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	@Test
	@Transactional
	@Rollback(true)
	public void findByCodeTest(){
		
		logger.info("Test find by code personnel Start..");
        
        Personnel e;
       
        e = personnelDaoJpa.findByCode("1");
        
        Assert.assertNotNull("findByCODETest: personnel est vide",e);
        
        logger.info("Test find by code personnel Finished..");

		
	}

}
