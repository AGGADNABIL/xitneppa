package com.tyba.appentix.business.parametrage.vo;

import com.sun.istack.NotNull;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.appentix.business.parametrage.vo.transformer.TypeMaterielVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class TypeMaterielVO implements ValueObject, ISearchResultVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
    private Long typeId;
	@NotNull
    private String reference;
	@NotNull
    private String libelle;
	
	@NotNull
    private String description;
	
	private EntityStatus statut;
	

	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ITransformer<TypeMateriel, TypeMaterielVO> getTransformer() {
		// TODO Auto-generated method stub
		return new TypeMaterielVOTransformer();
	}


	public Long getTypeId() {
		return typeId;
	}


	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}


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


	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	

}
