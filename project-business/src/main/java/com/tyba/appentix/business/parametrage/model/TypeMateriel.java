package com.tyba.appentix.business.parametrage.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;

@Entity
public class TypeMateriel extends GenericEntity implements ITracable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id")
	private Long typeId;

	@Column(name = "reference", length = 50)
	private String reference;

	@Column(name = "libelle", length = 50)
	private String libelle;

	@Column(name = "description", length = 500)
	private String description;
	
	@OneToMany(mappedBy = "typeMateriel")
	private List<Materiels> materiels = new ArrayList<Materiels>();
	
	@Column(name = "STATUT")
	@Enumerated(EnumType.STRING)
	private EntityStatus statut;

	public TypeMateriel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeMateriel(Long typeId, String reference, String libelle,
			String description) {
		super();
		this.typeId = typeId;
		this.reference = reference;
		this.libelle = libelle;
		this.description = description;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

}
