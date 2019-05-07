/*
 * ReferentielService.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.referentiel.service;

import java.util.List;

import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.web.SearchConfig;

// TODO: Auto-generated Javadoc
/**
 * The Interface ReferentielService.
 * 
 * @version 1.0 21 nov. 2014
 * @author mbenboubker
 */
public interface ReferentielService {

	// Nationalite
		/**
		 * Find nationalite by criteria.
		 * 
		 * @param code
		 *            the code
		 * @param libelle
		 *            the libelle
		 * @param langue
		 *            the langue
		 * @param staut
		 *            the staut
		 * @param config
		 *            the config
		 * @param sortField
		 *            the sort field
		 * @param sortOrder
		 *            the sort order
		 * @return the list
		 */
		
		// PERSONNEL
        Personnel findPersonnelById(String id);
        Personnel findPersonnelByCode(String code);
		List<Personnel> findPersonneleByCriteria(String code, String nom,
				String prenom,SearchConfig config,
				String sortField, String sortOrde);
		
		Personnel findPersonnelByMatr(String matr);
		Personnel findPersonnelByCodeMatr(String code,String matr);
		
	     
	     // SERVICES
	     Services findServicesById(String id);
			
		List<Services> findServicesByCriteria( String code,
					String libelle, SearchConfig config,
					String sortField, String sortOrde);
		
		List<Services> findAllServices();
		
		
		
		List<Personnel> findPersonnels();
		
		// PROFIL ACC
	    List<ProfilAcc> findProAccByCode(String code, SearchConfig config);
	    List<ProfilAcc> findProAccByCriteria(String code, String libelle,
				SearchConfig config, String sortField,
				String sortOrder);
	    ProfilAcc findProAccById(String code);
		 List<ProfilAcc> findAllProAcc();
		 
		 // PROFIL MENU
		List<ProfilMenu> findAllProfilMenu();
	    List<ProfilMenu> findMenuByProfil(String code, SearchConfig config);
	    List<ProfilMenu> findMenuByCriteria(String menu, String lib,String rang, String form,String visible,String droit
				, SearchConfig config, String sortField,
				String sortOrder);
	    List<ProfilMenu> findMenuByRoot(String root,String code, SearchConfig config);
	    List<ProfilMenu> findSuperRoot(String code, SearchConfig config);
        ProfilMenu findRootByMenu(String root,String code);

        // USER
	     UserEntity findUserById(String id);
			
		List<UserEntity> findUserByCriteria( String username,
					String firstname,String lastname,String matr,String popul, SearchConfig config,
					String sortField, String sortOrde);
		
		List<UserEntity> findAllUser();
		




}
