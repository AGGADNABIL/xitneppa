package com.tyba.technicalServices.core;

import java.io.Serializable;

import com.tyba.technicalServices.dao.impl.GenericEntity;

/**
 * L�interface IValueObject est � impl�menter par les objets � value object �
 * �chang�s entre le client et le core m�tier.
 * 
 * @author TYBASOFT 
 * 
 */
public interface ValueObject extends Serializable {
	ITransformer<? extends GenericEntity, ? extends ValueObject> getTransformer();

}
