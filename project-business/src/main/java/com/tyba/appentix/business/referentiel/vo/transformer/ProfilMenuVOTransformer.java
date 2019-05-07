package com.tyba.appentix.business.referentiel.vo.transformer;

import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class ProfilMenuVOTransformer extends BaseTransformer<ProfilMenu, ProfilMenuVO> {
	
	private static ProfilMenuVOTransformer transformer = new ProfilMenuVOTransformer();
	
	@Override
	public ProfilMenuVO model2VO(ProfilMenu model, boolean... forCombo) {
		ProfilMenuVO vo = new ProfilMenuVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
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
	public ProfilMenu vo2Model(ProfilMenuVO vo) {
		ProfilMenu model = new ProfilMenu();
		Objects.copyProperties(model, vo);
		return model;
	}
	
	public static ProfilMenuVOTransformer getInstance(){
		return transformer;
	}

}
