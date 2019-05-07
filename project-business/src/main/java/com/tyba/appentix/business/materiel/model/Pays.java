package com.tyba.appentix.business.materiel.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;
@Entity
@Table(name="PAYS")
public class Pays extends GenericEntity implements ITracable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PAYS")
	private Long idpays;
	
	@Column(name="NOM_PAYS")
	private String nom;
	
	
	public Pays() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Long getIdpays() {
		return idpays;
	}



	public void setIdpays(Long idpays) {
		this.idpays = idpays;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return idpays;
	}
	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
