package com.tyba.technicalServices.cache;

/**
 * 
 * L'interface main du service de cache Il definit les methodes qui seront
 * implemente par les differents implmentations base sur des 3rd party caching
 * API
 * 
 * 
 * 
 * @version 1.0
 * @author @TYBASOFT 
 */

public interface ICacheManager {

	/**
	 * recuperer un objet du cache a partir du region par defaut retourne null
	 * si l'objet n'existe pas dans le cache.
	 * 
	 * @param cacheKey
	 *            Cache object
	 * @param cacheLoader
	 *            ICacheLoader object
	 * @return cached object
	 * @throws CachingException
	 */
	public Object getCacheObject(CacheKey cacheKey) throws CachingException;

//	/**
//	 * recuperer un objet du cache a partir du region passé en parametre
//	 * retourne null si l'objet n'existe pas dans le cache.
//	 * 
//	 * @param cacheKey
//	 *            Cache object
//	 * @param cacheLoader
//	 *            ICacheLoader object
//	 * @return cached object
//	 * @throws CachingException
//	 */
//	public Object getCacheObject(CacheKey cacheKey, String region)
//			throws CachingException;

	/**
	 * charge l'objet dans la region par defaut dans le cache. .
	 */
	public void putCacheObject(CacheKey cacheKey, Object cacheObject)
			throws CachingException;

//	/**
//	 * charge l'objet dans la region passé en parametre dans le cache. new.
//	 */
//	public void putCacheObject(CacheKey cacheKey, Object cacheObject,
//			String regionName) throws CachingException;
	/**
	 * verifier si l'objet est present dans la region par defaut de cache
	 * @param cacheKey
	 * @return
	 * @throws CachingException
	 */
	public boolean isPresent(CacheKey cacheKey) throws CachingException;
//	/**
//	 * verifier si l'objet est present dans une region de cache 
//	 * @param cacheKey
//	 * @return
//	 * @throws CachingException
//	 */
//	public boolean isPresent(CacheKey cacheKey, String regionName)
//			throws CachingException;

	/**
	 * supprime le cached object a partir du region par defaut.
	 */
	public void removeCacheObject(CacheKey cacheKey) throws CachingException;

//	/**
//	 * supprime le cached object a partir du region passé en parametre.
//	 */
//	public void removeCacheObject(CacheKey cacheKey, String regionName)
//			throws CachingException;

	/**
	 * vide la region par defaut .
	 */
	public void clear() throws CachingException;

//	/**
//	 * vide a regio specifie en parametre cache region.
//	 */
//	public void clear(String regionName) throws CachingException;

}
