/*
* NationalitVOTransformer.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.business.referentiel.vo.transformer;

import com.tyba.appentix.business.referentiel.model.Menus2;
import com.tyba.appentix.business.referentiel.vo.Menus2VO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class NationalitVOTransformer.
 *
 * @version 1.0 24 nov. 2014
 * @author TYBASOFT
 */
public class Menus2VOTransformer extends
		BaseTransformer<Menus2, Menus2VO> {

	/* (non-Javadoc)
	 * @see com.tyba.technicalServices.core.ITransformer#model2VO(com.tyba.technicalServices.dao.impl.GenericEntity, boolean[])
	 */
	@Override
	public Menus2VO model2VO(Menus2 model, boolean... forCombo) {
		Menus2VO vo = new Menus2VO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setCdId(model.getId());
			vo.setLibMenu(model.getLibMenu());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	/* (non-Javadoc)
	 * @see com.tyba.technicalServices.core.ITransformer#vo2Model(com.tyba.technicalServices.core.ValueObject)
	 */
	@Override
	public Menus2 vo2Model(Menus2VO vo) {
		Menus2 model = new Menus2();
		Objects.copyProperties(model, vo);
		return model;
	}

}
