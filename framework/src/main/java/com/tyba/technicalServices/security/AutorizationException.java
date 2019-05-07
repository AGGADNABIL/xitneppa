package com.tyba.technicalServices.security;

import com.tyba.technicalServices.exception.FunctionalException;


public class AutorizationException extends FunctionalException{
	public AutorizationException() {
		super();
	}

	public AutorizationException(String message) {
		super(message);		
	}

	public AutorizationException(String message, Throwable cause) {
		super(message, cause);
	}

}
