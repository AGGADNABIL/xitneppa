package com.tyba.appentix.business.materiel.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tyba.appentix.business.materiel.dao.MaintenanceDaoJpa;
import com.tyba.appentix.business.materiel.dao.Queries;
import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;
import com.tyba.technicalServices.web.SearchConfig;

@Repository
public class MaintenanceDaoImpl extends GenericDaoJpaImpl<Maintenance, Long> implements MaintenanceDaoJpa{

	@Override
	public List<Maintenance> findAll() {
		SearchConfig config = new SearchConfig(); 
		Object[] parameters = new Object[] {};
		String queryString = Queries.FIND_ALL_MAINTENANCE;
		return findByCriteria(queryString,config, parameters);
	}

	@Override
	public Maintenance findById(Long code) {
		List<Maintenance> liste;
		Maintenance m = new Maintenance();
		SearchConfig config = new SearchConfig();
		Object[] parameters = new Object[] { code };
		String queryString = Queries.FIND_MAINTENANCE_BY_ID;
		liste = findByCriteria(queryString,config, parameters);
		if(!liste.isEmpty())
		return  liste.get(0);
		else 
			return m;
	}

	@Override
	public List<Maintenance> findMaintenanceByCriteria(
			Long id, String materiel, String motif, String centreMaintenance,
			String technicien, Double frais, Date dateDebut, Date dateFin,
			Integer duree, String rapport, SearchConfig config, String sortField, String sortOrder) {
		Object[] parameters = new Object[] { id, materiel, motif, centreMaintenance, technicien, frais, dateDebut, dateFin, duree, rapport };
		String queryString = Queries.FIND_MAINTENANCE_BY_CRITERIA;
		queryString += sortField != null ? " order by " + sortField + " "
				+ sortOrder : "";
		return findByCriteria(queryString, config, parameters);
	}

}
