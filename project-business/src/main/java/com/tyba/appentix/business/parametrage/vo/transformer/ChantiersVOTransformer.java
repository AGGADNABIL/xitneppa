package com.tyba.appentix.business.parametrage.vo.transformer;

import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class ChantiersVOTransformer extends BaseTransformer<Chantiers, ChantiersVO>{

	
	private static ChantiersVOTransformer transformer = new ChantiersVOTransformer();

	@Override
	public ChantiersVO model2VO(Chantiers model, boolean... forCombo) {
		ChantiersVO vo = new ChantiersVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setDate_debut(model.getDate_debut());
			vo.setDate_fin(model.getDate_fin());
			vo.setEtat(model.getEtat());
			vo.setNom(model.getNom());
			vo.setNombre_employe(model.getNombre_employe());
			vo.setReference(model.getReference());
			vo.setResponsable(model.getResponsable());
			vo.setStatut(model.getStatut());
			vo.setAdresse(model.getAdresse());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Chantiers vo2Model(ChantiersVO vo) {
		Chantiers model = new Chantiers();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static ChantiersVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(ChantiersVOTransformer transformer) {
		ChantiersVOTransformer.transformer = transformer;
	}

}