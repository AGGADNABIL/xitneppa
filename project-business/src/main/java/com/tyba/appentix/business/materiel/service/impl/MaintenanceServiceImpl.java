/*
 * ReferentielsServiceImpl.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.materiel.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.materiel.dao.MaintenanceDaoJpa;
import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.appentix.business.materiel.service.MaintenanceService;
import com.tyba.technicalServices.web.SearchConfig;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Aimad MAJDOU
 *
 */
@Service("maintenanceService")
public class MaintenanceServiceImpl implements MaintenanceService {
	
	
	@Autowired
	private MaintenanceDaoJpa maintenanceDaoJpa;

	@Override
	public List<Maintenance> findAll() {
		return maintenanceDaoJpa.findAll();
	}

	@Override
	public Maintenance findById(Long id) {
		return maintenanceDaoJpa.find(id);
	}

	@Override
	public List<Maintenance> findMaintenanceByCriteria(
			Long id, String materiel, String motif, String centreMaintenance,
			String technicien, Double frais, Date dateDebut, Date dateFin,
			Integer duree, String rapport, SearchConfig config, String sortField, String sortOrder) {
		return maintenanceDaoJpa.findMaintenanceByCriteria(id, materiel, motif, centreMaintenance, technicien, frais, dateDebut, dateFin, duree, rapport, config, sortField, sortOrder);
	}

	@Override
	public List<Maintenance> findMaintenanceByCriteria(Long id,
			String materiel, String motif, String centreMaintenance,
			String technicien, String frais, Date dateDebut, Date dateFin,
			String duree, String rapport, SearchConfig config,
			String sortField, String sortOrder) {
		// TODO Auto-generated method stub
		return  maintenanceDaoJpa.findMaintenanceByCriteria(id, materiel, motif, centreMaintenance, technicien, Double.parseDouble(frais), dateDebut, dateFin, Integer.parseInt(duree), rapport, config, sortField, sortOrder);
	}


}
