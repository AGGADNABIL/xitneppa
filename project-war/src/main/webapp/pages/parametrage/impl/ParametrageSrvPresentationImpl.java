package com.tyba.appentix.web.parametrage.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.appentix.business.parametrage.service.ParametrageTypeMaterielService;
import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;
import com.tyba.appentix.business.parametrage.vo.transformer.TypeMaterielVOTransformer;
import com.tyba.appentix.web.parametrage.ParametrageSrvPresentation;


@Service("parametrageSrvPresentation")
public class ParametrageSrvPresentationImpl implements
		ParametrageSrvPresentation, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9195103923868652549L;
	
	
	/** The parametrage typemateriel. */
	@Autowired
	private ParametrageTypeMaterielService parametrageTypeMaterielService;

	public ParametrageTypeMaterielService getParametrageTypeMaterielservice() {
		return parametrageTypeMaterielService;
	}

	

	public void setParametrageTypeMaterielService(
			ParametrageTypeMaterielService parametrageTypeMaterielService) {
		this.parametrageTypeMaterielService = parametrageTypeMaterielService;
	}

	@Override
	public TypeMaterielVO findTypeMaterielByTypeId(String id) {
		// TODO Auto-generated method stub
		TypeMateriel models = parametrageTypeMaterielService.findById(id);
		return new TypeMaterielVOTransformer().model2VO(models, false);
	}

	@Override
	public List<TypeMaterielVO> findAllMateriels() {
		List<TypeMaterielVO> lvo = new ArrayList<TypeMaterielVO>();
		List<TypeMateriel> m = parametrageTypeMaterielService.findAllTypeMateriel();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new TypeMaterielVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}	
	
	
	
}
