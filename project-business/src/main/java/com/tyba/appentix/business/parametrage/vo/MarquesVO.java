package com.tyba.appentix.business.parametrage.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.vo.transformer.ChantiersVOTransformer;
import com.tyba.appentix.business.parametrage.vo.transformer.MarquesVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class MarquesVO implements ValueObject, ISearchResultVO {

	private static final long serialVersionUID = 1L;
    
	@NotNull
	private Long id ;
	
	@NotNull
	private String libelle ;
	
	@NotNull
	private String description ;
	
	
	
	private EntityStatus statut;
	
	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<Marques,MarquesVO> getTransformer() {
		// TODO Auto-generated method stub
		return new MarquesVOTransformer();
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

	public void setId(Long id) {
		this.id = id;
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
