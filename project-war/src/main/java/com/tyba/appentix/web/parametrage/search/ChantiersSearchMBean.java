package com.tyba.appentix.web.parametrage.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class ChantiersSearchMBean extends AbstractSearchMBean {
	private static final long serialVersionUID = 1L;

private ChantiersCriteria chantierCriteria = new ChantiersCriteria();
	
	public ChantiersSearchMBean() {
		
		search = new ChantiersSearch();
		searchCriteria =chantierCriteria;
		initData();
	}
	
	public void initData() {

		chantierCriteria.setBudget(null);
		chantierCriteria.setDate_debut(null);
		chantierCriteria.setDate_fin(null);
		chantierCriteria.setDescription(null);
		chantierCriteria.setEtat(null);
		chantierCriteria.setNombre_employe(null);
		chantierCriteria.setReference(null);
		chantierCriteria.setResponsable(null);
		chantierCriteria.setIdVille(null);
		searchCriteria =  chantierCriteria;
		run();
	}

	public ChantiersCriteria getChantierCriteria() {
		return chantierCriteria;
	}

	public void setChantierCriteria(ChantiersCriteria chantierCriteria) {
		this.chantierCriteria = chantierCriteria;
	}

	
}
