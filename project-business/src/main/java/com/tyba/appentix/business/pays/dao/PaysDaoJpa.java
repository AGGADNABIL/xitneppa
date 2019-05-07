package com.tyba.appentix.business.pays.dao;

import java.util.List;

import com.tyba.appentix.business.common.Pays;

import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface PaysDaoJpa extends GenericDaoJpa<Pays, Long> {

	public List<Pays> findByCode(String code, SearchConfig config);

	public List<Pays> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField, String sortOrder);

	public Pays findById(Long code);

	public List<Pays> findAll();

}
