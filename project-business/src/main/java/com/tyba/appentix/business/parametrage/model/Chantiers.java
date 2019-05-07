package com.tyba.appentix.business.parametrage.model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;
@Entity 
@Table(name="CHANTIERS")
public class Chantiers extends GenericEntity implements ITracable {
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="chantier_id")
	private Long id ;
	
	@Column(name="REFERENCE")
	private String reference ;
	
	@Column(name="NOM")
	private String nom ;
	
	@Column(name="DESCRIPTION")
	private String description ;
	@Column(name="DATE_DEBUT")
	private Date date_debut;
	
	@Column(name="DATE_FIN")
	private Date date_fin;
	
	@Column(name="RESPONSABLE")
	private String responsable;

	@Column(name="NOMBRE_EMPLOYE")
	private Integer nombre_employe;

	@Column(name="BUDGET")
	private Double budget ;
	
	
	@Column(name="ETAT")
	private Boolean etat;
	
	@Column(name="STATUS")
	@Enumerated(EnumType.STRING)
	private EntityStatus statut;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "chantiers")
	private List<Materiels> materiels = new ArrayList<Materiels>();
	
    @ManyToOne()
	private Adresse adresse;
   
	public Chantiers() {
		// TODO Auto-generated constructor stub
	}
	

	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	
	public void setId(Long chantier_id) {
		this.id = chantier_id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Integer getNombre_employe() {
		return nombre_employe;
	}

	public void setNombre_employe(Integer nombre_employe) {
		this.nombre_employe = nombre_employe;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Boolean getEtat() {
		return etat;
	}


	public void setEtat(Boolean etat) {
		this.etat = etat;
	}


	public List<Materiels> getMateriels() {
		return materiels;
	}


	public void setMateriels(List<Materiels> materiels) {
		this.materiels = materiels;
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
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof Chantiers)) {
	            return false;
	        }
	        Chantiers other = (Chantiers) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }


}
