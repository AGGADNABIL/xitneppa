package com.tyba.technicalServices.security.impl;

import java.util.List;

import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.security.Permission;
import com.tyba.technicalServices.security.WinMenu;

public interface AutorizationDAOJpa extends GenericDaoJpa<WinMenu,String>{

	List<Permission> listPermission(String codeOperateur);
	
}
