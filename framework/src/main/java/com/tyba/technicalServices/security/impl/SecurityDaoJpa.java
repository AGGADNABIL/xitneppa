package com.tyba.technicalServices.security.impl;

import org.springframework.dao.DataAccessException;

import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.exception.NotFoundException;
import com.tyba.technicalServices.exception.TechnicalException;
import com.tyba.technicalServices.security.UserEntity;



/**
 * SecurityDAO interface
 * 
 * @author TYBASOFT.com
 */
public interface SecurityDaoJpa extends GenericDaoJpa<UserEntity, Integer> {

	/**
	 * Find User with provided userName.
	 * 
	 * @return the list of trace found
	 * @throws NotFoundException
	 * @throws DataAccessException
	 * @throws TechnicalException
	 */
	public UserEntity findByUserName(String userName);

}