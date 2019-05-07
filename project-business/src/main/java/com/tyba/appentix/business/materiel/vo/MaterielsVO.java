package com.tyba.appentix.business.materiel.vo;

import java.util.Date;








import javax.validation.constraints.NotNull;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.appentix.business.materiel.vo.transformer.MaterielsVOTransformer;
import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

/**
 * 
 * @author Jamal EL BOUROUMI
 *
 */


public class MaterielsVO implements ValueObject, ISearchResultVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
    private Long id;
	
	private String reference;	
	private String libelle;
	private String description;
	private Date dateIdentification;
	private String matricule;
	private String model;
	private String propriete;
	private char etat;
	private String ficheTechnique;
	private String image;
	private String details;
	private TypeMateriel typeMateriel;
	private EntityStatus statut;

	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ITransformer<Materiels, MaterielsVO> getTransformer() {
		// TODO Auto-generated method stub
		return new MaterielsVOTransformer();
	}
	
	






	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	
	


	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}


	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}


	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}
	
	

}
