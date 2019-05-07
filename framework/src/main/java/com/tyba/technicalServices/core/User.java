package com.tyba.technicalServices.core;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 783358076185183527L;
	
	private String id;
	
	private String code;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public User(String id, String code) {
		super();
		this.id = id;
		this.code = code;
	}
	public User() {		
	}
	
}
