package com.tyba.appentix.business.referentiel.dao;

import java.util.List;

import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.web.SearchConfig;

public interface UserEntityDaoJpa extends GenericDaoJpa<UserEntity, Long>{
	
	public List<UserEntity> findByProfil(String code, SearchConfig config);
	public List<UserEntity> findByCriteria(String username,
			String firstname,String lastname,String matr,String popul,
			SearchConfig config, String sortField,
			String sortOrder);
	public UserEntity findByUser(String code);
	public List<UserEntity> findAllUsers();

}
