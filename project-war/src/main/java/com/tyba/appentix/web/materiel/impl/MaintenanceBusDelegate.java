/*
 * ReferentielBusDelegate.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.web.materiel.impl;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.materiel.Constantes;
import com.tyba.appentix.business.materiel.vo.MaintenanceVO;
import com.tyba.appentix.web.materiel.IMaintenanceBusDelegate;
import com.tyba.appentix.web.materiel.webbean.MaintenanceWebBean;
import com.tyba.technicalServices.web.BaseBusDelegate;

/**
 * 
 * @author Aimad MAJDOU
 *
 */
public class MaintenanceBusDelegate extends BaseBusDelegate implements
		IMaintenanceBusDelegate {

	/**
	 * Instantiates a new referentiel bus delegate.
	 */
	public MaintenanceBusDelegate() {

		domaine = "MAINTENANCE";
	}



	// Maintenance
	public boolean creerMaintenance(MaintenanceWebBean webBean) {
		
		String command = Constantes.COMMAND_GERER_MAINTENANCE;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_MAINTENANCE;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		
		MaintenanceVO returnVO = (MaintenanceVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		
		if (!error) {
			webBean.setVo(returnVO);
		}
		System.out.println("Creeer");
		return error;
	}

	public boolean editerMaintenance(MaintenanceWebBean webBean) {
		
		String command = Constantes.COMMAND_GERER_MAINTENANCE;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_MAINTENANCE;
		MaintenanceVO returnVO = (MaintenanceVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}
		System.out.println("Modifier");
		return error;
	}

	public boolean supprimerMaintenance(MaintenanceWebBean webBean) {
		
		String command = Constantes.COMMAND_GERER_MAINTENANCE;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_MAINTENANCE;
		MaintenanceVO vo = webBean.getVo();

		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);
		System.out.println("Hello from delete !");
		return error;
	}



	
	
}
