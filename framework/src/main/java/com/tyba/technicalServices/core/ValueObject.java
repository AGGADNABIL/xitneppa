package com.tyba.technicalServices.core;

import java.io.Serializable;

import com.tyba.technicalServices.dao.impl.GenericEntity;

/**
 * L’interface IValueObject est à implémenter par les objets « value object »
 * échangés entre le client et le core métier.
 * 
 * @author TYBASOFT 
 * 
 */
public interface ValueObject extends Serializable {
	ITransformer<? extends GenericEntity, ? extends ValueObject> getTransformer();

}
