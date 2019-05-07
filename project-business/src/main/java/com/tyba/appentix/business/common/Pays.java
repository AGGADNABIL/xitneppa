package com.tyba.appentix.business.common;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;

@Entity
@Table(name = "PAYS")
public class Pays extends GenericEntity implements ITracable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PAYS")
	private Long id;

	@Column(name = "NOM_PAYS")
	private String nom;
	
	@Column(name="STATUS")
	@Enumerated(EnumType.STRING)
	private EntityStatus statut;

	@OneToMany(mappedBy = "pays")
	private List<Adresse> adresses;

	public Pays() {
		// TODO Auto-generated constructor stub
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public Adresse addAdresse(Adresse adresse) {
		getAdresses().add(adresse);
		//adresses.setAdresse(this);

		return adresse;
	}

	public Adresse removeAdresse(Adresse adresse) {
		getAdresses().remove(adresse);
		//adresses.setAdresse(null);

		return adresse;
	}

	public void setIdpays(Long idpays) {
		this.id = idpays;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		
		if (!(object instanceof Pays)) {
			return false;
		}
		Pays other = (Pays) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}
