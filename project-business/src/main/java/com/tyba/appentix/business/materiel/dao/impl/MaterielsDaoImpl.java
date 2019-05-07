package com.tyba.appentix.business.materiel.dao.impl;

import java.util.List;






import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.materiel.dao.MaterielsDaoJpa;
import com.tyba.appentix.business.materiel.dao.Queries;
import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("materielsDao")
public class MaterielsDaoImpl extends GenericDaoJpaImpl<Materiels, Long> implements MaterielsDaoJpa{

	@Override
	public List<Materiels> findByreference(String reference, SearchConfig config) {
		Object[] parameters = new Object[] { reference };
		String queryString = Queries.FIND_MATERIELS_BY_REFERENCE;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public List<Materiels> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { code, libelle };
		String queryString = Queries.FIND_MATERIELS_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public Materiels findById(String id) {
		List<Materiels> liste;
		Materiels e = new Materiels();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { id };
		String queryString = Queries.FIND_MATERIELS_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

	@Override
	public List<Materiels> findAllMateries() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_MATERIELS;
		return findByCriteria(queryString,config, parameters);
	}

}
