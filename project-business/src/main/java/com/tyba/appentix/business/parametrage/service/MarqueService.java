/*
 * ReferentielService.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.parametrage.service;

import java.util.List;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.technicalServices.web.SearchConfig;



public interface MarqueService {
	
	        //CHANTIERS
			Marques findMarquesById(Long id);
			
			List<Marques> findMarquesByCriteria( String libelle,String description, SearchConfig config,String sortField, String sortOrde);
			
	    	List<Marques> findAllMarques();
	    	
	    	//PAYS
	    	//List<Pays> findAllPays();
	    	
	    	
}
