package com.tyba.technicalServices.core;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.validation.ValidationError;
import com.tyba.technicalServices.validation.ValidationManager;

@Component("VOValidator")
public class VOValidator implements IVOValidator{
	public ProcessResult validate(ValueObject vo){
		ProcessResult processResult = new ProcessResult();
		ValidationManager validationManager = (ValidationManager)BeansLookuper.lookup("validationManager");
		List<ValidationError> listValidationError = validationManager.validate(vo);
		for(ValidationError validationError: listValidationError){
			String message = validationError.getChamp() +" :" + validationError.getMessage(); 
			//processResult.addMessage(new ProcessMsg(message, true));
		}
		return processResult;
	}
}
