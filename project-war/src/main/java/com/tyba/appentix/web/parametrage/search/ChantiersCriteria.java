package com.tyba.appentix.web.parametrage.search;

import java.io.Serializable;

public class ChantiersCriteria implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private String reference ;
	private String nom ;
	private String description ;
	private String date_debut;
	private String date_fin;
	private String responsable;
	private String nombre_employe;
	private String budget ;
	private String etat;
	private Long idVille;
	
	public ChantiersCriteria() {
		// TODO Auto-generated constructor stub
	}

	
	public Long getIdVille() {
		return idVille;
	}


	public void setIdVille(Long idVille) {
		this.idVille = idVille;
	}


	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getNombre_employe() {
		return nombre_employe;
	}

	public void setNombre_employe(String nombre_employe) {
		this.nombre_employe = nombre_employe;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	

}
