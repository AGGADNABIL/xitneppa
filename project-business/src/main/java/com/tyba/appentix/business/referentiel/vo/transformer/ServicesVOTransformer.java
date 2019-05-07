package com.tyba.appentix.business.referentiel.vo.transformer;

import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class ServicesVOTransformer extends BaseTransformer<Services, ServicesVO>{

	
	private static ServicesVOTransformer transformer = new ServicesVOTransformer();

	@Override
	public ServicesVO model2VO(Services model, boolean... forCombo) {
		ServicesVO vo = new ServicesVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setLibelleService(model.getLibelleService());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Services vo2Model(ServicesVO vo) {
		Services model = new Services();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static ServicesVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(ServicesVOTransformer transformer) {
		ServicesVOTransformer.transformer = transformer;
	}

}
