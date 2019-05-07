
package com.tyba.appentix.business.parametrage.service;

import java.util.List;

import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.technicalServices.web.SearchConfig;

public interface ParametrageService {

	

	List<TypeMateriel> findByReferenceTypeM(String reference, SearchConfig config);
	List<TypeMateriel> findByCriteria(String reference,String libelle, String description,
			SearchConfig config, String sortField,
			String sortOrder);
	TypeMateriel findById(String reference);
	 List<TypeMateriel> findAllTypeMateriel();

}
