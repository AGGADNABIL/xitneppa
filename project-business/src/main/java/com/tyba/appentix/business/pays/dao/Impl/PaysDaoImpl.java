package com.tyba.appentix.business.pays.dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.pays.dao.PaysDaoJpa;
import com.tyba.appentix.business.referentiel.dao.Queries;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("paysDao")
public class PaysDaoImpl extends GenericDaoJpaImpl<Pays, Long> implements PaysDaoJpa {
	
	@Override
	public List<Pays> findByCode(String code, SearchConfig config) {
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_PAYS_BY_ID;
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public List<Pays> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { code, libelle };
		String queryString = Queries.FIND_PAYS_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public Pays findById(Long id) {
		List<Pays> liste;
		Pays e = new Pays();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { id };
		String queryString = Queries.FIND_PAYS_BY_ID;
		liste = findByCriteria(queryString, config, parameters);
		if (!liste.isEmpty())
			return liste.get(0);
		else
			return e;
	}

	@Override
	public List<Pays> findAll() {
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_PAYS;
		return findByCriteria(queryString, config, parameters);
	}

}
