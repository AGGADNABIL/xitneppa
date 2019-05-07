package com.tyba.appentix.business.referentiel.vo.transformer;

import com.tyba.appentix.business.referentiel.model.ProfilMenuTmp;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuTmpVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class ProfilMenuTmpVOTransformer extends BaseTransformer<ProfilMenuTmp, ProfilMenuTmpVO> {
	
	private static ProfilMenuTmpVOTransformer transformer = new ProfilMenuTmpVOTransformer();
	
	@Override
	public ProfilMenuTmpVO model2VO(ProfilMenuTmp model, boolean... forCombo) {
		ProfilMenuTmpVO vo = new ProfilMenuTmpVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setIdProfil(model.getIdProfil());
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
	public ProfilMenuTmp vo2Model(ProfilMenuTmpVO vo) {
		ProfilMenuTmp model = new ProfilMenuTmp();
		Objects.copyProperties(model, vo);
		return model;
	}
	
	public static ProfilMenuTmpVOTransformer getInstance(){
		return transformer;
	}

}
