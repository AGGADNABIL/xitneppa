package com.tyba.appentix.business.referentiel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.referentiel.dao.PersonnelDaoJpa;
import com.tyba.appentix.business.referentiel.dao.Queries;
import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("personnelDao")
public class PersonnelDaoImpl extends GenericDaoJpaImpl<Personnel, Long> implements PersonnelDaoJpa{

	@Override
	public Personnel findByCode(String code) {
		List<Personnel> liste;
		Personnel e = new Personnel();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_PERSONNEL_BY_CODE;
		System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjj "+queryString);
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		   return  liste.get(0);
		else 
			return e;	
	}

	@Override
	public Personnel findById(String id) {
		List<Personnel> liste;
		Personnel e = new Personnel();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { id };
		String queryString = Queries.FIND_PERSONNEL_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

	@Override
	public Personnel findByMatr(String matr) {
		List<Personnel> liste;
		Personnel e = new Personnel();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { matr };
		String queryString = Queries.FIND_PERSONNEL_BY_MATR;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;	
		
	}

	@Override
	public Personnel  findByCodeMatr(String code, String matr) {
		List<Personnel> liste;
		Personnel e = new Personnel();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code ,matr};
		String queryString = Queries.FIND_PERSONNEL_BY_CODE_MATR;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}


	@Override
	public List<Personnel> findByCriteria(String code,  String nom,
			String prenom,  SearchConfig config,
			String sortField, String sortOrder) {
		Object[] parameters = new Object[] { code,nom, prenom};
		String queryString = Queries.FIND_PERSONNEL_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

}
