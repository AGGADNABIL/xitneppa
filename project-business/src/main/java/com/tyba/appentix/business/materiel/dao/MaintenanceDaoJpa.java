package com.tyba.appentix.business.materiel.dao;


import java.util.Date;
import java.util.List;

import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.technicalServices.dao.GenericDaoJpa;
import com.tyba.technicalServices.web.SearchConfig;

public interface MaintenanceDaoJpa extends GenericDaoJpa<Maintenance, Long> {
	public List<Maintenance> findAll();
	public Maintenance findById(Long code);
	public List<Maintenance> findMaintenanceByCriteria(
			Long id, String materiel, String motif, String centreMaintenance,
			String technicien, Double frais, Date dateDebut, Date dateFin,
			Integer duree, String rapport, SearchConfig config, String sortField, String sortOrder);
}
