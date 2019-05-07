package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;


public class ServicesCriteria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4566293229457649770L;
	/**
	 * 
	 */

	  private String codeService;
	  private String libelleService;
	  private String codeCateg;
	  
	  
	public String getCodeService() {
		return codeService;
	}
	public void setCodeService(String codeService) {
		this.codeService = codeService;
	}
	public String getLibelleService() {
		return libelleService;
	}
	public void setLibelleService(String libelleService) {
		this.libelleService = libelleService;
	}
	public String getCodeCateg() {
		return codeCateg;
	}
	public void setCodeCateg(String codeCateg) {
		this.codeCateg = codeCateg;
	}
}
