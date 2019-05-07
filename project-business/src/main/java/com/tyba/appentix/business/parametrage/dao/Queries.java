/*
 * Queries.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.parametrage.dao;


public interface Queries {

	//String FIND_PAYS_BY_ID="SELECT x FROM Pays x WHERE (?1 is null or x.id =?1)";
	//tring FIND_PAYS_BY_CRIT="SELECT x FROM Pays x WHERE (?1 is null or x.id =?1) where (?2 is null or x.nom like ?2 )";
	//String FIND_ALL_PAYS ="FROM Pays x where x.statut!='DELETED'";
	/** The find pays by criteria. */
//	String FIND_PAYS_BY_CRITERIA = "From Pays x " + " inner join x.devise d "
//			+ " where (?1 is null or x.abreviation like ?1 )"
//			+ " and  (?2 is null or  x.codeAlphanum like ?2)"
//			+ " and  (?3 is null or  x.codeNumerique like ?3)"
//			+ " and  (?4 is null or  x.libelle like ?4)"
//			+ " and  (?5 is null or  d.code like ?5)"
//			+ " and  (?6 is null or  x.statut like ?6)";

//ADRESSE
	String FIND_ADRESSE_BY_ID= "FROM Adresse x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
	String fIND_ADRESSE_BY_LIBELLE="FROM Adresse x where (?1 is null or x.detail like ?1) and x.statut !='DELETED'";
	String FIND_ADRESSE_BY_CRITERIA = "From Adresse x where (?1 is null or x.detail like ?1 )"
			+ " and (?2 is null or x.ville like ?2)"
			+ " and x.statut != 'DELETED'";
	String FIND_ALL_ADRESSE = "FROM Adresse x where x.statut!='DELETED'";
	String FIND_ALL_ADRESSE_BY_ID_PAYS="FROM Adresse x where (x.pays.id like ?1) and x.statut!='DELETED'";

	
	String FIND_TYPE_MATERIEL_BY_ID = "FROM TypeMateriel x where (?1 is null or x.reference like ?1) and x.statut !='DELETED' ";
	String FIND_TYPE_MATERIEL_BY_REFERENCE = "FROM TypeMateriel x where (?1 is null or x.reference like ?1) and x.statut !='DELETED'";
	String FIND_TYPE_MATERIEL_BY_CRITERIA = "From TypeMateriel x where (?1 is null or x.reference like ?1 )"
			+ " and (?2 is null or x.libelle like ?2)"+ " and (?3 is null or x.description like ?3)"
			+ " and x.statut != 'DELETED'";
	String FIND_ALL_TYPE_MATERIEL = "FROM TypeMateriel x where x.statut!='DELETED'";

		//CHANTIERS
	String FIND_CHANTIERS_BY_ID= "FROM Chantiers x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
	String fIND_CHANTIERS_BY_REFERENCE="FROM Chantiers x where (?1 is null or x.reference like ?1) and x.statut !='DELETED'";
	String FIND_CHANTIERS_BY_CRITERIA = "From Chantiers x where (?1 is null or x.reference like ?1 )"
			+ " and (?2 is null or x.nom like ?2)"
			+ " and x.statut != 'DELETED'";
	String FIND_ALL_CHANTIERS = "FROM Chantiers x where x.statut!='DELETED'";
	
	
	//MARQUES
		String FIND_MARQUES_BY_ID= "FROM Marques x where (?1 is null or x.id like ?1) and x.statut !='DELETED' ";
		String fIND_MARQUES_BY_LIBELLE="FROM Marques x where (?1 is null or x.libelle like ?1) and x.statut !='DELETED'";
		String FIND_MARQUES_BY_CRITERIA = "From Marques x where (?1 is null or x.libelle like ?1 )"
				+ " and (?2 is null or x.description like ?2)"
				+ " and x.statut != 'DELETED'";
		String FIND_ALL_MARQUES = "FROM Marques x where x.statut!='DELETED'";
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

	/** The find pays by devise code. */
	String FIND_PAYS_BY_DEVISE_CODE = "SELECT x From Pays x inner join x.devise d"
			+ " where d.code like ?1";
}
