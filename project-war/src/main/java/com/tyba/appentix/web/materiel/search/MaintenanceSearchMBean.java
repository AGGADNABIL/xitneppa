package com.tyba.appentix.web.materiel.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class MaintenanceSearchMBean extends AbstractSearchMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MaintenanceCriteria maintenanceCriteria = new MaintenanceCriteria();
	
	public MaintenanceSearchMBean() {
		
		search = new MaintenanceSearch();
		searchCriteria =maintenanceCriteria;
		initData();
	}
	
	public void initData() {
		maintenanceCriteria.setId(null);
		maintenanceCriteria.setCentreMaintenance(null);
		maintenanceCriteria.setDateDebut(null);
		maintenanceCriteria.setDateFin(null);
		maintenanceCriteria.setDuree(null);
		maintenanceCriteria.setFrais(null);
		maintenanceCriteria.setMateriel(null);
		maintenanceCriteria.setMotif(null);
		maintenanceCriteria.setRapport(null);
		maintenanceCriteria.setTechnicien(null);
		
		searchCriteria =  maintenanceCriteria;
		run();
	}

	public MaintenanceCriteria getMaintenanceCriteria() {
		return maintenanceCriteria;
	}

	public void setMaintenanceCriteria(MaintenanceCriteria maintenanceCriteria) {
		this.maintenanceCriteria = maintenanceCriteria;
	}

	
	

}
