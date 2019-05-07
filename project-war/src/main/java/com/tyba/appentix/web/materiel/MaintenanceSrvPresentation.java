/*
* ReferentielSrvPresentation.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.web.materiel;

import java.util.List;

import com.tyba.appentix.business.materiel.vo.MaintenanceVO;

/**
 * 
 * @author Aimad MAJDOU
 *
 */
public interface MaintenanceSrvPresentation {

	List<MaintenanceVO> findAll();
	MaintenanceVO findById(Long id);
    
}
