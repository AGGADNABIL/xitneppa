package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;

public class ProfilMenuCriteria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String codePro;
    private String rootMenu;
    private String libMenu;
    private String droit;
    private String menuMenu;
    private String rang;
    private String forma;
    private String valid;
    private String applic;
    private String libAction;
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
	
	
	

}
