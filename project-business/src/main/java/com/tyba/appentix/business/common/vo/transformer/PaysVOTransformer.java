package com.tyba.appentix.business.common.vo.transformer;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class PaysVOTransformer extends BaseTransformer<Pays, PaysVO>{

	
	private static PaysVOTransformer transformer = new PaysVOTransformer();

	@Override
	public PaysVO model2VO(Pays model, boolean... forCombo) {
		PaysVO vo = new PaysVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setNom(model.getNom());
			
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Pays vo2Model(PaysVO vo) {
		Pays model = new Pays();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static PaysVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(PaysVOTransformer transformer) {
		PaysVOTransformer.transformer = transformer;
	}

}