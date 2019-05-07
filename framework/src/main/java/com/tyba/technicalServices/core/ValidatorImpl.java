package com.tyba.technicalServices.core;

import com.tyba.technicalServices.spring.BeansLookuper;

public class ValidatorImpl implements IValidator{

	public ProcessResult doValidationSimple(){
		ValueObject vo = (ValueObject)UserContext.getSubject();
		IVOValidator voValidator = (IVOValidator)BeansLookuper.lookup("VOValidator");
		return voValidator.validate(vo);		
	}
}
