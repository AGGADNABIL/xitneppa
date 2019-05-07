package com.tyba.appentix.business.referentiel.vo.transformer;

import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.tools.Objects;

public class UserEntityVOTransformer extends BaseTransformer<UserEntity, UserEntityVO> {
	
	private static UserEntityVOTransformer transformer = new UserEntityVOTransformer();

	@Override
	public UserEntityVO model2VO(UserEntity model, boolean... forCombo) {
		UserEntityVO vo = new UserEntityVO();		
		Objects.copyProperties(vo, model);
	   return vo;
	}

	@Override
	public UserEntity vo2Model(UserEntityVO vo) {
		UserEntity model = new UserEntity();
		Objects.copyProperties(model, vo);
		return model;
	}
	public static UserEntityVOTransformer getInstance(){
		return transformer;
	}

}
