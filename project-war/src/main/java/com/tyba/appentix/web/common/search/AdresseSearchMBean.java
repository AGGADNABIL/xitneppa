package com.tyba.appentix.web.common.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class AdresseSearchMBean extends AbstractSearchMBean {
	private static final long serialVersionUID = 1L;

private AdresseCriteria adresseCriteria = new AdresseCriteria();
	
	public AdresseSearchMBean() {
		
		search = new PaysSearch();
		searchCriteria =adresseCriteria;
		initData();
	}
	
	public void initData() {

		adresseCriteria.setDetail(null);
		adresseCriteria.setVille(null);
		searchCriteria =  adresseCriteria;
		run();
	}

	public AdresseCriteria getAdresseCriteria() {
		return adresseCriteria;
	}

	public void setAdresseCriteria(AdresseCriteria adresseCriteria) {
		this.adresseCriteria = adresseCriteria;
	}

	
	
	
}
