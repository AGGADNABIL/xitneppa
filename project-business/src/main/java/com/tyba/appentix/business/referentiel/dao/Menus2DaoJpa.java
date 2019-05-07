package com.tyba.appentix.business.referentiel.dao;

import java.util.List;

import com.tyba.appentix.business.referentiel.model.Menus2;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface Menus2DaoJpa extends GenericDaoJpa<Menus2, Long>{
	
	public List<Menus2> findByCode(String code, SearchConfig config);
	public List<Menus2> findByCriteria(String id, String critere1,
			String critere2, String critere3, SearchConfig config, String sortField,
			String sortOrder);
	public Menus2 findById(String code);

}
