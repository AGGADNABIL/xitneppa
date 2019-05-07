package com.tyba.appentix.business.referentiel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.referentiel.dao.Queries;
import com.tyba.appentix.business.referentiel.dao.UserEntityDaoJpa;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.web.SearchConfig;

@Repository("userEntityDao")
public class UserEntityDaoImpl extends GenericDaoJpaImpl<UserEntity, Long> implements UserEntityDaoJpa{

	@Override
	public List<UserEntity> findByProfil(String code, SearchConfig config) {
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_USER_BY_PROFIL;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public List<UserEntity> findByCriteria(String username,
			String firstname,String lastname,String matr,String popul,
			SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { username, firstname , lastname,matr, popul };
		String queryString = Queries.FIND_USER_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

	@Override
	public UserEntity findByUser(String code) {
		List<UserEntity> liste;
		UserEntity e = new UserEntity();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_USER_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return e;
	}

	@Override
	public List<UserEntity> findAllUsers() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_USERS;
		return findByCriteria(queryString,config, parameters);
	}

}
