
package com.tyba.appentix.business.parametrage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.parametrage.dao.TypeMaterielDaoJpa;
import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.appentix.business.parametrage.service.ParametrageService;
import com.tyba.technicalServices.web.SearchConfig;


@Service("parametrageService")
public class ParametrageTypeMaterielServiceImpl implements ParametrageService {
	
	@Autowired
	private TypeMaterielDaoJpa typeMaterielDaoJpa;
	
	
	
	@Override
	public List<TypeMateriel> findByReferenceTypeM(String reference,
			SearchConfig config) {
		return typeMaterielDaoJpa.findByReferenceTypeM(reference, config);
	}

	@Override
	public List<TypeMateriel> findByCriteria(String reference, String libelle,
			String description, SearchConfig config, String sortField,
			String sortOrder) {
		return typeMaterielDaoJpa.findByCriteria(reference, libelle, description, config, sortField, sortOrder);
	}

	@Override
	public TypeMateriel findById(String reference) {
		return typeMaterielDaoJpa.findById(reference);
	}

	@Override
	public List<TypeMateriel> findAllTypeMateriel() {
		// TODO Auto-generated method stub
		return typeMaterielDaoJpa.findAll();
	}
	
	
}
