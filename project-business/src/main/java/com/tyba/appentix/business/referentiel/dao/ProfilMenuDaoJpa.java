package com.tyba.appentix.business.referentiel.dao;

import java.util.List;

import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface ProfilMenuDaoJpa extends GenericDaoJpa<ProfilMenu, Long>{

	public List<ProfilMenu> findAll();
	public List<ProfilMenu> findByCriteria(String menu, String lib,String rang, String form,String visible,String droit
			, SearchConfig config, String sortField,
			String sortOrder);
	public List<ProfilMenu> findByProfil(String code, SearchConfig config);
	public List<ProfilMenu> findByRoot(String root,String code, SearchConfig config);
	public List<ProfilMenu> findSuperRoot(String code, SearchConfig config);
	public ProfilMenu findRootByMenu(String root,String code);

	

}
