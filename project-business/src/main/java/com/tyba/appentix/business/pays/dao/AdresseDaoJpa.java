package com.tyba.appentix.business.pays.dao;

import java.util.List;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.Pays;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface AdresseDaoJpa extends GenericDaoJpa<Adresse, Long> {

	public List<Adresse> findByCode(String detail, SearchConfig config);

	public List<Adresse> findByCriteria(String detail, String ville,
			SearchConfig config, String sortField, String sortOrder);

	public Adresse findById(Long id);
	

	public List<Adresse> findByIdPays(Long id);
	public List<Adresse> findAll();

}
