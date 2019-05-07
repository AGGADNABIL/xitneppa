package com.tyba.technicalServices.core;

import org.springframework.transaction.annotation.Transactional;




/**
 * L�interface IUseCaseController repr�sente l�interface commune � impl�menter
 * par l�ensemble des Uses Cases. Le point d�entr�e de cette interface qui est
 * la m�thode � Result process() � est marqu� avec l�annotation Spring @Transactional
 * pour permettre � Spring de g�rer la transaction applicative.
 * 
 * @author TYBASOFT 
 * 
 */
public interface IUseCaseController {
	/**
	 * Point d'entree pour les Uses Cases
	 * 
	 * @return Result
	 */
	@Transactional
	ProcessResult process();	
	
}
