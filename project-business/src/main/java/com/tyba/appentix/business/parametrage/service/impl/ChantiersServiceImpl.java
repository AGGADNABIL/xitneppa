package com.tyba.appentix.business.parametrage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.parametrage.dao.ChantierDaoJpa;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.service.ChantierService;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
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
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.web.SearchConfig;

@Service("chantierService")
public class ChantiersServiceImpl implements ChantierService {

	@Autowired
	private ChantierDaoJpa chantierDao;

//	@Autowired
//	private PaysDaoJpa paysDao;

	@Override
	public Chantiers findChantiersById(String id) {
		// TODO Auto-generated method stub
		return chantierDao.findById(id);
	}

	@Override
	public List<Chantiers> findAllChantiers() {
		return chantierDao.findAll();
	}

	@Override
	public List<Chantiers> findChantiersByCriteria(String reference,
			String nom, SearchConfig config, String sortField, String sortOrde) {
		// TODO Auto-generated method stub
		return chantierDao.findByCriteria(reference, nom, config, sortField,
				sortOrde);
	}

//	public List<Pays> findAllPays() {
//		return paysDao.findAll();
//	}

}