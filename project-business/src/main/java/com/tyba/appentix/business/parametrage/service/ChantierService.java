/*
 * ReferentielService.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.parametrage.service;

import java.util.List;


import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.technicalServices.web.SearchConfig;



public interface ChantierService {
	
	        //CHANTIERS
			Chantiers findChantiersById(String id);
			
			List<Chantiers> findChantiersByCriteria( String reference,String nom, SearchConfig config,String sortField, String sortOrde);
			
	    	List<Chantiers> findAllChantiers();
	    	
	    	//PAYS
	    	//List<Pays> findAllPays();
	    	
	    	
}
