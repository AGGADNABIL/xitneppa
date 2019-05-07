package com.tyba.appentix.business.referentiel.dao;


import java.util.List;

import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface ServicesDaoJpa extends GenericDaoJpa<Services, Long> {

	public List<Services> findByCode(String code, SearchConfig config);
	public List<Services> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField,
			String sortOrder);
	public Services findById(String code);
	public List<Services> findAllSrv();

	
	
}
