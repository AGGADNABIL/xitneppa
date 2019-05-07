/*
 * ReferentielSrvPresentationImpl.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.web.referentiel.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.appentix.business.referentiel.vo.transformer.PersonnelVOTransformer;
import com.tyba.appentix.business.referentiel.vo.transformer.ProfilAccVOTransformer;
import com.tyba.appentix.business.referentiel.vo.transformer.ProfilMenuVOTransformer;
import com.tyba.appentix.business.referentiel.vo.transformer.ServicesVOTransformer;
import com.tyba.appentix.business.referentiel.vo.transformer.UserEntityVOTransformer;
import com.tyba.appentix.web.referentiel.ReferentielSrvPresentation;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.web.SearchConfig;

// TODO: Auto-generated Javadoc
/**
 * The Class ReferentielSrvPresentationImpl.
 * 
 * @version 1.0 24 nov. 2014
 * @author TYBASOFT
 */
@Service("referentielSrvPresentation")
public class ReferentielSrvPresentationImpl implements
		ReferentielSrvPresentation, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9195103923868652549L;
	/** The referentielservice. */
	@Autowired
	private ReferentielService referentielservice;

	

	/**
	 * Gets the referentielservice.
	 * 
	 * @return the referentielservice
	 */
	public ReferentielService getReferentielservice() {
		return referentielservice;
	}

	/**
	 * Sets the referentielservice.
	 * 
	 * @param referentielservice
	 *            the referentielservice to set
	 */
	public void setReferentielservice(ReferentielService referentielservice) {
		this.referentielservice = referentielservice;
	}

	

	@Override
	public List<ProfilMenuVO> findAllProfilMenu() {
		// TODO Auto-generated method stub
		List<ProfilMenuVO> lvo = new ArrayList<ProfilMenuVO>();
		List<ProfilMenu> m = referentielservice.findAllProfilMenu();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new ProfilMenuVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	@Override
	public PersonnelVO findPersonnelById(String id) {
		Personnel models = referentielservice.findPersonnelById(id);
		return new PersonnelVOTransformer().model2VO(models, false);
	}

	@Override
	public PersonnelVO findPersonnelByCode(String code) {
		Personnel models = referentielservice.findPersonnelByCode(code);
		return new PersonnelVOTransformer().model2VO(models, false);
	}

	@Override
	public PersonnelVO findPersonnelByMatr(String matr) {
		Personnel models = referentielservice.findPersonnelByMatr(matr);
		return new PersonnelVOTransformer().model2VO(models, false);
	}

	@Override
	public PersonnelVO findPersonnelByCodeMatr(String code, String matr) {
		Personnel models = referentielservice.findPersonnelByCodeMatr(code,
				matr);
		return new PersonnelVOTransformer().model2VO(models, false);
	}

	

	@Override
	public ServicesVO findServicesById(String id) {
		// TODO Auto-generated method stub
		Services models = referentielservice.findServicesById(id);
		return new ServicesVOTransformer().model2VO(models, false);
	}

	@Override
	public List<ServicesVO> findAllServices() {
		List<ServicesVO> lvo = new ArrayList<ServicesVO>();
		List<Services> m = referentielservice.findAllServices();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new ServicesVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	

	@Override
	public List<PersonnelVO> findAllPersonnel() {
		List<PersonnelVO> lvo = new ArrayList<PersonnelVO>();
		List<Personnel> m = referentielservice.findPersonnels();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new PersonnelVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	

	@Override
	public ProfilAccVO findProfilAccById(String id) {
		ProfilAcc models = referentielservice.findProAccById(id);
		return new ProfilAccVOTransformer().model2VO(models, false);
	}

	@Override
	public List<ProfilAccVO> findAllProAcc() {
		List<ProfilAccVO> lvo = new ArrayList<ProfilAccVO>();
		List<ProfilAcc> m = referentielservice.findAllProAcc();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new ProfilAccVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	@Override
	public List<ProfilMenuVO> findMenuByProfil(String code, SearchConfig config) {
		List<ProfilMenuVO> lvo = new ArrayList<ProfilMenuVO>();
		List<ProfilMenu> m = referentielservice.findMenuByProfil(code, config);
		for (int i = 0; i < m.size(); i++)
			lvo.add(new ProfilMenuVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	@Override
	public List<ProfilMenuVO> findMenuByRoot(String root, String code,
			SearchConfig config) {
		List<ProfilMenuVO> lvo = new ArrayList<ProfilMenuVO>();
		List<ProfilMenu> m = referentielservice.findMenuByRoot(root, code, config);
		for (int i = 0; i < m.size(); i++)
			lvo.add(new ProfilMenuVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	@Override
	public List<ProfilMenuVO> findSuperRoot(String code, SearchConfig config) {
		List<ProfilMenuVO> lvo = new ArrayList<ProfilMenuVO>();
		List<ProfilMenu> m = referentielservice.findSuperRoot(code, config);
		for (int i = 0; i < m.size(); i++)
			lvo.add(new ProfilMenuVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	@Override
	public ProfilMenuVO findRootByMenu(String root, String code) {
		ProfilMenu models = referentielservice.findRootByMenu(root, code);
		return new ProfilMenuVOTransformer().model2VO(models, false);
	}

	@Override
	public UserEntityVO findUserById(String id) {
		UserEntity models = referentielservice.findUserById(id);
		return new UserEntityVOTransformer().model2VO(models, false);
	}

	@Override
	public List<UserEntityVO> findAllUser() {
		List<UserEntityVO> lvo = new ArrayList<UserEntityVO>();
		List<UserEntity> m = referentielservice.findAllUser();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new UserEntityVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

}
