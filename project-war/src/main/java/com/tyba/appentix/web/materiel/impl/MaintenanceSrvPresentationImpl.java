/*
 * ReferentielSrvPresentationImpl.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.web.materiel.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.appentix.business.materiel.service.MaintenanceService;
import com.tyba.appentix.business.materiel.vo.MaintenanceVO;
import com.tyba.appentix.business.materiel.vo.transformer.MaintenanceVOTransformer;
import com.tyba.appentix.web.materiel.MaintenanceSrvPresentation;

/**
 * 
 * @author Aimad MAJDOU
 *
 */
@Service("maintenanceSrvPresentation")
public class MaintenanceSrvPresentationImpl implements
		MaintenanceSrvPresentation, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9195103923868652549L;
	/** The referentielservice. */
	@Autowired
	private MaintenanceService maintenanceService;

	

	/**
	 * Gets the referentielservice.
	 * 
	 * @return the referentielservice
	 */
	public MaintenanceService getMaintenanceService() {
		return maintenanceService;
	}

	/**
	 * Sets the referentielservice.
	 * 
	 * @param referentielservice
	 *            the referentielservice to set
	 */
	public void setMaintenanceService(MaintenanceService maintenanceService) {
		this.maintenanceService = maintenanceService;
	}



	@Override
	public List<MaintenanceVO> findAll() {
		List<MaintenanceVO> lvo = new ArrayList<MaintenanceVO>();
		List<Maintenance> m = maintenanceService.findAll();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new MaintenanceVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	@Override
	public MaintenanceVO findById(Long id) {
		Maintenance models = maintenanceService.findById(id);
		return new MaintenanceVOTransformer().model2VO(models, false);
	}

}
