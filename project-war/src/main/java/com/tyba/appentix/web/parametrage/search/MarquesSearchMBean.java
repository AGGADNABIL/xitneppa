package com.tyba.appentix.web.parametrage.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class MarquesSearchMBean extends AbstractSearchMBean {
	private static final long serialVersionUID = 1L;

private MarquesCriteria marqueCriteria = new MarquesCriteria();
	
	public MarquesSearchMBean() {
		
		search = new MarquesSearch();
		searchCriteria =marqueCriteria;
		initData();
	}
	
	public void initData() {

		marqueCriteria.setLibelle(null);
		marqueCriteria.setDescription(null);
		
		searchCriteria =  marqueCriteria;
		run();
	}

	public MarquesCriteria getMarqueCriteria() {
		return marqueCriteria;
	}

	public void setMarqueCriteria(MarquesCriteria marqueCriteria) {
		this.marqueCriteria = marqueCriteria;
	}

	
	
}
