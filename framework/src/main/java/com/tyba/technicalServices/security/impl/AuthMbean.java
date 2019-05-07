package com.tyba.technicalServices.security.impl;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.tyba.technicalServices.web.UserSessionHelper;
@ManagedBean
@SessionScoped
public class AuthMbean {
	
	private AutorizationManager autorizationManager; 
	
	public AuthMbean() {
		String codeOperateur = UserSessionHelper.getUserConecte().getCode();
		autorizationManager = new AutorizationManager(codeOperateur);
	}
	
	/**
	 * verifier l'acces a un ecran ou bouton specifique
	 * @param code
	 * @return
	 */
	public boolean hasEcran(String codeEcran){
		return autorizationManager.hasEcran(codeEcran);
	}
	/**
	 * verifier l'acces au bouton create
	 * @param code
	 * @return
	 */
	public  boolean hasCreate(String codeEcran){
		return autorizationManager.hasCreate(codeEcran);
	}
	/**
	 * verifier l'acces au bouton update
	 * @param code
	 * @return
	 */
	public  boolean hasUpdate(String codeEcran){
		return autorizationManager.hasUpdate(codeEcran);
	}
	/**
	 * verifier l'acces au bouton delete
	 * @param code
	 * @return
	 */
	public  boolean hasDelete(String codeEcran){
		return autorizationManager.hasSelect(codeEcran);
	}
	/**
	 * verifier l'acces au  bouton select 
	 * @param code
	 * @return
	 */
	public  boolean hasSelect(String codeEcran){
		return autorizationManager.hasSelect(codeEcran);
	}
	
	
	
}
	