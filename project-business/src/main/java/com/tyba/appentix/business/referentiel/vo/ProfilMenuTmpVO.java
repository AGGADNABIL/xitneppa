package com.tyba.appentix.business.referentiel.vo;

import java.math.BigInteger;

import com.sun.istack.NotNull;
import com.tyba.appentix.business.referentiel.model.ProfilMenuTmp;
import com.tyba.appentix.business.referentiel.vo.transformer.ProfilMenuTmpVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class ProfilMenuTmpVO implements ValueObject, ISearchResultVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    
	    @NotNull
	    private Long idProfil;
		@NotNull
	    private String socProMen;
		@NotNull
	    private String codePro;
		@NotNull
	    private String rootMenu;
		@NotNull
	    private String libMenu;
	    private String droit;
	    private String menuMenu;
	    private BigInteger rang;
	    private String forma;
	    private String valid;
	    private String applic;
	    private BigInteger nLevel;

	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	public ITransformer<ProfilMenuTmp, ProfilMenuTmpVO> getTransformer() {
		// TODO Auto-generated method stub
		return new ProfilMenuTmpVOTransformer();
	}

	public Long getIdProfil() {
		return idProfil;
	}

	public void setIdProfil(Long idProfil) {
		this.idProfil = idProfil;
	}

	public String getSocProMen() {
		return socProMen;
	}

	public void setSocProMen(String socProMen) {
		this.socProMen = socProMen;
	}

	public String getCodePro() {
		return codePro;
	}

	public void setCodePro(String codePro) {
		this.codePro = codePro;
	}

	public String getRootMenu() {
		return rootMenu;
	}

	public void setRootMenu(String rootMenu) {
		this.rootMenu = rootMenu;
	}

	public String getLibMenu() {
		return libMenu;
	}

	public void setLibMenu(String libMenu) {
		this.libMenu = libMenu;
	}

	public String getDroit() {
		return droit;
	}

	public void setDroit(String droit) {
		this.droit = droit;
	}

	public String getMenuMenu() {
		return menuMenu;
	}

	public void setMenuMenu(String menuMenu) {
		this.menuMenu = menuMenu;
	}

	public BigInteger getRang() {
		return rang;
	}

	public void setRang(BigInteger rang) {
		this.rang = rang;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getApplic() {
		return applic;
	}

	public void setApplic(String applic) {
		this.applic = applic;
	}

	public BigInteger getnLevel() {
		return nLevel;
	}

	public void setnLevel(BigInteger nLevel) {
		this.nLevel = nLevel;
	}

}
