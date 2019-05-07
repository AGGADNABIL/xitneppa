package com.tyba.appentix.web.common.search;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class PaysCriteria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nom ;
	
	public PaysCriteria() {
		// TODO Auto-generated constructor stub
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
