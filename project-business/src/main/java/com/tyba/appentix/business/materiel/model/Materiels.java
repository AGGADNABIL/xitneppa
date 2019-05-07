package com.tyba.appentix.business.materiel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;











import org.hibernate.annotations.ManyToAny;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;

@Entity
@Table(name = "MATERIEL")
public class Materiels extends GenericEntity implements ITracable {

	/**
	 * 
	 * @author JAMAL EL BOUROUMI
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MATERIEL_ID")
	private Long id;
	@Column(name = "REFERENCE", length = 50)
	private String reference;

	@Column(name = "LIBELLE", length = 50)
	private String libelle;

	@Column(name = "DESCRIPTION", length = 500)
	private String description;
	@Column(name = "DATE_IDENTIFICATION", length = 500)
	private Date dateIdentification;
	@Column(name = "MATRICULE", length = 50)
	private String matricule;
	@Column(name = "MODEL", length = 20)
	private String model;
	@Column(name = "PROPRIETE", length = 20)
	private String propriete;
	@Column(name = "ETAT", length = 1)
	private char etat;
	@Column(name = "FICHE_TECHNIQUE")
	private String ficheTechnique;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "DETAILS")
	private String details;
	@ManyToOne
	private TypeMateriel typeMateriel;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="MATERIEL_CHANTIER", joinColumns={
		@JoinColumn(name="MATERIEL_ID")},inverseJoinColumns={@JoinColumn(name="CHANTIER_ID")})
	private List<Chantiers> chantiers = new ArrayList<Chantiers>();

	@Column(name = "STATUT")
	@Enumerated(EnumType.STRING)
	private EntityStatus statut;

	public Materiels() {
		// TODO Auto-generated constructor stub
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
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

	public Date getDateIdentification() {
		return dateIdentification;
	}

	public void setDateIdentification(Date dateIdentification) {
		this.dateIdentification = dateIdentification;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPropriete() {
		return propriete;
	}

	public void setPropriete(String propriete) {
		this.propriete = propriete;
	}

	public char getEtat() {
		return etat;
	}

	public void setEtat(char etat) {
		this.etat = etat;
	}

	public String getFicheTechnique() {
		return ficheTechnique;
	}

	public void setFicheTechnique(String ficheTechnique) {
		this.ficheTechnique = ficheTechnique;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setId(Long id) {
		this.id = id;
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


	
	public List<Chantiers> getChantiers() {
		return chantiers;
	}

	public void setChantiers(List<Chantiers> chantiers) {
		this.chantiers = chantiers;
	}

	
	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}

	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
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
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Materiels)) {
			return false;
		}
		Materiels other = (Materiels) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}
