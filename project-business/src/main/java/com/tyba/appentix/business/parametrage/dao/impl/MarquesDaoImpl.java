package com.tyba.appentix.business.parametrage.dao.impl;

import java.util.List;





import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.parametrage.dao.ChantierDaoJpa;
import com.tyba.appentix.business.parametrage.dao.MarqueDaoJpa;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.dao.Queries;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;
@Repository("marqueDao")
public class MarquesDaoImpl extends GenericDaoJpaImpl<Marques, Long> implements MarqueDaoJpa {

	@Override
	public List<Marques> findByCode(String libelle, SearchConfig config) {
		Object[] parameters = new Object[] { libelle };
		String queryString = Queries.fIND_MARQUES_BY_LIBELLE;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public List<Marques> findByCriteria(String libelle, String description,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { libelle, description };
		String queryString = Queries.FIND_MARQUES_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}


	@Override
	public Marques findById(Long code) {
		List<Marques> liste;
		Marques e = new Marques();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_MARQUES_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

	@Override
	public List<Marques> findAll() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_MARQUES;
		return findByCriteria(queryString,config, parameters);
	}

}
