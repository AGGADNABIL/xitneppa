package com.tyba.appentix.business.common.pays.service;

import java.util.List;

import com.tyba.appentix.business.common.Pays;
import com.tyba.technicalServices.web.SearchConfig;

public interface PaysService {
	
	public Pays findPaysById(Long id) ;
	public List<Pays> findPaysByCriteria(String libelle, SearchConfig config, String sortField,
			String sortOrde) ;
	public List<Pays> findAllPays();
		

}
