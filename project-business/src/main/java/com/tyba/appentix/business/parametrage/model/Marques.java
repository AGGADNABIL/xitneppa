package com.tyba.appentix.business.parametrage.model;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;
@Entity 
@Table(name="MARQUES")
public class Marques extends GenericEntity implements ITracable {
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MARQUE_ID")
	private Long id ;
	
	@Column(name="LIBELLE")
	private String libelle ;
	
	@Column(name="DESCRIPTION")
	private String description ;
	
	@Column(name="STATUS")
	@Enumerated(EnumType.STRING)
	private EntityStatus statut;
	
	
	public Marques() {
		// TODO Auto-generated constructor stub
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
	        if (!(object instanceof Marques)) {
	            return false;
	        }
	        Marques other = (Marques) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }


}
