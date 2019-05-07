package com.tyba.appentix.business.referentiel.model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;

/**
 *
 * @author oazmani
 */
@Entity
@Table(name = "SERVICES")
@TableGenerator(name = "PkGen", table = "sequence_generator", pkColumnName = "GEN_NAME", pkColumnValue = "SERVICES_Gen", valueColumnName = "GEN_VALUE", initialValue = 0, allocationSize = 1)

public class Services extends GenericEntity implements ITracable {
    private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen")
	@Column(name = "id")
    private Long id;
	
    @Basic(optional = false)
    @Column(name = "CODE_SERVICE")
    private String codeService;
    
    @Basic(optional = false)
    @Column(name = "LIBELLE_SERVICE")
    private String libelleService;

    @Column(name = "STATUT")
    @Enumerated(EnumType.STRING)
    private EntityStatus statut; 
    
    public Services() {
    }

    public Services(Long id) {
        this.id = id;
    }

    public Services(Long id, String codeService, String libelleService) {
        this.id = id;
        this.codeService = codeService;
        this.libelleService = libelleService;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getLibelleService() {
        return libelleService;
    }

    public void setLibelleService(String libelleService) {
        this.libelleService = libelleService;
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
        if (!(object instanceof Services)) {
            return false;
        }
        Services other = (Services) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tyba.ucad.model.Services[ id=" + id + " ]";
    }

	@Override
	public String getTraceInfo() {
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
