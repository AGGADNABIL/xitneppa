package com.tyba.appentix.business.parametrage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.parametrage.dao.MarqueDaoJpa;
import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.service.MarqueService;
import com.tyba.technicalServices.web.SearchConfig;
@Service("marqueService")
public class MarquesServiceImpl implements MarqueService{
	
   @Autowired
   private MarqueDaoJpa marqueDaoJpa;
	
	@Override
	public Marques findMarquesById(Long id) {
		// TODO Auto-generated method stub
		return marqueDaoJpa.findById(id);
	}

	@Override
	public List<Marques> findMarquesByCriteria(String libelle,
			String description, SearchConfig config, String sortField,
			String sortOrde) {
		// TODO Auto-generated method stub
		return marqueDaoJpa.findByCriteria(libelle, description, config, sortField,
				sortOrde);
	}

	@Override
	public List<Marques> findAllMarques() {
		// TODO Auto-generated method stub
		return marqueDaoJpa.findAll();
	}

}
