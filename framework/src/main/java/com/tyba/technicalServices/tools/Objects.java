package com.tyba.technicalServices.tools;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.tyba.technicalServices.cache.impl.EhCacheCacheManager;
import com.tyba.technicalServices.log.ILogger;
import com.tyba.technicalServices.log.impl.SL4JLogger;

public class Objects {
	private static ILogger logger = SL4JLogger.getInstance(EhCacheCacheManager.class);
	/**
     * Helps to avoid using {@code @SuppressWarnings({"unchecked"})} when casting to a generic type.
     * See http://stackoverflow.com/questions/509076/how-do-i-address-unchecked-cast-warnings/509230#509230
     */
    @SuppressWarnings({"unchecked"})
    public static <T> T uncheckedCast(Object obj) {
        return (T) obj;
    }
    
    
    public static void copyProperties(Object dest, Object src){
    	
    	try {
			
    		BeanUtils.copyProperties(dest, src);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
		}
    }
    

}
