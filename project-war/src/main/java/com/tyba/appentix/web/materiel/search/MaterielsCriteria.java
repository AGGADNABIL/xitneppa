package com.tyba.appentix.web.materiel.search;

import java.io.Serializable;


public class MaterielsCriteria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4566293229457649770L;
	/**
	 * 
	 */

	  private String referenceMateriel;
	  private String libelleMateriel;
	public String getReferenceMateriel() {
		return referenceMateriel;
	}
	public void setReferenceMateriel(String referenceMateriel) {
		this.referenceMateriel = referenceMateriel;
	}
	public String getLibelleMateriel() {
		return libelleMateriel;
	}
	public void setLibelleMateriel(String libelleMateriel) {
		this.libelleMateriel = libelleMateriel;
	}
	 
	  
	
}
