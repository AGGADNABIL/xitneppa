package com.tyba.technicalServices.validation.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tyba.technicalServices.validation.ValidationError;
import com.tyba.technicalServices.validation.ValidationManager;

/**
 * service de validation basé sur les annotations JSR303
 * 
 * @author souteh
 * 
 */
@Component("validationManager")
public class ValidationManagerImpl<T> implements ValidationManager<T>  {

	@Autowired (required=false)
	private Validator validator;

	public List<ValidationError> validate(T bean) {

		List<ValidationError> errors = new ArrayList<ValidationError>();

		Set<ConstraintViolation<T>> violations = validator.validate(bean);

		for (ConstraintViolation constraintViolation : violations) {
			ValidationError error = new ValidationError(constraintViolation
					.getPropertyPath().toString(), constraintViolation
					.getPropertyPath().toString(),
					constraintViolation.getMessage());
			errors.add(error);
		}
		return errors;
	}

}
