package com.tyba.appentix.business.referentiel.vo;


import com.sun.istack.NotNull;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.referentiel.vo.transformer.ProfilMenuVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.dao.impl.GenericEntity;
import com.tyba.technicalServices.web.ISearchResultVO;

public class ProfilMenuVO implements ValueObject, ISearchResultVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	    @NotNull
	    private Long id;
	    @NotNull
	    private String codePro;
	    @NotNull
	    private String rootMenu;
	    @NotNull
	    private String libMenu;
	    private String droit;
	    @NotNull
	    private String menuMenu;
	    private String rang;
	    private String forma;
	    private String valid;
	    private String applic;
	    private String libAction;
	    private EntityStatus statut;

	
	
	
	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<? extends GenericEntity, ? extends ValueObject> getTransformer() {
		// TODO Auto-generated method stub
		return new ProfilMenuVOTransformer();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
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

	public String getLibAction() {
		return libAction;
	}

	public void setLibAction(String libAction) {
		this.libAction = libAction;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

}
