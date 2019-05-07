package com.tyba.appentix.business.common.pays.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.pays.service.PaysService;
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
@Service("paysService")
public class PaysServiceImpl implements PaysService {

	
	@Autowired
	private PaysDaoJpa paysDaoJpa;
	

	@Override
	public Pays findPaysById(Long id) {
		// TODO Auto-generated method stub
		return paysDaoJpa.findById(id);
	}

	@Override
	public List<Pays> findPaysByCriteria(
			String libelle, SearchConfig config, String sortField,
			String sortOrde) {
		// TODO Auto-generated method stub
		return paysDaoJpa.findByCriteria(libelle, config, sortField, sortOrde);

	}

	@Override
	public List<Pays> findAllPays() {
		// TODO Auto-generated method stub
		return paysDaoJpa.findAll();
	}
		

}
