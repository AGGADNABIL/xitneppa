package com.tyba.appentix.business.parametrage.dao.impl;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.parametrage.dao.ChantierDaoJpa;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.dao.Queries;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;
@Repository("chantierDao")
public class ChantiersDaoImpl extends GenericDaoJpaImpl<Chantiers, Long> implements ChantierDaoJpa {

	@Override
	public List<Chantiers> findByCode(String reference, SearchConfig config) {
		Object[] parameters = new Object[] { reference };
		String queryString = Queries.fIND_CHANTIERS_BY_REFERENCE;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public List<Chantiers> findByCriteria(String reference, String nom,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { reference, nom };
		String queryString = Queries.FIND_CHANTIERS_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public Chantiers findById(String code) {
		List<Chantiers> liste;
		Chantiers e = new Chantiers();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_CHANTIERS_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

	@Override
	public List<Chantiers> findAllSrv() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_CHANTIERS;
		return findByCriteria(queryString,config, parameters);
	}

}
