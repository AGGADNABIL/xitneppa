package com.tyba.appentix.business.referentiel.dao;

import java.util.List;

import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface PersonnelDaoJpa extends GenericDaoJpa<Personnel, Long>{

	public Personnel findByCode(String code);
	public Personnel findByMatr(String matr);
	public Personnel findByCodeMatr(String code,String matr);
	public List<Personnel> findByCriteria(String code, String nom,
			String prenom, SearchConfig config, String sortField,
			String sortOrder);
	public Personnel findById(String id);

}
