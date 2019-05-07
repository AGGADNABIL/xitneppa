package com.tyba.technicalServices.security.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.security.Permission;
import com.tyba.technicalServices.security.WinMenu;

@Repository("autorizationDao")
public class AutorizationDAOImpl extends GenericDaoJpaImpl<WinMenu, String>
		implements AutorizationDAOJpa {

	public List<Permission> listPermission(String codeOperateur) {
		List<Permission> listPermission = new ArrayList<Permission>();
		String queryString = "FROM WinMenu w WHERE w.operateur = ?1";
		
		List<WinMenu> listWinMenu = (List<WinMenu>) executeQuery(queryString,
				codeOperateur);
		for (WinMenu winMenu : listWinMenu) {
			listPermission.add(toPermission(winMenu));
		}
		return listPermission;
	}

	private Permission toPermission(WinMenu winMenu) {
		Permission permission = new Permission(winMenu.getCode(),winMenu.isActif(),winMenu.isDroitCreat(),winMenu.isDroitModif(),
					winMenu.isDroitSuppr(),winMenu.isDroitConsult());
		return permission;
	}

}
