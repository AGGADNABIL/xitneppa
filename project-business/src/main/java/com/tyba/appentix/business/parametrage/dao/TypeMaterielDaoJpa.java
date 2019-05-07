package com.tyba.appentix.business.parametrage.dao;


import java.util.List;

import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface TypeMaterielDaoJpa extends GenericDaoJpa<TypeMateriel, Long> {

	public List<TypeMateriel> findByReferenceTypeM(String reference, SearchConfig config);
	public List<TypeMateriel> findByCriteria(String reference,String libelle, String description,
			SearchConfig config, String sortField,
			String sortOrder);
	public TypeMateriel findById(String reference);
	public List<TypeMateriel> findAllTypeMateriel();

	
	
}
