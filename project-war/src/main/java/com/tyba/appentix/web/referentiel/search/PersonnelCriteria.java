package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;
import java.util.Date;

public class PersonnelCriteria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	    private Long id;		
	    private String numEmploi;
	    private String nomNaissance;
	    private String prenom;
	    private String matr;
	    private Date dateNaissance;


	
	    
	    
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
		public String getMatr() {
			return matr;
		}
		public void setMatr(String matr) {
			this.matr = matr;
		}
		public Date getDateNaissance() {
			return dateNaissance;
		}
		public void setDateNaissance(Date dateNaissance) {
			this.dateNaissance = dateNaissance;
		}
}
