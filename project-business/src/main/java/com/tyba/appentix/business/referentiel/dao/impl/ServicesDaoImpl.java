package com.tyba.appentix.business.referentiel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.referentiel.dao.Queries;
import com.tyba.appentix.business.referentiel.dao.ServicesDaoJpa;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("servicesDao")
public class ServicesDaoImpl extends GenericDaoJpaImpl<Services, Long> implements ServicesDaoJpa{

	@Override
	public List<Services> findByCode(String code, SearchConfig config) {
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_SERVICES_BY_CODE;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public List<Services> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { code, libelle };
		String queryString = Queries.FIND_SERVICES_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public Services findById(String code) {
		List<Services> liste;
		Services e = new Services();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_SERVICES_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

	@Override
	public List<Services> findAllSrv() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_SERVICES;
		return findByCriteria(queryString,config, parameters);
	}

}
