/*
 * Queries.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.referentiel.dao;

// TODO: Auto-generated Javadoc
/**
 * requetes JPA QL sttaique.
 * 
 * @author younes
 */
public interface Queries {

	// Pays
	/** The get pays by code. */
	String GET_PAYS_BY_CODE = "SELECT x FROM Pays x WHERE (?1 is null or x.codeAlphanum =?1) and (?2 is null or x.pays =?2) and (?3 is null or x.paysId = ?3)";
	
	/** The find pays by criteria. */
	String FIND_PAYS_BY_CRITERIA = "From Pays x " + " inner join x.devise d "
			+ " where (?1 is null or x.abreviation like ?1 )"
			+ " and  (?2 is null or  x.codeAlphanum like ?2)"
			+ " and  (?3 is null or  x.codeNumerique like ?3)"
			+ " and  (?4 is null or  x.libelle like ?4)"
			+ " and  (?5 is null or  d.code like ?5)"
			+ " and  (?6 is null or  x.statut like ?6)";


String FIND_PAYS_BY_ID="SELECT x FROM Pays x WHERE (?1 is null or x.id =?1)";
	String FIND_PAYS_BY_CRIT="SELECT x FROM Pays x WHERE (?1 is null or x.id =?1) where (?2 is null or x.nom like ?2 )";
	String FIND_ALL_PAYS ="FROM Pays x where x.statut!='DELETED'";
	/** The find pays by criteria. */
	String fIND_PAYS_BY_CRITERIA = "From Pays x " + " inner join x.devise d "
			+ " where (?1 is null or x.abreviation like ?1 )"
			+ " and  (?2 is null or  x.codeAlphanum like ?2)"
			+ " and  (?3 is null or  x.codeNumerique like ?3)"
			+ " and  (?4 is null or  x.libelle like ?4)"
			+ " and  (?5 is null or  d.code like ?5)"
			+ " and  (?6 is null or  x.statut like ?6)";

	/** The find pays by devise code. */
	String FIND_PAYS_BY_DEVISE_CODE = "SELECT x From Pays x inner join x.devise d"
			+ " where d.code like ?1";

	// Devise
	/** The find devise by code. */
	String FIND_DEVISE_BY_CODE = "SELECT x FROM Devise x WHERE (?1 is null or x.code = ?1) ";

	/** The find devise by criteria. */
	
	// Canaux Vente
	/** The find canal vente by criteria. */
	String FIND_CANAL_VENTE_BY_CRITERIA = "From CanalVente x where (?1 is null or x.libelle like ?1 )"
			+ " and (?2 is null or x.description like ?2)";

	// Nationalite
	/** The find nationalite by criteria. */
	String FIND_NATIONALITE_BY_CRITERIA = "From Nationalite x where (?1 is null or x.code like ?1 )"
			+ " and (?2 is null or x.libelle like ?2)"
			+ " and (?3 is null or x.langue like ?3) "
			+ " and (?4 is null or x.statut like ?4)";

	/** The find mode reglement by criteria. */
	String FIND_MODE_REGLEMENT_BY_CRITERIA = "From ModeReglement x where (?1 is null or x.id like ?1 )"
			+ " and (?2 is null or x.libelle like ?2)"
			+ " and  (?3 is null or  x.description like ?3)";

	/** The find nationalite by code. */
	String FIND_NATIONALITE_BY_CODE = "SELECT x FROM Nationalite x WHERE (?1 is null or x.code = ?1)";

	// Nature Depart
	/** The find nature depart by criteria. */
	String FIND_NATURE_DEPART_BY_CRITERIA = "from NatureDepart x where (?1 is null or x.libelle like ?1 )"
			+ " and (?2 is null or x.description like ?2)"
			+ " and (?3 is null or x.statut like ?3)";

	/** The find type depart by criteria. */
	String FIND_TYPE_DEPART_BY_CRITERIA = "from TypeDepart x where (?1 is null or x.libelle like ?1 )"
			+ " and (?2 is null or x.description like ?2)"
			+ " and (?3 is null or x.statut like ?3)";

	/** The find region by criteria. */
	String FIND_REGION_BY_CRITERIA = "from Region x where (?1 is null or x.libelle like ?1 )"
			+ " and (?2 is null or x.responsable like ?2)"
			+ " and (?3 is null or x.statut like ?3)";

	/** The find niveau urgence by criteria. */
	String FIND_NIVEAU_URGENCE_BY_CRITERIA = "from NiveauUrgence x where (?1 is null or x.libelle like ?1 )"
			+ " and (?2 is null or x.description like ?2)"
			+ " and (?3 is null or x.statut like ?3)"
			+ " and (x.statut != 'DELETED' )"
			+ " and (?4 is null or x.langue like ?4)";

	String FIND_CATEGORIE_AUTOCAR_BY_CRITERIA = "from CategorieAutocar x where (?1 is null or x.libelle like ?1 )"
			+ " and (?2 is null or x.description like ?2)"
			+ " and (?3 is null or x.nombrePlace like ?3)"
			+ " and (?4 is null or x.statut like ?4)"
			+ " and (x.statut != 'DELETED' )"
			+ " and (?5 is null or x.langue like ?5)";

	// Type agrement
	String FIND_TYPE_AGREMENT_BY_CRITERIA = "FROM TypeAgrement x where (?1 is null or x.libelle like ?1 )"
			+ " and (?2 is null or x.statut like ?2)";
	
	String FIND_ETUDIANT_BY_CODE = "FROM Etudiants x where ?1 is null or x.idEtudiant like ?1 and x.statut != 'DELETED'";
	
	String FIND_ETUDIANT_BY_CRITERIA = "From Etudiants x where (?1 is null or x.idEtudiant like ?1 )"
			+ " and (?2 is null or x.nomNaissEtudiant like ?2)"
			+ " and (?3 is null or x.prenomEtudiant like ?3) "
			+ " and (?4 is null or x.dateNaissEtudiant like ?4)"
			+ " and x.statut != 'DELETED'";
	
	


	//PERSONNEL
	String FIND_PERSONNEL_BY_CODE="FROM Personnel x where (?1 is null or x.numEmploi like ?1) and x.statut !='DELETED' ";
	String FIND_PERSONNEL_BY_CODE_MATR="FROM Personnel x where (?1 is null or x.numEmploi like ?1) and ( ?2 is null or x.matr like ?2) and x.statut !='DELETED' ";
	String FIND_PERSONNEL_BY_MATR=" FROM Personnel x where (?1 is null or x.matr like ?1) and x.statut !='DELETED'";
	String FIND_PERSONNEL_BY_ID =" FROM Personnel x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
	String FIND_PERSONNEL_BY_CRITERIA = "From Personnel x where (?1 is null or x.numEmploi like ?1 ) "
			+ " and (?2 is null or x.nomNaissance like ?2)"
			+ " and (?3 is null or x.prenom like ?3) "
			+ " and x.statut != 'DELETED'";
    
	// VISITEUR
	String FIND_VISITEUR_BY_ID = "FROM Visiteur x where (?1 is null or x.id like ?1) and x.statut!='DELETED'";

	String FIND_VISITEUR_BY_CRITERIA = "FROM Visiteur x where  (?1 is null or x.cni like ?1)"
			+ " and (?2 is null or x.nomNaissance like ?2) "
			+ " and (?3 is null or x.prenom like ?3)"
			+ " and x.statut != 'DELETED'";
	
	// SERVICES
	String FIND_SERVICES_BY_ID= "FROM Services x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
	String FIND_SERVICES_BY_CODE="FROM Services x where (?1 is null or x.codeService like ?1) and x.statut !='DELETED'";
	String FIND_SERVICES_BY_CRITERIA = "From Services x where (?1 is null or x.codeService like ?1 )"
			+ " and (?2 is null or x.libelleService like ?2)"
			+ " and x.statut != 'DELETED'";
	String FIND_ALL_SERVICES = "FROM Services x where x.statut!='DELETED'";

	

	// Categories
	String FIND_CATEGORIES_BY_ID= "FROM Categories x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
	String FIND_CATEGORIES_BY_CODE="FROM Categories x where (?1 is null or x.codeCateg like ?1) and x.statut !='DELETED' ";
	String FIND_CATEGORIES_BY_CRITERIA = "From Categories x where (?1 is null or x.codeCateg like ?1 )"
			+ " and (?2 is null or x.libelleCateg like ?2)"
			+ " and x.statut != 'DELETED' ";
	String FIND_ALL_CATEGORIES = "FROM Categories x where x.statut!='DELETED' ";
	
	// SERVICES CATEG
		String FIND_SERVCATEG_BY_ID= "FROM ServicesCateg x where (?1 is null or x.id like ?1) and x.statut !='DELETED' order by x.codeService";
		String FIND_SERVCATEG_BY_CODE="FROM ServicesCateg x where (?1 is null or x.codeService like ?1) and x.statut !='DELETED' order by x.codeService";
		String FIND_SERVCATEG_BY_CRITERIA = "From ServicesCateg x where (?1 is null or x.codeService like ?1 )"
				+ " and (?2 is null or x.libelleService like ?2) and (?3 is null or x.codeCateg like ?3)"
				+ " and x.statut != 'DELETED' order by x.codeService";
		String FIND_ALL_SERVCATEG = "FROM ServicesCateg x where x.statut!='DELETED' order by x.codeService";
		String FIND_SERVCATEG_BY_CATEG="FROM ServicesCateg x where (?1 is null or x.codeCateg like ?1) and x.statut !='DELETED' order by x.codeService";


		
      // PMainLevee

		String FIND_MAINLEVEE_BY_ID= "FROM PMainlevee x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
		String FIND_MAINLEVEE_BY_CODE="FROM PMainlevee x where (?1 is null or x.codeMainlevee like ?1) and x.statut !='DELETED' ";
		String FIND_MAINLEVEE_BY_CRITERIA = "From PMainlevee x where (?1 is null or x.codeMainlevee like ?1 )"
				+ " and (?2 is null or x.libelleMainlevee like ?2)"
				+ " and x.statut != 'DELETED' ";
		String FIND_ALL_MAINLEVEE = "FROM PMainlevee x where x.statut!='DELETED' ";
		
		 // POpposition

		String FIND_OPPOSITION_BY_ID= "FROM POpposition x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
		String FIND_OPPOSITION_BY_CODE="FROM POpposition x where (?1 is null or x.codeOpposition like ?1) and x.statut !='DELETED' ";
		String FIND_OPPOSITION_BY_CRITERIA = "From POpposition x where (?1 is null or x.codeOpposition like ?1 )"
				+ " and (?2 is null or x.libelleOpposition like ?2)"
				+ " and x.statut != 'DELETED' ";
		String FIND_ALL_OPPOSITION = "FROM POpposition x where x.statut!='DELETED' ";
		
		//DECLARATIONS OPPOS
		String FIND_DECLARATION_BY_ID= "FROM DeclarationOppos x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
		String FIND_DECLARATION_BY_TYPE="FROM DeclarationOppos x where (?1 is null or x.typeOppos like ?1) and x.statut !='DELETED' ";
		String FIND_DECLARATION_BY_CRITERIA = "From DeclarationOppos x where (?1 is null or x.typeOppos like ?1 )"
				+ " and (?2 is null or x.motif like ?2)"
				+ " and x.statut != 'DELETED' ";
		String FIND_ALL_DECLARATION = "FROM DeclarationOppos x where x.statut!='DELETED' ";
		
		//DECLARATIONS OPPOS
		String FIND_SAISIES_BY_ID= "FROM SaisieMainlevee x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
		String FIND_SAISIES_BY_MOTIF="FROM SaisieMainlevee x where (?1 is null or x.motif like ?1) and x.statut !='DELETED' ";
		String FIND_SAISIES_BY_CRITERIA = "From SaisieMainlevee x where (?1 is null or x.numIdentif like ?1 )"
				+ " and (?2 is null or x.motif like ?2)"
				+ " and x.statut != 'DELETED' ";
		String FIND_ALL_SAISIES = "FROM SaisieMainlevee x where x.statut!='DELETED' ";
		
		// Cycle de vie
		String FIND_CYCLEVIE_BY_ID= "FROM CycleVie x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
		String FIND_CYCLEVIE_BY_CODE="FROM CycleVie x where (?1 is null or x.numPorteur like ?1) and x.statut !='DELETED' ";
		String FIND_CYCLEVIE_BY_CRITERIA = "From CycleVie x where (?1 is null or x.operation like ?1 )"
				+ " and (?2 is null or x.dateOperation like ?2) and (?3 is null or x.operateur like ?3)"
				+ " and x.statut != 'DELETED' ";
		String FIND_ALL_CYCLEVIE = "FROM CycleVie x where x.statut!='DELETED' ";
		
		// PROFILACC
		String FIND_PROFILACC_BY_ID= "FROM ProfilAcc x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
		String FIND_PROFILACC_BY_CODE="FROM ProfilAcc x where (?1 is null or x.codeProAcc like ?1) and x.statut !='DELETED'";
		String FIND_PROFILACC_BY_CRITERIA = "From ProfilAcc x where (?1 is null or x.codeProAcc like ?1 )"
				+ " and (?2 is null or x.libPro like ?2)"
				+ " and x.statut != 'DELETED'";
		String FIND_ALL_PROFILACC = "FROM ProfilAcc x where x.statut!='DELETED'";
		
		//Profil Menu
		String FIND_MENU_BY_PROFIL="FROM ProfilMenu x where (?1 is null or x.codePro like ?1) and x.statut !='DELETED'";
		String FIND_ALL_PROFIL_MENU = "FROM ProfilMenu x where x.statut !='DELETED' order by rang";
		String FIND_PROFILMENU_BY_CRITERIA = "From ProfilMenu x where (?1 is null or x.menuMenu like ?1 )"
				+ " and (?2 is null or x.libMenu like ?2) and (?3 is null or x.rang like ?3) and (?4 is null or x.forma like ?4) and (?5 is null or x.valid like ?5) and (?6 is null or x.droit like ?6)"
				+ " and x.statut != 'DELETED'";
		String FIND_MENU_BY_ROOT="FROM ProfilMenu x where (?1 is null or x.rootMenu like ?1) and (?2 is null or x.codePro like ?2)  and x.statut !='DELETED'";
		String FIND_SUPER_ROOT="FROM ProfilMenu x where (?1 is null or x.codePro like ?1) and x.rootMenu ='0'  and x.statut !='DELETED'";
		String FIND_ROOT_BY_MENU="FROM ProfilMenu x where (?1 is null or x.menuMenu like ?1) and (?2 is null or x.codePro like ?2)  and x.statut !='DELETED'";
         
		// UserEntity
		String FIND_USER_BY_ID= "FROM UserEntity x where (?1 is null or x.username like ?1) and  x.statut !='DELETED'";
		String FIND_USER_BY_PROFIL="FROM UserEntity x where (?1 is null or x.profil like ?1) and  x.statut !='DELETED'";
		String FIND_USER_BY_CRITERIA = "From UserEntity x where (?1 is null or x.username like ?1 )"
				+ " and (?2 is null or x.firstName like ?2)"
				+ " and (?3 is null or x.lastName like ?3) and (?4 is null or x.matr like ?4) and (?5 is null or x.population like ?5) and  x.statut !='DELETED'";
		String FIND_ALL_USERS = "FROM UserEntity x where  x.statut !='DELETED'";
              

		
}
