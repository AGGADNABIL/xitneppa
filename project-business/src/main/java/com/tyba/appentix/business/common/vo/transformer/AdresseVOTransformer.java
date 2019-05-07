package com.tyba.appentix.business.common.vo.transformer;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.vo.AdresseVO;
import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class AdresseVOTransformer extends BaseTransformer<Adresse, AdresseVO>{

	
	private static AdresseVOTransformer transformer = new AdresseVOTransformer();

	@Override
	public AdresseVO model2VO(Adresse model, boolean... forCombo) {
		AdresseVO vo = new AdresseVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setDetail(model.getDetail());
			vo.setVille(model.getVille());
			//vo.setStatut(EntityStatus.ENABLED);
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Adresse vo2Model(AdresseVO vo) {
		Adresse model = new Adresse();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static AdresseVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(AdresseVOTransformer transformer) {
		AdresseVOTransformer.transformer = transformer;
	}

}