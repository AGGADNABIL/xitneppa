/*
 * Constantes.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.referentiel;

// TODO: Auto-generated Javadoc
/**
 * The Interface Constantes.
 * 
 * @version 1.0 24 nov. 2014
 * @author TYBASOFT
 */
public interface Constantes {

	/**
	 * *********************Domaine fonctionnel*****************************
	 * String REFERENTIEL = "01";.
	 */

	String REFERENTIEL = "REFERENTIEL";

	// *************************** commands
	// *****************************************************************
	// **************************************la valeur de la constantes
	// correspond au nom de la classe UC*******
	// centre
	 //VIllE : 
    String COMMAND_GERER_VILLE = "GererPays";
	String SOUS_COMMAND_CREER_VILLE = "creerPays";
	String SOUS_COMMAND_MODIFIER_VILLE = "modifierPays";
	String SOUS_COMMAND_ACTIVER_VILLE = "activerPays";
	String SOUS_COMMAND_DESACTIVER_VILLE = "desactiverPays";
	String SOUS_COMMAND_SUPPRIMER_VILLE = "supprimerPays";
	String SOUS_COMMAND_EDITER_VILLE = "editerPays";
	
	
	String COMMAND_GERER_PAYS = "GererPays";

	/** The sous command creer pays. */
	String SOUS_COMMAND_CREER_PAYS = "creerPays";

	/** The sous command modifier pays. */
	String SOUS_COMMAND_MODIFIER_PAYS = "modifierPays";

	/** The sous command activer pays. */
	String SOUS_COMMAND_ACTIVER_PAYS = "activerPays";

	/** The sous command desactiver pays. */
	String SOUS_COMMAND_DESACTIVER_PAYS = "desactiverPays";

	/** The sous command supprimer pays. */
	String SOUS_COMMAND_SUPPRIMER_PAYS = "supprimerPays";
	String SOUS_COMMAND_EDITER_PAYS = "editerPays";
	


	
	// Devise
	/** The command gerer devise. */
	String COMMAND_GERER_DEVISE = "GererDevise";

	/** The sous command creer devise. */
	String SOUS_COMMAND_CREER_DEVISE = "creerDevise";

	/** The sous command editer devise. */
	String SOUS_COMMAND_EDITER_DEVISE = "editerDevise";

	/** The sous command supprimer devise. */
	String SOUS_COMMAND_SUPPRIMER_DEVISE = "supprimerDevise";

	/** The sous command activer devise. */
	String SOUS_COMMAND_ACTIVER_DEVISE = "activerDevise";

	/** The sous command desactiver devise. */
	String SOUS_COMMAND_DESACTIVER_DEVISE = "desactiverDevise";

	// Canal Vente
	/** The command gerer canal vente. */
	String COMMAND_GERER_CANAL_VENTE = "GererCanalVente";

	/** The sous command creer canal vente. */
	String SOUS_COMMAND_CREER_CANAL_VENTE = "creerCanalVente";

	/** The sous command editer canal vente. */
	String SOUS_COMMAND_EDITER_CANAL_VENTE = "editerCanalVente";

	/** The sous command supprimer canal vente. */
	String SOUS_COMMAND_SUPPRIMER_CANAL_VENTE = "supprimerCanalVente";
	// ModeReglement
	/** The command gerer mode reglment. */
	String COMMAND_GERER_MODE_REGLMENT = "GererModeReglement";

	/** The sous command creer mode reglement. */
	String SOUS_COMMAND_CREER_MODE_REGLEMENT = "creerModeReglement";

	/** The sous command editer mode reglement. */
	String SOUS_COMMAND_EDITER_MODE_REGLEMENT = "editerModeReglement";

	/** The sous command supprimer mode reglement. */
	String SOUS_COMMAND_SUPPRIMER_MODE_REGLEMENT = "supprimerModeReglement";

	/** The sous command activer canal vente. */
	String SOUS_COMMAND_ACTIVER_CANAL_VENTE = "activerCanalVente";

	/** The sous command desactiver canal vente. */
	String SOUS_COMMAND_DESACTIVER_CANAL_VENTE = "desactiverCanalVente";

	// Nationalite
	/** The command gerer nationalite. */
	String COMMAND_GERER_NATIONALITE = "GererNationalite";

	/** The sous command creer nationalite. */
	String SOUS_COMMAND_CREER_NATIONALITE = "creerNationalite";

	/** The sous command editer nationalite. */
	String SOUS_COMMAND_EDITER_NATIONALITE = "editerNationalite";

	/** The sous command supprimer nationalite. */
	String SOUS_COMMAND_SUPPRIMER_NATIONALITE = "supprimerNationalite";

	/** The sous command activer nationalite. */
	String SOUS_COMMAND_ACTIVER_NATIONALITE = "activerNationalite";

	/** The sous command desactiver nationalite. */
	String SOUS_COMMAND_DESACTIVER_NATIONALITE = "desactiverNationalite";

	// Nature Depart
	/** The command gerer nature depart. */
	String COMMAND_GERER_NATURE_DEPART = "GererNatureDepart";

	/** The sous command creer nature depart. */
	String SOUS_COMMAND_CREER_NATURE_DEPART = "creerNatureDepart";

	/** The sous command activer nature depart. */
	String SOUS_COMMAND_ACTIVER_NATURE_DEPART = "activerNatureDepart";

	/** The sous command editer nature depart. */
	String SOUS_COMMAND_EDITER_NATURE_DEPART = "editerNatureDepart";

	/** The sous command desactiver nature depart. */
	String SOUS_COMMAND_DESACTIVER_NATURE_DEPART = "desactiverNatureDepart";

	/** The command gerer type depart. */
	String COMMAND_GERER_TYPE_DEPART = "GererTypeDepart";

	/** The sous command creer type depart. */
	String SOUS_COMMAND_CREER_TYPE_DEPART = "creerTypeDepart";

	/** The sous command editer type depart. */
	String SOUS_COMMAND_EDITER_TYPE_DEPART = "editerTypeDepart";

	/** The sous command activer type depart. */
	String SOUS_COMMAND_ACTIVER_TYPE_DEPART = "activerTypeDepart";

	/** The sous command desactiver type depart. */
	String SOUS_COMMAND_DESACTIVER_TYPE_DEPART = "desactiverTypeDepart";

	/** Region. */
	String COMMAND_GERER_REGION = "GererRegion";

	/** The sous command creer region. */
	String SOUS_COMMAND_CREER_REGION = "creerRegion";

	/** The sous command editer region. */
	String SOUS_COMMAND_EDITER_REGION = "editerRegion";

	/** The sous command activer region. */
	String SOUS_COMMAND_ACTIVER_REGION = "activerRegion";

	/** The sous command desactiver region. */
	String SOUS_COMMAND_DESACTIVER_REGION = "desactiverRegion";

	/** Niveau Urgence */
	String COMMAND_GERER_NIVEAU_URGENCE = "GererNiveauUrgence";
	String SOUS_COMMAND_CREER_NIVEAU_URGENCE = "creerNiveauUrgence";
	String SOUS_COMMAND_EDITER_NIVEAU_URGENCE = "editerNiveauUrgence";
	String SOUS_COMMAND_ACTIVER_NIVEAU_URGENCE = "activerNiveauUrgence";
	String SOUS_COMMAND_DESACTIVER_NIVEAU_URGENCE = "desactiverNiveauUrgence";

	/** Categorie Autocar */
	String COMMAND_GERER_CATEGORIE_AUTOCAR = "GererCategorieAutocar";
	String SOUS_COMMAND_CREER_CATEGORIE_AUTOCAR = "creerCategorieAutocar";
	String SOUS_COMMAND_EDITER_CATEGORIE_AUTOCAR = "editerCategorieAutocar";
	String SOUS_COMMAND_ACTIVER_CATEGORIE_AUTOCAR = "activerCategorieAutocar";
	String SOUS_COMMAND_DESACTIVER_CATEGORIE_AUTOCAR = "desactiverCategorieAutocar";
	String SOUS_COMMAND_SUPPRIMER_CATEGORIE_AUTOCAR = "supprimerCategorieAutocar";
	// Nature aGREMENT
	String COMMAND_GERER_TYPE_AGRMENT = "GererTypeAgrement";
	
	// Etudiants
		/** The command gerer etudiant. */
		String COMMAND_GERER_ETUDIANTS = "GererEtudiants";

		/** The sous command creer etudiant. */
		String SOUS_COMMAND_CREER_ETUDIANTS = "creerEtudiants";

		/** The sous command editer etudiant. */
		String SOUS_COMMAND_EDITER_ETUDIANTS = "editerEtudiants";

		/** The sous command supprimer etudiant. */
		String SOUS_COMMAND_SUPPRIMER_ETUDIANTS = "supprimerEtudiants";
		
	
	// VISTEURS
			/** The command gerer visiteur. */
		String COMMAND_GERER_VISITEUR = "GererVisiteur";

			/** The sous command creer visiteur. */
		String SOUS_COMMAND_CREER_VISITEUR = "creerVisiteur";

				/** The sous command editer visiteur. */
		String SOUS_COMMAND_EDITER_VISITEUR = "editerVisiteur";

				/** The sous command supprimer visiteur. */
		String SOUS_COMMAND_SUPPRIMER_VISITEUR= "supprimerVisiteur";

		// SERVICES
	    String COMMAND_GERER_SERVICES = "GererServices";

	    String SOUS_COMMAND_EDITER_SERVICE = "editerServices";

	    String SOUS_COMMAND_SUPPRIMER_SERVICE = "supprimerServices";

	    String SOUS_COMMAND_CREER_SERVICE = "creerService";
				
	    // SERVICES
	    String COMMAND_GERER_CATEG = "GererCategories";

	    String SOUS_COMMAND_EDITER_CATEG = "editerCategories";

	    String SOUS_COMMAND_SUPPRIMER_CATEG = "supprimerCategories";

	    String SOUS_COMMAND_CREER_CATEG = "creerCategories";


	 // SERVICES CATEG
	    String COMMAND_GERER_SERVCATEG = "GererServicesCateg";

	    String SOUS_COMMAND_EDITER_SERVCATEG = "editerServicesCateg";

	    String SOUS_COMMAND_SUPPRIMER_SERVCATEG = "supprimerServicesCateg";

	    String SOUS_COMMAND_CREER_SERVCATEG = "creerServicesCateg";


	  // POPPOSITION
	    String COMMAND_GERER_POPOSITION = "GererPOpposition";

	    String SOUS_COMMAND_EDITER_POPOSITION = "editerPOpposition";

	    String SOUS_COMMAND_SUPPRIMER_POPPOSITION = "supprimerPOpposition";

	    String SOUS_COMMAND_CREER_POPPOSITION = "creerPOpposition";
	    
	 // PMainlevee
	    String COMMAND_GERER_PMAINLEVEE = "GererPMainlevee";

	    String SOUS_COMMAND_EDITER_PMAINLEVEE = "editerPMainlevee";

	    String SOUS_COMMAND_SUPPRIMER_PMAINLEVEE = "supprimerPMainlevee";

	    String SOUS_COMMAND_CREER_PMAINLEVEE = "creerPMainlevee";
	    
	   //DECLARATION
	    String COMMAND_GERER_DECLARATION="GererDeclarationOppos";
	    String SOUS_COMMAND_CREER_DECLARATION="creerDeclaration";
	    
	    //impression
	    String COMMAND_GERER_IMPRESSION = "GererImpression";
	    String SOUS_COMMAND_GERER_IMPRESSION_ETUDIANT = "GererImpressionEtudiant";
	    String SOUS_COMMAND_GERER_IMPRESSION_PERSONNEL = "GererImpressionPersonnel";
	    String SOUS_COMMAND_GERER_IMPRESSION_VISITEUR = "GererImpressionVisiteur";
	    
	    // PROFIL ACC
	    String COMMAND_GERER_PROFILACC = "GererProfilAcc";

	    String SOUS_COMMAND_EDITER_PROFILACC = "editerProfilAcc";

	    String SOUS_COMMAND_SUPPRIMER_PROFILACC = "supprimerProfilAcc";

	    String SOUS_COMMAND_CREER_PROFILACC = "creerProfilAcc";
	    
	    // PROFIL MENU
	    String COMMAND_GERER_PROFILMENU = "GererProfilMenu";

	    String SOUS_COMMAND_EDITER_PROFILMENU = "editerProfilMenu";

	    String SOUS_COMMAND_SUPPRIMER_PROFILMENU = "supprimerProfilMenu";

	    String SOUS_COMMAND_CREER_PROFILMENU = "creerProfilMenu";
	    
	    // USER
	    String COMMAND_GERER_USER = "GererUser";

	    String SOUS_COMMAND_EDITER_USER = "editerUser";

	    String SOUS_COMMAND_SUPPRIMER_USER = "supprimerUser";

	    String SOUS_COMMAND_CREER_USER = "creerUser";
	    
	    
}
