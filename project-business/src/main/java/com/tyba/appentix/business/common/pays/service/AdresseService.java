package com.tyba.appentix.business.common.pays.service;

import java.util.List;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.Pays;
import com.tyba.technicalServices.web.SearchConfig;

public interface AdresseService {
	
	public Adresse findById(Long id) ;
	public List<Adresse> findByCriteria( String detail,
			String ville, SearchConfig config, String sortField,
			String sortOrde) ;
	public List<Adresse> findVilleByIdPays(Long id);
	public List<Adresse> findAll();
		

}
