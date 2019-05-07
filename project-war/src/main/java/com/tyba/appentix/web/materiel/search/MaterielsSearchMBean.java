package com.tyba.appentix.web.materiel.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class MaterielsSearchMBean extends AbstractSearchMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MaterielsCriteria serviceCriteria = new MaterielsCriteria();
	
	public MaterielsSearchMBean() {
		
		search = new MaterielsSearch();
		searchCriteria =serviceCriteria;
		initData();
	}
	
	public void initData() {

		serviceCriteria.setReferenceMateriel(null);
		serviceCriteria.setLibelleMateriel(null);
		
		searchCriteria =  serviceCriteria;
		run();
	}

	public MaterielsCriteria getServiceCriteria() {
		return serviceCriteria;
	}

	public void setServiceCriteria(MaterielsCriteria serviceCriteria) {
		this.serviceCriteria = serviceCriteria;
	}
	

}
