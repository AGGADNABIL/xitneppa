package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;

public class ProfilAccCriteria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeProAcc;
    private String libPro;
    

	public String getLibPro() {
		return libPro;
	}
	public void setLibPro(String libPro) {
		this.libPro = libPro;
	}
	public String getCodeProAcc() {
		return codeProAcc;
	}
	public void setCodeProAcc(String codeProAcc) {
		this.codeProAcc = codeProAcc;
	}
    
    
}
