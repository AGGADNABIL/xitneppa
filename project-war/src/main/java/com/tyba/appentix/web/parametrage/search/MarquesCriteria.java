package com.tyba.appentix.web.parametrage.search;

import java.io.Serializable;

public class MarquesCriteria implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private String description ;
	private String libelle ;
	
	
	
	public MarquesCriteria() {
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	

}
