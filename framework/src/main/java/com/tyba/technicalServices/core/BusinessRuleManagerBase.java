package com.tyba.technicalServices.core;

import com.tyba.technicalServices.dao.impl.GenericEntity;

public abstract class BusinessRuleManagerBase implements IBusinessRuleManager{
	/**
	 * #amtarji ajout de sousCommand
	 */
	protected String sousCommand = UserContext.getClientParameters().getSousCommand();
	protected String command = UserContext.getClientParameters().getCommand();
	protected String domaine = UserContext.getClientParameters().getDomaine();
	protected GenericEntity subject = (GenericEntity)UserContext.getSubject();
}
