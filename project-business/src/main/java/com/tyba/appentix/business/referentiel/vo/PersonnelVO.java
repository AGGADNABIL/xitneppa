package com.tyba.appentix.business.referentiel.vo;

import java.util.Date;









import com.sun.istack.NotNull;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.business.referentiel.vo.transformer.PersonnelVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class PersonnelVO implements ValueObject, ISearchResultVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7361415929500104684L;

	/**
	 * 
	 */
	@NotNull
    private Long id;
	@NotNull
    private String numEmploi;
	@NotNull
    private String matr;
	@NotNull
    private Date dateEmbauche;
	@NotNull
    private String nomNaissance;
	@NotNull    
    private String prenom;
	
    private String nomMarital;
	@NotNull
    private String sexe;
	@NotNull
    private Date dateNaissance;
	@NotNull
    private String lieuNaissance;
	@NotNull
    private String cni;
	@NotNull
    private Date dateDeliv;
	@NotNull
    private String nationalite;
	@NotNull
    private String email;
	@NotNull
    private String structAffect;
	@NotNull
    private String classification;
	@NotNull
    private String grade;
	@NotNull
    private String categorie;
	@NotNull
    private Date dateExpiration;
	
	private EntityStatus statut;

	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<Personnel, PersonnelVO> getTransformer() {
		return new PersonnelVOTransformer();
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

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	

}
