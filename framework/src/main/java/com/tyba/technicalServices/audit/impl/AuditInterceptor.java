package com.tyba.technicalServices.audit.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.tyba.technicalServices.core.UserContext;
import com.tyba.technicalServices.spring.BeansLookuper;

public class AuditInterceptor extends  EmptyInterceptor
	//implements BeanFactoryAware, InitializingBean, DisposableBean {
	implements InitializingBean, DisposableBean {


	private AuditDaoJpa dao;
//	private BeanFactory factory;

	private Set<TraceEntity> requests = new HashSet<TraceEntity>();
	
	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) throws CallbackException {

		System.out.println("onSave");

		if (entity instanceof ITracable) {
			String tracableafter = null;
			String userID = UserContext.getClientParameters().getUser().getCode();
			TraceEntity traceEntity = getTraceEntity(AuditAction.CREATE,
					((ITracable) entity).getId(),
					((ITracable) entity).getTraceInfo(),((ITracable) entity).getNameEntity(), null, userID);
			requests.add(traceEntity);
		}
		return false;
	}
	//TODO
	public boolean onFlushDirty(Object entity, Serializable id,
			Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) throws CallbackException {

		System.out.println("onFlushDirty");

		if (entity instanceof ITracable) {
			//TODO
			String tracableafter = null;
			String userID = UserContext.getClientParameters().getUser().getCode();
			TraceEntity traceEntity = getTraceEntity(AuditAction.UPDATE,
					((ITracable) entity).getId(),
					((ITracable) entity).getTraceInfo(), ((ITracable) entity).getNameEntity(),tracableafter, userID);
			requests.add(traceEntity);
		}
		return false;
	}

	public void onDelete(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {

		System.out.println("onDelete");

		if (entity instanceof ITracable) {
			String tracableafter = null;
			String userID = UserContext.getClientParameters().getUser().getCode();
			TraceEntity traceEntity = getTraceEntity(AuditAction.DELETE,
					((ITracable) entity).getId(),
					((ITracable) entity).getTraceInfo(),((ITracable) entity).getNameEntity(), null, userID);
			requests.add(traceEntity);
		}
	}

	// called before commit into database
	public void preFlush(Iterator iterator) {
		System.out.println("preFlush");
	}

	// called after committed into database
//	public void postFlush(Iterator iterator) {
	public void  beforeTransactionCompletion(Transaction tx) {
		//dao = (AuditDaoJpa)factory.getBean("auditDAO");
		dao = (AuditDaoJpa)BeansLookuper.lookup("auditDAO"); 
//		dao.setEm((EntityManager)UserContext.getEm());
		System.out.println("postFlush");

		try {

			for (Iterator<TraceEntity> it = requests.iterator(); it.hasNext();) {
				TraceEntity traceEntity = it.next();
				System.out.println("postFlush - insert");
				dao.insert(traceEntity);
			}
//			dao.getEm().flush();
		} 
		catch(Throwable t){
			t.printStackTrace();
		}
		finally {
			requests.clear();

		}
	}

	public AuditDaoJpa getDao() {
		return dao;
	}

	public void setDao(AuditDaoJpa dao) {
		this.dao = dao;
	}

	private static TraceEntity getTraceEntity(int action, Long id,
			String tracablebefore, String nameEntity, String tracableafter, String userID) {

		TraceEntity traceEntity = new TraceEntity();
		traceEntity.setAction(action);
		traceEntity.setIdEntity(id);
		traceEntity.setTraceInfoIn(tracablebefore);
		traceEntity.setTraceInfoOut(tracableafter);
		traceEntity.setUserID(userID);
		traceEntity.setActionWhen(new Date());
		traceEntity.setNameEntity(nameEntity);
		return traceEntity;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
	}

	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub	
	}

	
//	public void setBeanFactory(BeanFactory factory) throws BeansException {
//		this.factory = factory;
//	}
//	
	
}
