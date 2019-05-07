package com.tyba.appentix.business.referentiel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.referentiel.dao.ProfilAccDaoJpa;
import com.tyba.appentix.business.referentiel.dao.Queries;
import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("profilAccDao")
public class ProfilAccDaoImpl extends GenericDaoJpaImpl<ProfilAcc, Long> implements ProfilAccDaoJpa {

	@Override
	public List<ProfilAcc> findByCode(String code, SearchConfig config) {
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_PROFILACC_BY_CODE;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public List<ProfilAcc> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { code, libelle };
		String queryString = Queries.FIND_PROFILACC_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public ProfilAcc findById(String code) {
		List<ProfilAcc> liste;
		ProfilAcc e = new ProfilAcc();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_PROFILACC_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

	@Override
	public List<ProfilAcc> findAllProfAcc() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_PROFILACC;
		return findByCriteria(queryString,config, parameters);
	}

}
