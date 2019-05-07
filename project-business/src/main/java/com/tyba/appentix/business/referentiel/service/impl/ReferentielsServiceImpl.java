/*
 * ReferentielsServiceImpl.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.referentiel.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.referentiel.dao.PersonnelDaoJpa;
import com.tyba.appentix.business.referentiel.dao.ProfilAccDaoJpa;
import com.tyba.appentix.business.referentiel.dao.ProfilMenuDaoJpa;
import com.tyba.appentix.business.referentiel.dao.ServicesDaoJpa;
import com.tyba.appentix.business.referentiel.dao.UserEntityDaoJpa;
import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.web.SearchConfig;

// TODO: Auto-generated Javadoc
/**
 * The Class ReferentielsServiceImpl.
 * 
 * @author mbenboubker
 */
@Service("referentielService")
public class ReferentielsServiceImpl implements ReferentielService,Serializable {
	
	
	/**
	 * 
	 */
	@Autowired
	private ProfilMenuDaoJpa profilMenuDaoJpa;
	@Autowired
	private PersonnelDaoJpa personnelDaoJpa;
	@Autowired
	private ProfilAccDaoJpa profilAccDaoJpa;
	@Autowired
	private UserEntityDaoJpa userDaoJpa;
	@Autowired
	private ServicesDaoJpa serviceDaoJpa;


	@Override
	public Personnel findPersonnelById(String id) {
		// TODO Auto-generated method stub
		return personnelDaoJpa.findById(id);
	}

	@Override
	public List<Personnel> findPersonneleByCriteria(String code, String nom,
			String prenom, SearchConfig config,
			String sortField, String sortOrder) {
		return personnelDaoJpa.findByCriteria(code,  nom, prenom,  config, sortField, sortOrder);
	}
	@Override
	public List<ProfilMenu> findAllProfilMenu() {
		// TODO Auto-generated method stub
		return profilMenuDaoJpa.findAll();
	}

	public PersonnelDaoJpa getPersonnelDaoJpa() {
		return personnelDaoJpa;
	}

	public void setPersonnelDaoJpa(PersonnelDaoJpa personnelDaoJpa) {
		this.personnelDaoJpa = personnelDaoJpa;
	}

	@Override
	public Personnel findPersonnelByCode(String code) {
		// TODO Auto-generated method stub
		return personnelDaoJpa.findByCode(code);
	}

	@Override
	public Personnel findPersonnelByMatr(String matr) {
		// TODO Auto-generated method stub
		return personnelDaoJpa.findByMatr(matr);
	}

	@Override
	public Personnel findPersonnelByCodeMatr(String code, String matr) {
		// TODO Auto-generated method stub
		return personnelDaoJpa.findByCodeMatr(code, matr);
	}

	

	@Override
	public Services findServicesById(String id) {
		// TODO Auto-generated method stub
		return serviceDaoJpa.findById(id);
	}

	@Override
	public List<Services> findServicesByCriteria( String code,
			String libelle, SearchConfig config, String sortField,
			String sortOrde) {
		// TODO Auto-generated method stub
		return serviceDaoJpa.findByCriteria(code,libelle, config, sortField, sortOrde);

	}

	

	@Override
	public List<Personnel> findPersonnels() {
		// TODO Auto-generated method stub
		return personnelDaoJpa.findAll();
	}

	

	@Override
	public List<ProfilAcc> findProAccByCode(String code, SearchConfig config) {
		// TODO Auto-generated method stub
		return profilAccDaoJpa.findByCode(code, config);
	}

	@Override
	public List<ProfilAcc> findProAccByCriteria(String code, String libelle,
			SearchConfig config, String sortField, String sortOrder) {
		// TODO Auto-generated method stub
		return profilAccDaoJpa.findByCriteria(code, libelle, config, sortField, sortOrder);
	}

	@Override
	public ProfilAcc findProAccById(String code) {
		// TODO Auto-generated method stub
		return profilAccDaoJpa.findById(code);
	}

	@Override
	public List<ProfilAcc> findAllProAcc() {
		// TODO Auto-generated method stub
		return profilAccDaoJpa.findAll();
	}

	@Override
	public List<ProfilMenu> findMenuByProfil(String code, SearchConfig config) {
		// TODO Auto-generated method stub
		return profilMenuDaoJpa.findByProfil(code, config);
	}

	@Override
	public List<ProfilMenu> findMenuByCriteria(String menu, String lib,
			String rang, String form, String visible, String droit,
			SearchConfig config, String sortField, String sortOrder) {
		// TODO Auto-generated method stub
		return profilMenuDaoJpa.findByCriteria(menu, lib, rang, form, visible, droit, config, sortField, sortOrder);
	}

	@Override
	public List<ProfilMenu> findMenuByRoot(String root, String code,
			SearchConfig config) {
		// TODO Auto-generated method stub
		return profilMenuDaoJpa.findByRoot(root, code, config);
	}

	@Override
	public List<ProfilMenu> findSuperRoot(String code, SearchConfig config) {
		// TODO Auto-generated method stub
		return profilMenuDaoJpa.findSuperRoot(code, config);
	}

	@Override
	public ProfilMenu findRootByMenu(String root, String code) {
		// TODO Auto-generated method stub
		return profilMenuDaoJpa.findRootByMenu(root, code);
	}

	@Override
	public UserEntity findUserById(String id) {
		// TODO Auto-generated method stub
		return userDaoJpa.findByUser(id);
	}


	@Override
	public List<UserEntity> findAllUser() {
		// TODO Auto-generated method stub
		return userDaoJpa.findAllUsers();
	}

	@Override
	public List<UserEntity> findUserByCriteria(String username,
			String firstname, String lastname,String matr, String popul,
			SearchConfig config, String sortField, String sortOrde) {
		// TODO Auto-generated method stub
		return userDaoJpa.findByCriteria(username, firstname, lastname, matr,popul, config, sortField, sortOrde);
	}

	@Override
	public List<Services> findAllServices() {
		// TODO Auto-generated method stub
		return serviceDaoJpa.findAll();
	}
		

}
