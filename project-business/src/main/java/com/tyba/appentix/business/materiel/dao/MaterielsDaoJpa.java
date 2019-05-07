package com.tyba.appentix.business.materiel.dao;


import java.util.List;



import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface MaterielsDaoJpa extends GenericDaoJpa<Materiels, Long> {

	public List<Materiels> findByreference(String reference, SearchConfig config);
	public List<Materiels> findByCriteria(String reference, String libelle,
			SearchConfig config, String sortField,
			String sortOrder);
	public Materiels findById(String reference);
	public List<Materiels> findAllMateries();

	
	
}
