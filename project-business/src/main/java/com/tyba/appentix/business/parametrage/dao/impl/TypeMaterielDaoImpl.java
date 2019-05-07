package com.tyba.appentix.business.parametrage.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.parametrage.dao.Queries;
import com.tyba.appentix.business.parametrage.dao.TypeMaterielDaoJpa;
import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository
public class TypeMaterielDaoImpl extends GenericDaoJpaImpl<TypeMateriel, Long> implements TypeMaterielDaoJpa{

	@Override
	public List<TypeMateriel> findByReferenceTypeM(String reference, SearchConfig config){
		Object[] parameters = new Object[] { reference };
		String queryString = Queries.FIND_TYPE_MATERIEL_BY_REFERENCE;
		return findByCriteria(queryString,config, parameters);
	}
	@Override
	public List<TypeMateriel> findByCriteria(String reference, String libelle,
			String description, SearchConfig config, String sortField,
			String sortOrder) {
			Object[] parameters = new Object[] { reference, libelle,description };
			String queryString = Queries.FIND_TYPE_MATERIEL_BY_CRITERIA;
			queryString += sortField != null ? " order by " + sortField + " "
					+ sortOrder : "";
			return findByCriteria(queryString, config, parameters);
	}
	@Override
	public TypeMateriel findById(String reference) {
		List<TypeMateriel> liste;
		TypeMateriel tm = new TypeMateriel();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { reference };
		String queryString = Queries.FIND_TYPE_MATERIEL_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return tm;
	}
	@Override
	public List<TypeMateriel> findAllTypeMateriel() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_TYPE_MATERIEL;
		return findByCriteria(queryString,config, parameters);
	}

	
	}



	