package com.tyba.appentix.business.referentiel.vo.transformer;

import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class ProfilAccVOTransformer extends BaseTransformer<ProfilAcc, ProfilAccVO> {
	
	private static ProfilAccVOTransformer transformer = new ProfilAccVOTransformer();
	
	@Override
	public ProfilAccVO model2VO(ProfilAcc model, boolean... forCombo) {
		ProfilAccVO vo = new ProfilAccVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setLibPro(model.getLibPro());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	/* (non-Javadoc)
	 * @see com.tyba.technicalServices.core.ITransformer#vo2Model(com.tyba.technicalServices.core.ValueObject)
	 */
	@Override
	public ProfilAcc vo2Model(ProfilAccVO vo) {
		ProfilAcc model = new ProfilAcc();
		Objects.copyProperties(model, vo);
		return model;
	}
	
	public static ProfilAccVOTransformer getInstance(){
		return transformer;
	}

}
