/**
 * 
 */
package com.tyba.appentix.business.materiel.dao.impl;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import static org.junit.Assert.assertNotNull;

import com.tyba.appentix.business.materiel.dao.MaterielsDaoJpa;
import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.appentix.common.AbstractUCTest;

/**
 * @author Jamal EL BOUROUMI
 * 
 */

public class MaterielDAOTest  extends AbstractUCTest {

	@Autowired
	MaterielsDaoJpa materielsDao;
    
	@Test
	//@Rollback(false)
	public void creerMaterielsTest() {
		Materiels materiel = new Materiels();
		materiel.setReference("ref1");
		materiel.setLibelle("libelle1");
        materiel.setEtat('E');
		materielsDao.persist(materiel);
        Assert.assertTrue("oui", true);


	}
	
	@Test
	public void find(){
		Materiels materiel = materielsDao.find(1L);
		
        Assert.assertNotNull(materiel);

		
		
	}

}
