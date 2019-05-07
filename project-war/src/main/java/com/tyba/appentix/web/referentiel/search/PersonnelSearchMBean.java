package com.tyba.appentix.web.referentiel.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class PersonnelSearchMBean extends AbstractSearchMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PersonnelCriteria personnelCriteria= new PersonnelCriteria();
	
	public PersonnelSearchMBean(){
		
		search = new PersonnelSearch();
		searchCriteria =personnelCriteria;
		initData();
	}

	
	public void initData() {

		personnelCriteria.setNumEmploi(null);
		personnelCriteria.setNomNaissance(null);
		personnelCriteria.setPrenom(null);
		personnelCriteria.setId(null);
		searchCriteria =  personnelCriteria;
		run();
	}
	
	public PersonnelCriteria getPersonnelCriteria() {
		return personnelCriteria;
	}

	public void setPersonnelCriteria(PersonnelCriteria personnelCriteria) {
		this.personnelCriteria = personnelCriteria;
	}

}
