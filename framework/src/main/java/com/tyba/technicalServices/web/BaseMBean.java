package com.tyba.technicalServices.web;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import com.tyba.technicalServices.core.Constantes;
import com.tyba.technicalServices.core.ProcessMsg;

public class BaseMBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected UserSession userSession = (UserSession) JSFUtils
			.getSession("userSession");
	protected boolean error;

	@PostConstruct
	final void construct() {
		init();
	}

	// a définir
	protected void init() {

	}

	public void clearReport() {
		userSession.setReport(new ReportWebBean());
	}
	
	public void addPrezMsgInfo(String key, String[] infos) {
		ProcessMsg msg = new ProcessMsg(key, infos, FacesMessage.SEVERITY_INFO);
		MessageHelper.processPrezMesssage(msg, Constantes.TYPE_MESSAGE_INFO);
	}

	/**
	 * 
	 * Method pour afficher les messages retourné par la validation métier
	 * amtarji
	 */
	public void feedReport() {
		Map<Severity, String> msgs = userSession.getReport().getListMessages();
		Iterator<Entry<Severity, String>> it = msgs.entrySet().iterator();
		while (it.hasNext()) {

			Map.Entry<Severity, String> pairs = (Map.Entry<Severity, String>) it
					.next();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(pairs.getKey(), pairs.getValue(), null));
			it.remove();
		}

	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}
}
