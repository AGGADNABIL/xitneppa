package com.tyba.appentix.web.referentiel.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class ServicesSearchMBean extends AbstractSearchMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicesCriteria serviceCriteria = new ServicesCriteria();
	
	public ServicesSearchMBean() {
		
		search = new ServicesSearch();
		searchCriteria =serviceCriteria;
		initData();
	}
	
	public void initData() {

		serviceCriteria.setCodeService(null);
		serviceCriteria.setLibelleService(null);
		
		searchCriteria =  serviceCriteria;
		run();
	}

	public ServicesCriteria getServiceCriteria() {
		return serviceCriteria;
	}

	public void setServiceCriteria(ServicesCriteria serviceCriteria) {
		this.serviceCriteria = serviceCriteria;
	}
	

}
