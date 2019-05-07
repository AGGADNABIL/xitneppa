package com.tyba.appentix.business.common.pays.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.pays.service.AdresseService;
import com.tyba.appentix.business.common.pays.service.PaysService;
import com.tyba.appentix.business.pays.dao.AdresseDaoJpa;
import com.tyba.appentix.business.pays.dao.PaysDaoJpa;
import com.tyba.appentix.business.referentiel.dao.PersonnelDaoJpa;
import com.tyba.appentix.business.referentiel.dao.ProfilAccDaoJpa;
import com.tyba.appentix.business.referentiel.dao.ProfilMenuDaoJpa;
import com.tyba.appentix.business.referentiel.dao.ServicesDaoJpa;
import com.tyba.appentix.business.referentiel.dao.UserEntityDaoJpa;
import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.web.SearchConfig;
@Service("adresseService")
public class AdresseServiceImpl implements AdresseService {

	
	@Autowired
	private AdresseDaoJpa adresseDaoJpa;
	

	@Override
	public Adresse findById(Long id) {
		// TODO Auto-generated method stub
		return adresseDaoJpa.findById(id);
	}

	@Override
	public List<Adresse> findByCriteria( String detail,
			String ville, SearchConfig config, String sortField,
			String sortOrde) {
		// TODO Auto-generated method stub
		return adresseDaoJpa.findByCriteria(detail,ville, config, sortField, sortOrde);
	}


	@Override
public List<Adresse> findAll() {
		// TODO Auto-generated method stub
		return adresseDaoJpa.findAll();
	}

	@Override
	public List<Adresse> findVilleByIdPays(Long id) {
		// TODO Auto-generated method stub
		return adresseDaoJpa.findByIdPays(id);
	}
		

}
