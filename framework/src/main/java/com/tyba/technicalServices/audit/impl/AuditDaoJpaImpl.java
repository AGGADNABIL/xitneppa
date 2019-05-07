package com.tyba.technicalServices.audit.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tyba.technicalServices.dao.impl.GenericDaoJpaImpl;


/**
 * trace DAO implementation
 * 
 * @author Younes SOUTEH
 */
@Repository("auditDAO")
public class AuditDaoJpaImpl extends GenericDaoJpaImpl<TraceEntity, Integer>                              
		implements AuditDaoJpa {



	public List<TraceEntity> findByIdObject(String idObject) {
//		String filter = "WHERE idObject LIKE '%" + idObject + "%' ";
//		Query q = em.createQuery("SELECT X FROM TraceEntity X " + filter
//				+ " ORDER BY when ASC");
//
//		return Objects.uncheckedCast(q.getResultList());

		String queryString = "select x from TraceEntity x where x.idEntity ='" + idObject + "'";
		return getEntityList(queryString);
	}
	@Transactional(propagation = Propagation.REQUIRED)  
	public void insert(TraceEntity traceEntity){
		persist(traceEntity);
	}
	
}