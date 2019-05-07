/*
* LoginMBean.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.web.security;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.appentix.web.referentiel.ReferentielSrvPresentation;
import com.tyba.technicalServices.core.User;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;
import com.tyba.technicalServices.web.UserSession;

@ManagedBean
@SessionScoped
public class LoginMBean extends BaseMBean {
	
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3321709864106072685L;
	
	/** The user name. */
	private String userName;
	
	/** The password. */
	private String password;

	/**
	 * Do login.
	 *
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ServletException the servlet exception
	 */
	public String doLogin() throws IOException, ServletException {
		AuthenticationManager authenticationManager = (AuthenticationManager) BeansLookuper
				.lookup("authenticationManager");
		try {
			Authentication request = new UsernamePasswordAuthenticationToken(
					this.getUserName(), getPassword());
			Authentication result = authenticationManager.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
			
		} catch (AuthenticationException e) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Login or password incorrect."));
			return null;
		}
		// create bean UerSession
		UserSession userSesion = new UserSession();
		User user = new User();
		user.setCode(userName);
		userSesion.setUserConecte(user);
		// SAVE PROFIL
		String profil=whatProfil(userName);
		userSesion.setProfil(profil);
		JSFUtils.putSession("userSession", userSesion);
		return "loginSuccess";
	}
	
	public String whatProfil(String user){
		
		ReferentielSrvPresentation referentielService = (ReferentielSrvPresentation) BeansLookuper
				.lookup("referentielSrvPresentation");
		
		UserEntityVO usr= referentielService.findUserById(user);
		String profil = usr.getProfil();
		
		
		return profil;
	}
	public String logout() {
	    ((HttpSession) FacesContext.getCurrentInstance().getExternalContext()
	         .getSession(true)).invalidate();
	     return "homePage";
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

}
