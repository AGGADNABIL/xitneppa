package com.tyba.appentix.web.parametrage.search;

import java.io.Serializable;


public class TypeMaterielCriteria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4566293229457649770L;

	  private String reference;
	  private String libelle;
	  private String description;
	  
	  
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	  
	  
	
}
