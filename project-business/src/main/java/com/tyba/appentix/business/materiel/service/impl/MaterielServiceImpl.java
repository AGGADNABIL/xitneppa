package com.tyba.appentix.business.materiel.service.impl;

import java.io.Serializable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.materiel.dao.MaterielsDaoJpa;
import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.appentix.business.materiel.service.MaterielService;
import com.tyba.technicalServices.web.SearchConfig;

@Service("materielService")
public class MaterielServiceImpl implements MaterielService, Serializable {

	private static final long serialVersionUID = -169662607807899483L;

	@Autowired
	MaterielsDaoJpa materielsDao;

	@Override
	public Materiels findMaterielsById(String id) {
		return materielsDao.findById(id);

	}

	@Override
	public List<Materiels> findMaterielsByCriteria(String reference,
			String libelle, SearchConfig config, String sortField,
			String sortOrde) {
		return materielsDao.findByCriteria(reference, libelle, config,
				sortField, sortOrde);
	}

	@Override
	public List<Materiels> findAllMateriels() {
		return materielsDao.findAllMateries();
	}

}
