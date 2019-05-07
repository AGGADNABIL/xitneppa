package com.tyba.technicalServices.cache;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.tyba.technicalServices.log.ILogger;
import com.tyba.technicalServices.log.impl.SL4JLogger;
/**
 * a
 * @author @TYBASOFT
 *
 */
@Aspect
public class MethodCacheInterceptor {
	
	private ICacheManager cacheManager;
    
    /** logger for MethodCachingInterceptor */
	private ILogger logger = SL4JLogger.getInstance(MethodCacheInterceptor.class);
    
	@Around("@annotation(CacheableMethod)")
	public Object cachedObject(ProceedingJoinPoint pjp) throws Throwable {
	
        String targetMethodName = pjp.getSignature().getName();
        String clazz = pjp.getTarget().getClass().getName();
    	Object[] methodArgs = pjp.getArgs();

    	CacheKey cacheKey = new CacheKey(clazz, targetMethodName, methodArgs);
    	Object methodReturn;
    	
    	synchronized (this) {
    		methodReturn = cacheManager.getCacheObject(cacheKey);
            if(methodReturn == null){
            	methodReturn = pjp.proceed();
            	cacheManager.putCacheObject(cacheKey, methodReturn);
            }	
    	}
    	
    	return methodReturn;
    }
    
    /**
     * @return the cacheManager
     */
    public ICacheManager getCacheManager() {
        return cacheManager;
    }
    
    /**
     * @param cacheManager
     *          the cacheManager to set
     */
    public void setCacheManager(ICacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

}
