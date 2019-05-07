package com.tyba.technicalServices.validation;

import java.util.List;

/**
 * service de validation basé sur les annotations JSR303
 * @author @TYBASOFT
 *
 */

public interface ValidationManager<T> {
	List<ValidationError> validate(T bean);
	
}
