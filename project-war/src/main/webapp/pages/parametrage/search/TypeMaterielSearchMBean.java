package com.tyba.appentix.web.parametrage.search;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.technicalServices.web.AbstractSearchMBean;

@ManagedBean
@ViewScoped
public class TypeMaterielSearchMBean extends AbstractSearchMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TypeMaterielCriteria typeMaterielCriteria = new TypeMaterielCriteria();
	
	public TypeMaterielSearchMBean() {
		
		search = new TypeMaterielSearch();
		searchCriteria =typeMaterielCriteria;
		initData();
	}
	
	public void initData() {

		typeMaterielCriteria.setReference(null);
		typeMaterielCriteria.setLibelle(null);
		typeMaterielCriteria.setDescription(null);
		
		searchCriteria =  typeMaterielCriteria;
		run();
	}

	public TypeMaterielCriteria getTypeMaterielCriteria() {
		return typeMaterielCriteria;
	}

	public void setTypeMaterielCriteria(TypeMaterielCriteria typeMaterielCriteria) {
		this.typeMaterielCriteria = typeMaterielCriteria;
	}

	

}
