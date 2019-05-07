package com.tyba.technicalServices.web;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import com.tyba.technicalServices.core.ProcessMsg;
import com.tyba.technicalServices.core.ProcessResult;

public class MessageHelper {
	private static final String PREZ_BUNDLE = "prezmsg";
	private static final String BUS_BUNDLE = "busmsg";

	public static void processPrezMesssage(ProcessResult result) {
		processBusinessMesssage(result, PREZ_BUNDLE);
	}

	public static void processPrezMesssage(ProcessMsg msg, int typeMsg) {
		ProcessResult processResult = new ProcessResult();
		processResult.addMessage(msg);
		processResult.setTypeMessage(typeMsg);
		processPrezMesssage(processResult);
	}

	public static void processBusinessMesssage(ProcessResult result) {
		processBusinessMesssage(result, BUS_BUNDLE);
	}

	private static void processBusinessMesssage(ProcessResult result,
			String bundle) {
		List<ProcessMsg> messages = result.getMessages();
		if (messages != null && !messages.isEmpty()) {
			boolean isError = com.tyba.technicalServices.core.Constantes.TYPE_MESSAGE_ERREUR == result
					.getTypeMessage();
			UserSession userSession = (UserSession) JSFUtils
					.getSession("userSession");
			ReportWebBean reportWebBean = userSession.getReport();
			/**
			 * modificiation pour JSF message #amtarji
			 */
			// List<String> listMessages = new ArrayList<String>();
			Map<Severity, String> listMessages = new HashMap<>();
			if (reportWebBean != null) {
				listMessages = reportWebBean.getListMessages();
				// Réinitialier la liste des messages au niveau du report
				// listMessages = new ArrayList<String>();
				if (listMessages == null) {
					// listMessages = new ArrayList<String>();
					listMessages = new HashMap<>();
				}
			}

			for (ProcessMsg processMsg : messages) {
				/*
				 * suite modificiation pour JSF message #amtarji
				 * */
				String msg = null;
				if (processMsg.isKeyIsMessage()) {
					msg = processMsg.getKey();
				} else {
					msg = getMessage(processMsg, bundle);
				}
				//listMessages.add(msg);
				
				listMessages.put(processMsg.getSeverity(), msg);
			}

			userSession.setReport(new ReportWebBean(listMessages, isError));
		}

	}

	private static String getMessage(ProcessMsg processMsg,
			String resourceBundleKey) {
		return getResourceBundleString(processMsg.getKey(),
				processMsg.getInfos(), resourceBundleKey);
	}

	private static String getResourceBundleString(String resourceBundleKey,
			Object[] params, String bundleName) throws MissingResourceException {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ResourceBundle bundle = facesContext.getApplication()
				.getResourceBundle(facesContext, bundleName);
		String msg = null;
		try {
			String resource = bundle.getString(resourceBundleKey);
			MessageFormat formatter = new MessageFormat(resource);
			msg = formatter.format(params);
		} catch (MissingResourceException ex) {
			System.err.println(" resourceBundleKey : " + resourceBundleKey
					+ " not found " + ex.getMessage());
		} catch (Exception ex) {
			System.err.println(" resourceBundleKey : " + resourceBundleKey
					+ " not found " + ex.getMessage());
		}
		return msg;
	}
}
