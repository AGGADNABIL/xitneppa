package com.tyba.appentix.business.parametrage.dao;

import java.util.List;

import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface ChantierDaoJpa extends GenericDaoJpa<Chantiers, Long> {

	public List<Chantiers> findByCode(String code, SearchConfig config);
	public List<Chantiers> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField,
			String sortOrder);
	public Chantiers findById(String code);
	public List<Chantiers> findAllSrv();

	
	
}
