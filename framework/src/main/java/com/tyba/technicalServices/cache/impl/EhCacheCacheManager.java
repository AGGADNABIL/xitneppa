package com.tyba.technicalServices.cache.impl;

import java.io.Serializable;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.hibernate.cache.CacheException;

import com.tyba.technicalServices.cache.CacheKey;
import com.tyba.technicalServices.cache.ICacheManager;
import com.tyba.technicalServices.log.ILogger;
import com.tyba.technicalServices.log.impl.SL4JLogger;


/**
 * implementation JBoss Cache
 * 
 * 
 * @version 1.0
 * @author TYBASOFT 
 * 
 */
	public class EhCacheCacheManager implements ICacheManager{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#getCacheObject
	 * (com.tyba.framework.technicalServices.cache2.CacheKey)
	 * 
	 */
	private Cache cache;
	public Cache getCache() {
		return cache;
	}


	public void setCache(Cache cache) {
		this.cache = cache;
	}


	private ILogger logger = SL4JLogger.getInstance(EhCacheCacheManager.class);
	
	public Object getCacheObject(CacheKey cacheKey)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub
		Object cachedObject = null;
		try {
			cachedObject = cache.get(cacheKey);
			if(logger.isDebugEnabled()){
				logger.debug("cacheKey  :" + cacheKey + "cachedObject exist" + (cachedObject == null));
			}
		} catch (IllegalStateException e) {
			logger.error("erreur IllegalStateException getCacheObject", e);
			e.printStackTrace();
		} catch (CacheException e) {
			logger.error("erreur CacheException getCacheObject", e);
			e.printStackTrace();
		}
		if(cachedObject != null){
			return ((Element)cachedObject).getObjectValue();	
		}
		return null;
		
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#putCacheObject
	 * (com.tyba.framework.technicalServices.cache2.CacheKey, java.lang.Object)
	 */
	public void putCacheObject(CacheKey cacheKey, Object cacheObject)
			throws com.tyba.technicalServices.cache.CachingException {
		Element  element = new Element(cacheKey, (Serializable)cacheObject);
		cache.put(element);

	}

	
	public boolean isPresent(CacheKey cacheKey)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#removeCacheObject
	 * (com.tyba.framework.technicalServices.cache2.CacheKey)
	 */
	public void removeCacheObject(CacheKey cacheKey)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub
		cache.remove(cacheKey);
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tyba.framework.technicalServices.cache2.ICacheManager#clear()
	 */
	public void clear()
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub
		try {
			cache.removeAll();
		} catch (IllegalStateException e) {
			logger.error("erreur IllegalStateException clear", e);
			e.printStackTrace();
		} 
	}

}
