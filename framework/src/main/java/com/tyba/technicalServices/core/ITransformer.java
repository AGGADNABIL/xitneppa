package com.tyba.technicalServices.core;

import java.util.List;

import com.tyba.technicalServices.dao.impl.GenericEntity;

public interface ITransformer<T extends GenericEntity, V extends ValueObject> {

	V model2VO(T model, boolean ...forCombo);
	T vo2Model(V vo);
	List<V> model2VO(List<T> model, boolean ...forCombo);
	List<T> vo2Model(List<V> vo);

}
