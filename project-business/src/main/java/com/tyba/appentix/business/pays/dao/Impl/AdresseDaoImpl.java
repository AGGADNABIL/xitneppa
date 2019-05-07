package com.tyba.appentix.business.pays.dao.Impl;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.parametrage.dao.Queries;
import com.tyba.appentix.business.pays.dao.AdresseDaoJpa;
import com.tyba.appentix.business.pays.dao.PaysDaoJpa;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("adresseDao")
public class AdresseDaoImpl extends GenericDaoJpaImpl<Adresse, Long> implements AdresseDaoJpa {
	
	@Override
	public List<Adresse> findByCode(String libelle, SearchConfig config) {
		Object[] parameters = new Object[] { libelle };
		String queryString = Queries.FIND_ADRESSE_BY_ID;
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public List<Adresse> findByCriteria( String libelle,String description,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { libelle,description };
		String queryString = Queries.FIND_ADRESSE_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public Adresse findById(Long id) {
		List<Adresse> liste;
		Adresse e = new Adresse();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { id };
		String queryString = Queries.FIND_ADRESSE_BY_ID;
		liste = findByCriteria(queryString, config, parameters);
		if (!liste.isEmpty())
			return liste.get(0);
		else
			return e;
	}

	@Override
	public List<Adresse> findAll() {
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_ADRESSE;
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public List<Adresse> findByIdPays(Long id) {
		// TODO Auto-generated method stub
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] {id};
		String queryString = Queries.FIND_ALL_ADRESSE_BY_ID_PAYS;
		return findByCriteria(queryString, config, parameters);
	}

}
