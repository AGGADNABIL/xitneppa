/*
* ReferentielSrvPresentation.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.web.referentiel;

import java.util.List;

import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.technicalServices.web.SearchConfig;

// TODO: Auto-generated Javadoc
/**
 * The Interface ReferentielSrvPresentation.
 *
 * @version 1.0 24 nov. 2014
 * @author TYBASOFT
 */
public interface ReferentielSrvPresentation {

	/**
	 * Find all nationalite.
	 *
	 * @return the list
	 */
	
	

	/**
	 * Find Etudiant by Id.
	 *
	 * @return EtudiantsVO
	 */
	
	

	// PERSONNEL
	PersonnelVO findPersonnelById(String id);
    PersonnelVO findPersonnelByCode(String code);	
    PersonnelVO findPersonnelByMatr(String matr);
    PersonnelVO findPersonnelByCodeMatr(String code,String matr);
	List<PersonnelVO> findAllPersonnel();

    //SERVICES
    ServicesVO findServicesById(String id);
    List<ServicesVO> findAllServices();
    
  
     //PROFIL ACC
     ProfilAccVO findProfilAccById(String id);
     List<ProfilAccVO> findAllProAcc();
     
     // PROFIL MENU
     
 	List<ProfilMenuVO> findAllProfilMenu();
    List<ProfilMenuVO> findMenuByProfil(String code, SearchConfig config);
    List<ProfilMenuVO> findMenuByRoot(String root, String code,
			SearchConfig config);
    List<ProfilMenuVO> findSuperRoot(String code, SearchConfig config);
    ProfilMenuVO findRootByMenu(String root,String code);

    //USER
    UserEntityVO findUserById(String id);
    List<UserEntityVO> findAllUser();
    
}
