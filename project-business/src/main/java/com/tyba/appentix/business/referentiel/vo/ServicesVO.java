package com.tyba.appentix.business.referentiel.vo;

import com.sun.istack.NotNull;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.vo.transformer.ServicesVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class ServicesVO implements ValueObject, ISearchResultVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
    private Long id;
	@NotNull
    private String codeService;
	@NotNull
    private String libelleService;
	
	private EntityStatus statut;


	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ITransformer<Services, ServicesVO> getTransformer() {
		// TODO Auto-generated method stub
		return new ServicesVOTransformer();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeService() {
		return codeService;
	}

	public void setCodeService(String codeService) {
		this.codeService = codeService;
	}

	public String getLibelleService() {
		return libelleService;
	}

	public void setLibelleService(String libelleService) {
		this.libelleService = libelleService;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

}
