package com.tyba.technicalServices.web;

import com.tyba.technicalServices.core.ClientParameters;
import com.tyba.technicalServices.core.FacadeControllerImpl;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.User;
import com.tyba.technicalServices.core.ValueObject;

public class BaseBusDelegate {
	protected boolean error;
	protected ProcessResult result;
	protected String domaine;
	
	final protected ValueObject executeCommand(ValueObject vo, String command) {
		User user = UserSessionHelper.getUserConecte();
		ClientParameters clientParameters = new ClientParameters(domaine, command, user,vo);
		
		return execute(clientParameters);
	}
	final protected ValueObject executeCommand(ValueObject vo, String command, String sousCommand) {
		User user = UserSessionHelper.getUserConecte();
		ClientParameters clientParameters = new ClientParameters(domaine, command, sousCommand, user,vo);
		return execute(clientParameters);
	}
	
	
	private ValueObject execute(ClientParameters clientParameters) {
		error = false;
		final ProcessResult result = (new FacadeControllerImpl(clientParameters)).useCaseProcess();
		ValueObject returnVO = null;
		if (result.isMsgError()) {
			error = true;
			this.result = result;
		} else {
			returnVO =  (ValueObject) result.getData();
		}
		MessageHelper.processBusinessMesssage(result);
		return returnVO;
	}
	
}
