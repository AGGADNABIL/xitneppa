package com.tyba.technicalServices.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@NamedQueries({
//		@NamedQuery(name = "LIST_PERMISSION",query = "SELECT w FROM WinMenu w WHERE w.operateur = ?1"),
//})
@Table(name = "winmenuagc")
public class WinMenu {

	@Id
	@Column(name = "AMN_CODE")
	private String code;
	@Column(name = "AMN_LIBELLE")
	private String libelle;
	@Column(name = "AMN_ABREV")
	private String abbrev;
	@Column(name = "AMN_LANGUE")
	private String langue;
	@Column(name = "AMN_OPER")
	private String operateur;
	@Column(name = "AMN_DRTCREAT")
	private boolean droitCreat;
	@Column(name = "AMN_DRTMODIF")
	private boolean droitModif;
	@Column(name = "AMN_DRTSUPPR")
	private boolean droitSuppr;
	@Column(name = "AMN_DRTCNSLT")
	private boolean droitConsult;
	@Column(name = "AMN_ACTIF")
	private boolean actif;
	@Column(name = "AMN_TYPE")
	private String type;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getAbbrev() {
		return abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	
	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	public boolean isDroitCreat() {
		return droitCreat;
	}

	public void setDroitCreat(boolean droitCreat) {
		this.droitCreat = droitCreat;
	}

	public boolean isDroitModif() {
		return droitModif;
	}

	public void setDroitModif(boolean droitModif) {
		this.droitModif = droitModif;
	}

	public boolean isDroitSuppr() {
		return droitSuppr;
	}

	public void setDroitSuppr(boolean droitSuppr) {
		this.droitSuppr = droitSuppr;
	}

	public boolean isDroitConsult() {
		return droitConsult;
	}

	public void setDroitConsult(boolean droitConsult) {
		this.droitConsult = droitConsult;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
