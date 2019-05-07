package com.tyba.appentix.web.common.search;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class AdresseCriteria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String detail ;
	private String ville;
	
	public AdresseCriteria() {
		// TODO Auto-generated constructor stub
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	
	

}
