package com.tyba.technicalServices.web;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class UtilsMBean extends BaseMBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void openRapportErreurs(String view, String windowId) {
		JSFUtils.openWindow(view, windowId, 250, 200);
	}
	
}