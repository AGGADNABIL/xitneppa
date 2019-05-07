package com.tyba.appentix.business.referentiel.model;


import java.util.Date;

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
@Table(name = "PERSONNEL")
@TableGenerator(name = "PkGen", table = "sequence_generator", pkColumnName = "GEN_NAME", pkColumnValue = "PERSONNEL_Gen", valueColumnName = "GEN_VALUE", initialValue = 0, allocationSize = 1)

public class Personnel extends GenericEntity implements ITracable {
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -5344737491261577792L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen")
	@Column(name = "id")
    private Long id;
	
    @Column(name = "NUM_EMPLOI" ,length = 11, nullable=false)
    private String numEmploi;
    
    @Column(name = "MATR" ,length = 8, nullable=false)
    private String matr;
    
    @Column(name = "DATE_EMBAUCHE",nullable=false)
    private Date dateEmbauche;
    
    @Column(name = "NOM_NAISSANCE",length = 40, nullable=false)
    private String nomNaissance;
    
    @Column(name = "PRENOM",length = 50, nullable=false)
    private String prenom;
    
    @Column(name = "NOM_MARITAL",length = 30)
    private String nomMarital;
    
    @Column(name = "SEXE",length = 1, nullable=false)
    private String sexe;
    
    @Column(name = "DATE_NAISSANCE" ,nullable=false)
    private Date dateNaissance;
    
    @Column(name = "LIEU_NAISSANCE",length = 1, nullable=false)
    private String lieuNaissance;
    
    @Column(name = "CNI",length = 14, nullable=false)
    private String cni;
    
    @Column(name = "DATE_DELIV", nullable=false)
    private Date dateDeliv;
    
    @Column(name = "NATIONALITE",length = 40, nullable=false)
    private String nationalite;
    
    @Column(name = "EMAIL",length = 80, nullable=false)
    private String email;
    
    @Column(name = "STRUCT_AFFECT",length = 100, nullable=false)
    private String structAffect;
    
    @Column(name = "CLASSIFICATION",length = 30, nullable=false)
    private String classification;
    
    @Column(name = "GRADE",length = 30, nullable=false)
    private String grade;
    
    @Column(name = "CATEGORIE",length = 10)
    private String categorie;

    @Column(name = "DATE_EXPIRATION", nullable=false)
    private Date dateExpiration;
    
    @Column(name = "STATUT")
    @Enumerated(EnumType.STRING)
    private EntityStatus statut;

    public Personnel() {
    }

    public Personnel(Long id) {
        this.id = id;
    }

    public Personnel(Long id, String numEmploi, String matr, Date dateEmbauche, String nomNaissance, String prenom, String sexe, Date dateNaissance, String lieuNaissance, String cni, Date dateDeliv, String nationalite, String email, String structAffect, String classification, String grade, Date dateExpiration) {
        this.id = id;
        this.numEmploi = numEmploi;
        this.matr = matr;
        this.dateEmbauche = dateEmbauche;
        this.nomNaissance = nomNaissance;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.cni = cni;
        this.dateDeliv = dateDeliv;
        this.nationalite = nationalite;
        this.email = email;
        this.structAffect = structAffect;
        this.classification = classification;
        this.grade = grade;
        this.dateExpiration = dateExpiration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumEmploi() {
        return numEmploi;
    }

    public void setNumEmploi(String numEmploi) {
        this.numEmploi = numEmploi;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getNomNaissance() {
        return nomNaissance;
    }

    public void setNomNaissance(String nomNaissance) {
        this.nomNaissance = nomNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomMarital() {
        return nomMarital;
    }

    public void setNomMarital(String nomMarital) {
        this.nomMarital = nomMarital;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public Date getDateDeliv() {
        return dateDeliv;
    }

    public void setDateDeliv(Date dateDeliv) {
        this.dateDeliv = dateDeliv;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStructAffect() {
        return structAffect;
    }

    public void setStructAffect(String structAffect) {
        this.structAffect = structAffect;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
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
        if (!(object instanceof Personnel)) {
            return false;
        }
        Personnel other = (Personnel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tyba.ucad.model.Personnel[ id=" + id + " ]";
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
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
