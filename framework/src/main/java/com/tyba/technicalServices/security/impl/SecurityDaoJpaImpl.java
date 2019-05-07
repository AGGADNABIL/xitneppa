package com.tyba.technicalServices.security.impl;

import org.springframework.stereotype.Repository;

import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.security.UserEntity;

/**
 * Security DAO implementation
 * 
 * @author TYBASOFT.com
 */
@Repository
public class SecurityDaoJpaImpl extends GenericDaoJpaImpl<UserEntity, Integer>                              
		implements SecurityDaoJpa {

	
	public UserEntity findByUserName(String userName) {
		String queryString = "from UserEntity u where u.username =  '" + userName + "'";
		return getSingleEntity(queryString);
	}
}