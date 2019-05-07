package com.tyba.appentix.web.common.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class PaysSearchMBean extends AbstractSearchMBean {
	private static final long serialVersionUID = 1L;

private PaysCriteria paysCriteria = new PaysCriteria();
	
	public PaysSearchMBean() {
		
		search = new PaysSearch();
		searchCriteria =paysCriteria;
		initData();
	}
	
	public void initData() {

		paysCriteria.setNom(null);
		searchCriteria =  paysCriteria;
		run();
	}

	public PaysCriteria getPaysCriteria() {
		return paysCriteria;
	}

	public void setPaysCriteria(PaysCriteria paysCriteria) {
		this.paysCriteria = paysCriteria;
	}

	
	
}
