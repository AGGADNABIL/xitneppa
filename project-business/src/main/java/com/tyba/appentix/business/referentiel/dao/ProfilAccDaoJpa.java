package com.tyba.appentix.business.referentiel.dao;

import java.util.List;

import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface ProfilAccDaoJpa extends GenericDaoJpa<ProfilAcc, Long>  {
	
	public List<ProfilAcc> findByCode(String code, SearchConfig config);
	public List<ProfilAcc> findByCriteria(String code, String libelle,
			SearchConfig config, String sortField,
			String sortOrder);
	public ProfilAcc findById(String code);
	public List<ProfilAcc> findAllProfAcc();

}
