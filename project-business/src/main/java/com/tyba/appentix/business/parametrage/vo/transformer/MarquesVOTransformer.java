package com.tyba.appentix.business.parametrage.vo.transformer;

import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.appentix.business.parametrage.vo.MarquesVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class MarquesVOTransformer extends BaseTransformer<Marques, MarquesVO>{

	
	private static MarquesVOTransformer transformer = new MarquesVOTransformer();

	@Override
	public MarquesVO model2VO(Marques model, boolean... forCombo) {
		MarquesVO vo = new MarquesVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setDescription(model.getDescription());
			vo.setLibelle(model.getLibelle());
			vo.setStatut(model.getStatut());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Marques vo2Model(MarquesVO vo) {
		Marques model = new Marques();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static MarquesVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(MarquesVOTransformer transformer) {
		MarquesVOTransformer.transformer = transformer;
	}

}