package com.tyba.appentix.business.parametrage.vo.transformer;

import java.util.List;

import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.transformer.ServicesVOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.tools.Objects;

public class TypeMaterielVOTransformer implements
		ITransformer<TypeMateriel, TypeMaterielVO> {
	
	private static TypeMaterielVOTransformer transformer = new TypeMaterielVOTransformer();

	@Override
	public TypeMaterielVO model2VO(TypeMateriel model, boolean... forCombo) {
		TypeMaterielVO vo = new TypeMaterielVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setTypeId(model.getId());
			vo.setReference(model.getReference());
			vo.setLibelle(model.getLibelle());
			vo.setDescription(model.getDescription());
			vo.setStatut(model.getStatut());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public TypeMateriel vo2Model(TypeMaterielVO vo) {
		TypeMateriel model = new TypeMateriel();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static TypeMaterielVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(TypeMaterielVOTransformer transformer) {
		TypeMaterielVOTransformer.transformer = transformer;
	}

	@Override
	public List<TypeMaterielVO> model2VO(List<TypeMateriel> model,
			boolean... forCombo) {
		return null;
	}

	@Override
	public List<TypeMateriel> vo2Model(List<TypeMaterielVO> vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
