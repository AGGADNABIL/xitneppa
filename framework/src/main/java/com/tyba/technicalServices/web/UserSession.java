package com.tyba.technicalServices.web;

import java.io.Serializable;

import com.tyba.technicalServices.core.User;

public class UserSession implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  static String MBEAN_NAME = "userSession";
	private User userConecte;
	private ReportWebBean report;
	private String titreFonctionnalite;
	private String profil;
	
	public User getUserConecte() {
		return userConecte;
	}
	public void setUserConecte(User userConecte) {
		this.userConecte = userConecte;
	}
	public ReportWebBean getReport() {
		return report;
	}
	public void setReport(ReportWebBean reportWebBean) {
		this.report = reportWebBean;
	}
	public String getTitreFonctionnalite() {
		return titreFonctionnalite;
	}
	public void setTitreFonctionnalite(String titreFonctionnalite) {
		this.titreFonctionnalite = titreFonctionnalite;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
		
}
