/*
 * ReferentielService.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.materiel.service;

import java.util.Date;
import java.util.List;

import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.technicalServices.web.SearchConfig;

/**
 * 
 * @author Aimad MAJDOU
 *
 */
public interface MaintenanceService {

		List<Maintenance> findAll();
		Maintenance findById(Long id);		
		List<Maintenance> findMaintenanceByCriteria(Long id, String materiel, String motif, String centreMaintenance,
				String technicien, Double frais, Date dateDebut, Date dateFin,
				Integer duree, String rapport, SearchConfig config, String sortField, String sortOrder);
		List<Maintenance> findMaintenanceByCriteria(Long id, String materiel, String motif, String centreMaintenance,
				String technicien, String frais, Date dateDebut, Date dateFin,
				String duree, String rapport, SearchConfig config, String sortField, String sortOrder);
}
