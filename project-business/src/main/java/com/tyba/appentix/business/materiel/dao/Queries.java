/*
 * Queries.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.business.materiel.dao;

// TODO: Auto-generated Javadoc
/**
 * requetes JPA QL sttaique.
 * 
 * @author younes
 */
public interface Queries {


	
	// MATERIELS
	String FIND_MATERIELS_BY_ID= "FROM Materiels x where (?1 is null or x.reference like ?1) and x.statut !='DELETED' ";
	String FIND_MATERIELS_BY_REFERENCE="FROM Materiels x where (?1 is null or x.reference like ?1) and x.statut !='DELETED'";
	String FIND_MATERIELS_BY_CRITERIA = "From Materiels x where (?1 is null or x.reference like ?1 )"
			+ " and (?2 is null or x.libelle like ?2)"
			+ " and x.statut != 'DELETED'";
	String FIND_ALL_MATERIELS = "FROM Materiels x where x.statut!='DELETED'";

		//Maintenance
		String FIND_ALL_MAINTENANCE = "FROM Maintenance x where x.statut!='DELETED'";
		String FIND_MAINTENANCE_BY_CRITERIA = "From Maintenance x where (?1 is null or x.id like ?1 )"
				+ " and (?2 is null or x.materiel like ?2)"
				+ " and (?3 is null or x.motif like ?3)"
				+ " and (?4 is null or x.centreMaintenance like ?4)"
				+ " and (?5 is null or x.technicien like ?5)"
				+ " and (?6 is null or x.frais like ?6)"
				+ " and (?7 is null or x.dateDebut like ?7)"
				+ " and (?8 is null or x.dateFin like ?8)"
				+ " and (?9 is null or x.duree like ?9)"
				+ " and (?10 is null or x.rapport like ?10)"
				+ " and x.statut != 'DELETED'";
				/*String FIND_MAINTENANCE_BY_CRITERIA = "From Maintenance x where (?1 is null or x.materiel like ?1 )"
				+ " and (?2 is null or x.motif like ?2)"
				+ " and x.statut != 'DELETED'";*/
		
		String FIND_MAINTENANCE_BY_ID = "FROM Maintenance x where (?1 is null or x.id like ?1) and  x.statut !='DELETED'";

	

	
		
}
