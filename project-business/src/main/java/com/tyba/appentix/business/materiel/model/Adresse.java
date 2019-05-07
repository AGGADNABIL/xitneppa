package com.tyba.appentix.business.materiel.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;
@Entity
@Table(name="ADRESSE")
public class Adresse extends GenericEntity implements ITracable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ADRESSE")
	private Long id;
	
	@Column(name="VILLE")
	private String ville;
	
	@Column(name="DETAILS")
	private String detail;
	@OneToMany(mappedBy="adresse")
	private List<Chantiers> chantiers = new ArrayList<Chantiers>();
	
	public Adresse() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public List<Chantiers> getChantiers() {
		return chantiers;
	}


	public void setChantiers(List<Chantiers> chantiers) {
		this.chantiers = chantiers;
	}


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
