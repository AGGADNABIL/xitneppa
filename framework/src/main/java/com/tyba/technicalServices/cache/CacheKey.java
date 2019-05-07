package com.tyba.technicalServices.cache;

import java.io.Serializable;


/**
 * Cette interface est impléménté par les cached object 
 * il definit la clé du cached object.
 *
 * @version 1.0
 * @author @Younes SOUTEH
 */
public class CacheKey implements Serializable{
	
	private String clazz;
	private String method;
	private Object[] methodArgs;
	private String key;	
	
	/**
	 * constructor
	 * @param clazz
	 * @param method
	 * @param methodArgs
	 */
	public CacheKey(String clazz, String method,Object[] methodArgs) {
		this.clazz = clazz;
		this.method= method;
		this.methodArgs = methodArgs;
		genererKey();
	}
	/**
	 * generate key
	 */
	private void genererKey() {
		StringBuffer SB = new StringBuffer();
		SB.append(clazz + ":" + method);
		if(methodArgs != null){
			SB.append("[");
			 for (int i = 0; i < methodArgs.length - 1; i++) {
				 SB.append(methodArgs[i].toString() + ",");			 
			 }
			 SB.append(methodArgs[methodArgs.length - 1].toString());
			 SB.append("]");
		}
		key = SB.toString(); 
	}

	/**
	 * la cle de l'objet dans le cache
	 * @return
	 * @throws CachingException
	 */ 
	public String getKey() {		 
	 	return key;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return  key.hashCode();		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof CacheKey))  return false;
		CacheKey _key = (CacheKey)obj;
		if (this.getKey().equals(_key.getKey())) {
			return true;
		}
		return false;
	}

}

