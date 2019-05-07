package com.tyba.technicalServices.web;

import com.tyba.technicalServices.core.User;

public class UserSessionHelper {
	
	public static User getUserConecte(){
		UserSession userSession =  (UserSession)JSFUtils.getSession("userSession");
		return userSession.getUserConecte();
	}
}
