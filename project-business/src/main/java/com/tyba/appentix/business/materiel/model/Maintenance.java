package com.tyba.appentix.business.materiel.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;

/**
 * 
 * @author Aimad MAJDOU
 * 
 */
@Entity
@Table(name = "MAINTENANCE")
public class Maintenance extends GenericEntity implements ITracable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	// TODO Object Materiel
	@Column(name = "MATERIEL")
	private String materiel;
	@Column(name = "MOTIF")
	private String motif;
	@Column(name = "CENTRE_MAINTENANCE")
	private String centreMaintenance;
	@Column(name = "TECHNICIEN")
	// TODO Object Technicien
	private String technicien;
	@Column(name = "FRAIS")
	private Double frais;
	@Column(name = "DATE_DEBUT")
	private Date dateDebut;
	@Column(name = "DATE_FIN")
	private Date dateFin;
	@Column(name = "DUREE")
	private Integer duree;
	@Column(name = "PROBLEME_FREQUENTE")
	private Boolean problemFrequent;
	@Column(name = "RAPPORT", columnDefinition = "TEXT")
	private String rapport;
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUT")
	private EntityStatus statut;

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
	}


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

	public Boolean getProblemFrequent() {
		return problemFrequent;
	}

	public void setProblemFrequent(Boolean problemFrequent) {
		this.problemFrequent = problemFrequent;
	}

	public String getRapport() {
		return rapport;
	}

	public void setRapport(String rapport) {
		this.rapport = rapport;
	}



	public Maintenance(String materiel, String motif, String centreMaintenance,
			String technicien, Double frais, Date dateDebut, Date dateFin,
			Integer duree, Boolean problemFrequent, String rapport,
			EntityStatus statut) {
		super();
		this.materiel = materiel;
		this.motif = motif;
		this.centreMaintenance = centreMaintenance;
		this.technicien = technicien;
		this.frais = frais;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.duree = duree;
		this.problemFrequent = problemFrequent;
		this.rapport = rapport;
		this.statut = statut;
	}

	public Maintenance() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Maintenance)) {
			return false;
		}
		Maintenance other = (Maintenance) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
