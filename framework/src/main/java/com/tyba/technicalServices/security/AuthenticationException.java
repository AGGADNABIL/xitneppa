package com.tyba.technicalServices.security;

import com.tyba.technicalServices.exception.FunctionalException;


public class AuthenticationException extends FunctionalException{
	public AuthenticationException() {
		super();
	}

	public AuthenticationException(String message) {
		super(message);		
	}

	public AuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

}
