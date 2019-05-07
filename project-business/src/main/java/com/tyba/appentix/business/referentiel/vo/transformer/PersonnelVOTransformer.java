package com.tyba.appentix.business.referentiel.vo.transformer;

import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class PersonnelVOTransformer extends BaseTransformer<Personnel, PersonnelVO>{

	private static PersonnelVOTransformer transformer = new PersonnelVOTransformer();

	@Override
	public PersonnelVO model2VO(Personnel model, boolean... forCombo) {
		PersonnelVO vo = new PersonnelVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setNomNaissance(model.getNomNaissance());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Personnel vo2Model(PersonnelVO vo) {
		Personnel model = new Personnel();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static PersonnelVOTransformer getInstance(){
		return transformer;
	}
}
