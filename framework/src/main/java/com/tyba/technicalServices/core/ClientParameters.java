package com.tyba.technicalServices.core;

/**
 * Classe qui regroupe l'ensemble des paramètres d'un UC
 * 
 * @author Younes SOUTEH
 * 
 */
public class ClientParameters {
	private static final long serialVersionUID = 1L;
	private String domaine;
	private String command;
	private String sousCommand;
	private String subCommand;
	private User user;
	private ValueObject vo;
	
	public String getSubCommand() {
		return subCommand;
	}
	public void setSubCommand(String subCommand) {
		this.subCommand = subCommand;
	}
	public ClientParameters(){}
	
	public ClientParameters(String domaine, String command, User user,ValueObject vo) {
		super();
		this.domaine = domaine;
		this.command = command;
		this.user = user;
		this.vo = vo;
	}
	public ClientParameters(String domaine, String command, String sousCommand, User user,ValueObject vo) {
		super();
		this.domaine = domaine;
		this.command = command;
		this.sousCommand = sousCommand;
		this.user = user;
		this.vo = vo;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ValueObject getVo() {
		return vo;
	}
	public void setVo(ValueObject vo) {
		this.vo = vo;
	}
	public String getSousCommand() {
		return sousCommand;
	}
	public void setSousCommand(String sousCommand) {
		this.sousCommand = sousCommand;
	}
	
}
