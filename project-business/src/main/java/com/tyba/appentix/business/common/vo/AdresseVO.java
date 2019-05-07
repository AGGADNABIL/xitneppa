package com.tyba.appentix.business.common.vo;



import javax.validation.constraints.NotNull;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.EntityStatus;

import com.tyba.appentix.business.common.vo.transformer.AdresseVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class AdresseVO implements ValueObject, ISearchResultVO {

	private static final long serialVersionUID = 1L;
    
	@NotNull
	private Long id ;
	
	@NotNull
	private String detail ;
	
	@NotNull
	private String ville;
	
	private EntityStatus statut;
	
	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<Adresse,AdresseVO> getTransformer() {
		// TODO Auto-generated method stub
		return new AdresseVOTransformer();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	
}
