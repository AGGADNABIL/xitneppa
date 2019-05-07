package com.tyba.technicalServices.core;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.tools.DateUtil;

/**
 * Cette classe est une implémentation du pattern GOF « Facade Pattern » elle
 * simplifie l’accès au cœur métier )
*/
public class FacadeControllerImpl implements IFacadeController {
	private ClientParameters clientParameters;

	public FacadeControllerImpl(ClientParameters clientParameters) {
		this.clientParameters = clientParameters;
	}
	
	private void logParams() {
		String ucName = clientParameters.getDomaine() + "_" + clientParameters.getCommand() + "_UC" + "_" + DateUtil.formatCalendarDDMMYYHHMMSSConcat(Calendar.getInstance()); 
		final File ucpf = new File(ucName);
		
		XMLEncoder encoder = null;
		try {
			encoder = new XMLEncoder(new FileOutputStream(ucpf));
			encoder.writeObject(clientParameters);
			encoder.flush();
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			encoder.close();
		}
	}

	
	public ProcessResult useCaseProcess() {
		//logParams();
		String ucName = clientParameters.getDomaine() + "_" + clientParameters.getCommand() + "_UC"; 
		//System.out.println("uc_Name:"+ucName);
		IUseCaseController useCaseController = (IUseCaseController) BeansLookuper.lookup(ucName);
		UserContext.setClientParameters(clientParameters);
		UserContext.setSubject(clientParameters.getVo());
		ProcessResult processResult = useCaseController.process();
//		ProcessResult processResult = new ProcessResult();
//		processResult.addMessage(new ProcessMsg("KEYISMESSAGE1", true)); 
//		processResult.addMessage(new ProcessMsg("KEYNOTMESSAGE2", false));
		return processResult;
		
	}

	

}
