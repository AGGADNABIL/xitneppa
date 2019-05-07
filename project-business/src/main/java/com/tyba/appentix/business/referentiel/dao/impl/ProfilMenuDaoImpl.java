package com.tyba.appentix.business.referentiel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.referentiel.dao.ProfilMenuDaoJpa;
import com.tyba.appentix.business.referentiel.dao.Queries;
import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("profilMenuDaoImpl")
public class ProfilMenuDaoImpl extends GenericDaoJpaImpl<ProfilMenu, Long >implements ProfilMenuDaoJpa{


	
	public List<ProfilMenu> findAll(){
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_PROFIL_MENU;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public List<ProfilMenu> findByCriteria(String menu, String lib,
			String rang, String form, String visible, String droit,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { menu, lib,rang,form, visible,droit};
		String queryString = Queries.FIND_PROFILMENU_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public List<ProfilMenu> findByProfil(String code, SearchConfig config) {
		
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_MENU_BY_PROFIL;
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public List<ProfilMenu> findByRoot(String root, String code,
			SearchConfig config) {
		Object[] parameters = new Object[] { root , code };
		String queryString = Queries.FIND_MENU_BY_ROOT;
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public List<ProfilMenu> findSuperRoot(String code, SearchConfig config) {
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_SUPER_ROOT;
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public ProfilMenu findRootByMenu(String menu, String code) {
		List<ProfilMenu> liste;
		ProfilMenu e = new ProfilMenu();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { menu , code };
		String queryString = Queries.FIND_ROOT_BY_MENU;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

}
