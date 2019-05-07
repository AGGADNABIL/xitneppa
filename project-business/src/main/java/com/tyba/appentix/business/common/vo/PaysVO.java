package com.tyba.appentix.business.common.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.vo.transformer.PaysVOTransformer;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.vo.transformer.ChantiersVOTransformer;
import com.tyba.appentix.business.parametrage.vo.transformer.MarquesVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class PaysVO implements ValueObject, ISearchResultVO {

	private static final long serialVersionUID = 1L;
    
	@NotNull
	private Long id ;
	
	@NotNull
	private String nom ;
	
	private EntityStatus statut;
	
	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<Pays,PaysVO> getTransformer() {
		// TODO Auto-generated method stub
		return new PaysVOTransformer();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	
}
