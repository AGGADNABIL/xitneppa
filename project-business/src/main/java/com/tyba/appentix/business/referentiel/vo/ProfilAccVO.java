package com.tyba.appentix.business.referentiel.vo;


import com.sun.istack.NotNull;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.appentix.business.referentiel.vo.transformer.ProfilAccVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class ProfilAccVO implements ValueObject, ISearchResultVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	    @NotNull
		private Long id;
		private String codeProAcc;
	    private String libPro;
	    private String typePro;
	    private EntityStatus statut;

	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<ProfilAcc, ProfilAccVO> getTransformer() {
		// TODO Auto-generated method stub
		return new ProfilAccVOTransformer();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getLibPro() {
		return libPro;
	}

	public void setLibPro(String libPro) {
		this.libPro = libPro;
	}

	public String getTypePro() {
		return typePro;
	}

	public void setTypePro(String typePro) {
		this.typePro = typePro;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	public String getCodeProAcc() {
		return codeProAcc;
	}

	public void setCodeProAcc(String codeProAcc) {
		this.codeProAcc = codeProAcc;
	}

}
