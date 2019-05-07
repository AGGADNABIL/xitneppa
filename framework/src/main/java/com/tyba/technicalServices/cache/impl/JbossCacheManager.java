package com.tyba.technicalServices.cache.impl;

import com.tyba.technicalServices.cache.CacheKey;
import com.tyba.technicalServices.cache.ICacheManager;


/**
 * implementation JBoss Cache
 * 
 * 
 * @version 1.0
 * @author TYBASOFT 
 * 
 */
public class JbossCacheManager implements ICacheManager {
	// private cacheImpl
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#getCacheObject
	 * (com.tyba.framework.technicalServices.cache2.CacheKey)
	 */
	public JbossCacheManager() {
//		Configuration config = new Configuration();
//
//		config.setTransactionManagerLookupClass(GenericTransactionManagerLookup.class
//				.getName());
//
//		config.setIsolationLevel(IsolationLevel.READ_COMMITTED);
//
//		config.setCacheMode(CacheMode.LOCAL);
//
//		config.setLockAcquisitionTimeout(15000);
//
//		CacheFactory factory = new DefaultCacheFactory();
//
//		CacheableMethod cache = factory.createCache(config);
	}

	public Object getCacheObject(CacheKey cacheKey)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#getCacheObject
	 * (com.tyba.framework.technicalServices.cache2.CacheKey, java.lang.String)
	 */
	public Object getCacheObject(CacheKey cacheKey, String region)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#putCacheObject
	 * (com.tyba.framework.technicalServices.cache2.CacheKey, java.lang.Object,
	 * java.lang.String)
	 */
	public void putCacheObject(CacheKey cacheKey, Object cacheObject,
			String regionName)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub

	}


	public boolean isPresent(CacheKey cacheKey)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPresent(CacheKey cacheKey, String regionName)
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

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#removeCacheObject
	 * (com.tyba.framework.technicalServices.cache2.CacheKey, java.lang.String)
	 */
	public void removeCacheObject(CacheKey cacheKey, String regionName)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tyba.framework.technicalServices.cache2.ICacheManager#clear()
	 */
	public void clear()
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.cache2.ICacheManager#clear(java.lang
	 * .String)
	 */
	public void clear(String regionName)
			throws com.tyba.technicalServices.cache.CachingException {
		// TODO Auto-generated method stub

	}

}
