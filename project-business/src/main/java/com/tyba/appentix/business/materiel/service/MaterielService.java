/*
 * ReferentielService.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.materiel.service;

import java.util.List;

import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.technicalServices.web.SearchConfig;

/**
 * 
 * 
 * @author jamal EL BOUROUMI
 *
 */

public interface MaterielService {

	

	Materiels findMaterielsById(String id);

	List<Materiels> findMaterielsByCriteria(String reference, String libelle,
			SearchConfig config, String sortField, String sortOrde);

	List<Materiels> findAllMateriels();

}
