package com.tyba.appentix.business.materiel.vo;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.appentix.business.materiel.vo.transformer.MaintenanceVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class MaintenanceVO implements ValueObject, ISearchResultVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	private Long id;
	// TODO Object Materiel
	@NotNull
	private String materiel;
	@NotNull
	private String motif;
	@NotNull
	private String centreMaintenance;
	@NotNull
	// TODO Object Technicien
	private String technicien;
	@NotNull
	private Double frais;
	@NotNull
	private Date dateDebut;
	@NotNull
	private Date dateFin;
	@NotNull
	private Integer duree;
	@NotNull
	private Boolean problemFrequent;
	@NotNull
	private String rapport;
	@NotNull
	private EntityStatus statut;


	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ITransformer<Maintenance, MaintenanceVO> getTransformer() {
		// TODO Auto-generated method stub
		return new MaintenanceVOTransformer();
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


	public EntityStatus getStatut() {
		return statut;
	}


	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}


	public MaintenanceVO(Long id, String materiel, String motif,
			String centreMaintenance, String technicien, Double frais,
			Date dateDebut, Date dateFin, Integer duree,
			Boolean problemFrequent, String rapport, EntityStatus statut) {
		super();
		this.id = id;
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

	public MaintenanceVO() {
		// TODO Auto-generated constructor stub
	}
	

}
