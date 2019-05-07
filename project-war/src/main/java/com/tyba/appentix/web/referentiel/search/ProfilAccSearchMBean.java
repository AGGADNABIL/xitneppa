package com.tyba.appentix.web.referentiel.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class ProfilAccSearchMBean extends AbstractSearchMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProfilAccCriteria criteria= new ProfilAccCriteria();
	

	
	public ProfilAccSearchMBean(){
		
		search = new ProfilAccSearch();
		searchCriteria =criteria;
		initData();
	}
	
	public void initData() {

		criteria.setCodeProAcc(null);
		criteria.setLibPro(null);
		
		searchCriteria =  criteria;
		run();
	}
	
	public ProfilAccCriteria getCriteria() {
		return criteria;
	}
	public void setCriteria(ProfilAccCriteria criteria) {
		this.criteria = criteria;
	}

}
