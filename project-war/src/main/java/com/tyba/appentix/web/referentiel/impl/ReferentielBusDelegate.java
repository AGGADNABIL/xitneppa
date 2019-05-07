/*
 * ReferentielBusDelegate.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.web.referentiel.impl;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.referentiel.Constantes;
import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.appentix.web.referentiel.IReferentielBusDelegate;
import com.tyba.appentix.web.referentiel.webbean.PersonnelWebBean;
import com.tyba.appentix.web.referentiel.webbean.ProfilAccWebBean;
import com.tyba.appentix.web.referentiel.webbean.ProfilMenuWebBean;
import com.tyba.appentix.web.referentiel.webbean.ServicesWebBean;
import com.tyba.appentix.web.referentiel.webbean.UserEntityWebBean;
import com.tyba.technicalServices.web.BaseBusDelegate;

// TODO: Auto-generated Javadoc
/**
 * The Class ReferentielBusDelegate.
 * 
 * @version 1.0 24 nov. 2014
 * @author TYBASOFT
 */
public class ReferentielBusDelegate extends BaseBusDelegate implements
		IReferentielBusDelegate {

	/**
	 * Instantiates a new referentiel bus delegate.
	 */
	public ReferentielBusDelegate() {

		domaine = "REFERENTIEL";
	}

	/**
	 * Create Nationalite.
	 * 
	 * @param webBean
	 *            the web bean
	 * @return true, if successful
	 */

	// SERVICE
	public boolean creerService(ServicesWebBean webBean) {
		String command = Constantes.COMMAND_GERER_SERVICES;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_SERVICE;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		ServicesVO returnVO = (ServicesVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean editerService(ServicesWebBean webBean) {
		String command = Constantes.COMMAND_GERER_SERVICES;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_SERVICE;
		ServicesVO returnVO = (ServicesVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean supprimerService(ServicesWebBean webBean) {
		String command = Constantes.COMMAND_GERER_SERVICES;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_SERVICE;
		ServicesVO vo = webBean.getVo();

		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);

		return error;
	}


	
	public boolean impression_carte2(PersonnelWebBean webBean){
		String command = Constantes.COMMAND_GERER_IMPRESSION;
		String sousCommand = Constantes.SOUS_COMMAND_GERER_IMPRESSION_PERSONNEL;
		PersonnelVO vo = webBean.getVo();
		executeCommand(vo, command,sousCommand);
		return error;
	}
	
	
	
	// PROFIL ACC	
	public boolean creerProfilAcc(ProfilAccWebBean webBean) {
		String command = Constantes.COMMAND_GERER_PROFILACC;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_PROFILACC;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		ProfilAccVO returnVO = (ProfilAccVO) executeCommand(
				webBean.getVo(), command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean editerProfilAcc(ProfilAccWebBean webBean) {
		
		String command = Constantes.COMMAND_GERER_PROFILACC;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_PROFILACC;
		ProfilAccVO returnVO = (ProfilAccVO) executeCommand(
				webBean.getVo(), command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;	
	}

	public boolean supprimerProfilAcc(ProfilAccWebBean webBean) {		
		String command = Constantes.COMMAND_GERER_PROFILACC;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_PROFILACC;
		ProfilAccVO vo = webBean.getVo();
			vo.setStatut(EntityStatus.DELETED);
			executeCommand(vo, command, sousCommand);		
		return error;
	
	}
	
	// PROFIL MENU	
		public boolean creerProfilMenu(ProfilMenuWebBean webBean) {
			String command = Constantes.COMMAND_GERER_PROFILMENU;
			String sousCommand = Constantes.SOUS_COMMAND_CREER_PROFILMENU;
			webBean.getVo().setStatut(EntityStatus.ENABLED);
			ProfilMenuVO returnVO = (ProfilMenuVO) executeCommand(
					webBean.getVo(), command, sousCommand);
			if (!error) {
				webBean.setVo(returnVO);
			}

			return error;
		}

		public boolean editerProfilMenu(ProfilMenuWebBean webBean) {
			
			String command = Constantes.COMMAND_GERER_PROFILMENU;
			String sousCommand = Constantes.SOUS_COMMAND_EDITER_PROFILMENU;
			ProfilMenuVO returnVO = (ProfilMenuVO) executeCommand(
					webBean.getVo(), command, sousCommand);
			if (!error) {
				webBean.setVo(returnVO);
			}

			return error;	
		}

		public boolean supprimerProfilMenu(ProfilMenuWebBean webBean) {		
			String command = Constantes.COMMAND_GERER_PROFILMENU;
			String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_PROFILMENU;
			ProfilMenuVO vo = webBean.getVo();
				vo.setStatut(EntityStatus.DELETED);
				executeCommand(vo, command, sousCommand);		
			return error;
		
		}
	
	//USER
	public boolean creerUser(UserEntityWebBean webBean) {
		String command = Constantes.COMMAND_GERER_USER;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_USER;
		webBean.getVo().setStatut("ENABLED");
		UserEntityVO returnVO = (UserEntityVO) executeCommand(
				webBean.getVo(), command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean editerUser(UserEntityWebBean webBean) {
		
		String command = Constantes.COMMAND_GERER_USER;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_USER;
		UserEntityVO returnVO = (UserEntityVO) executeCommand(
				webBean.getVo(), command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;	
	}

	public boolean supprimerUser(UserEntityWebBean webBean) {		
		String command = Constantes.COMMAND_GERER_USER;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_USER;
		UserEntityVO vo = webBean.getVo();
		vo.setStatut("DELETED");
			executeCommand(vo, command, sousCommand);		
		return error;
	
	}
	
}
