package com.tyba.appentix.web.referentiel.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class UserEntitySearchMBean extends AbstractSearchMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserEntityCriteria criteria = new UserEntityCriteria();

    public UserEntitySearchMBean(){
		

		search = new UserEntitySearch();
		searchCriteria =criteria;
		initData();
		
	}
    
    public void initData() {

    	criteria.setFirstName(null);
    	criteria.setLastName(null);
    	criteria.setPassword(null);
    	criteria.setUsername(null);
    	criteria.setPopulation(null);
    	criteria.setProfil(null);
		
		searchCriteria =  criteria;
		run();
	}
	
	public UserEntityCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(UserEntityCriteria criteria) {
		this.criteria = criteria;
	}
	
	
}
