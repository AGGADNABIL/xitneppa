package com.tyba.technicalServices.cache;

import com.tyba.technicalServices.exception.TechnicalException;


/**
 * Exception qui encapsule les execptions jetés 
 * par le service de cache.
 *
 * @version 1.0
 * @author @TYBASOFT 
 */


public class CachingException extends TechnicalException {

	public CachingException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
}
