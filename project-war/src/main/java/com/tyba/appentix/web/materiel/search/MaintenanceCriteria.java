package com.tyba.appentix.web.materiel.search;

import java.io.Serializable;
import java.util.Date;

public class MaintenanceCriteria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4566293229457649770L;
	/**
	 * 
	 */
	private Long id;
	private String materiel;
	private String motif;
	private String centreMaintenance;
	private String technicien;
	private Double frais;
	private Date dateDebut;
	private Date dateFin;
	private Integer duree;
	private String rapport;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMateriel() {
		return materiel;
	}
	public void setMateriel(String materiel) {
		this.materiel = materiel;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public String getCentreMaintenance() {
		return centreMaintenance;
	}
	public void setCentreMaintenance(String centreMaintenance) {
		this.centreMaintenance = centreMaintenance;
	}
	public String getTechnicien() {
		return technicien;
	}
	public void setTechnicien(String technicien) {
		this.technicien = technicien;
	}
	public Double getFrais() {
		return frais;
	}
	public void setFrais(Double frais) {
		this.frais = frais;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	public String getRapport() {
		return rapport;
	}
	public void setRapport(String rapport) {
		this.rapport = rapport;
	}

	
	
	
	
}
