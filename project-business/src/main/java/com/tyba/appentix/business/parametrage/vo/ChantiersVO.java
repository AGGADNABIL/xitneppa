package com.tyba.appentix.business.parametrage.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.common.vo.AdresseVO;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.vo.transformer.ChantiersVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class ChantiersVO implements ValueObject, ISearchResultVO {

	private static final long serialVersionUID = 1L;
    
	@NotNull
	private Long id ;
	
	@NotNull
	private String reference ;
	
	@NotNull
	private String nom ;
	
	//@NotNull
	private String description ;
	
	@NotNull
    private Date date_debut;
	
	@NotNull
	private Date date_fin;
	
	@NotNull
	private String responsable;
    
	@NotNull
	private Integer nombre_employe;
    
	@NotNull
	private Double budget ;
	
	//@NotNull
	private Adresse adresse;
	
	@NotNull
	private Boolean etat;
	
	private EntityStatus statut;
	
	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<Chantiers,ChantiersVO> getTransformer() {
		// TODO Auto-generated method stub
		return new ChantiersVOTransformer();
	}
	
	

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long chantier_id) {
		this.id = chantier_id;
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

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Integer getNombre_employe() {
		return nombre_employe;
	}

	public void setNombre_employe(Integer nombre_employe) {
		this.nombre_employe = nombre_employe;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	
}
