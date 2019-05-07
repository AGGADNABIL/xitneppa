package com.tyba.appentix.business.parametrage.dao;

import java.util.List;


import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface MarqueDaoJpa extends GenericDaoJpa<Marques, Long> {
	
	public List<Marques> findByCode(String code, SearchConfig config);
	public List<Marques> findByCriteria(String libelle, String description,
			SearchConfig config, String sortField,
			String sortOrder);
	public Marques findById(Long id);
	public List<Marques> findAll();
}
