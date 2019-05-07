/*
 * ReferentielSrvPresentationImpl.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */
package com.tyba.appentix.web.chantier.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.service.ChantierService;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.appentix.business.parametrage.vo.transformer.ChantiersVOTransformer;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.transformer.ServicesVOTransformer;
import com.tyba.appentix.web.chantier.ChantierSrvPresentation;


@Service("chantierSrvPresentation")
public class ChantierSrvPresentationImpl implements ChantierSrvPresentation, Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired
	private ChantierService chantierService;

	@Override
	public ChantiersVO findChantierById(String id) {
		// TODO Auto-generated method stub		
		Chantiers models=chantierService.findChantiersById(id);
		return new ChantiersVOTransformer().model2VO(models, false) ;
	}

	@Override
	public List<ChantiersVO> findAllChantier() {
		// TODO Auto-generated method stub
		/*List<Chantiers> models=chantierService.findAllChantiers();
		return  new ChantiersVOTransformer().model2VO(models, false);*/
		
		List<ChantiersVO> lvo = new ArrayList<ChantiersVO>();
		List<Chantiers> m = chantierService.findAllChantiers();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new ChantiersVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}
	
	
	@Override
	public ChantiersVO findChantierByCode(String code) {
		// TODO Auto-generated method stubP
		return null;
	}

	@Override
	public ChantiersVO findChantierByMatr(String matr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChantiersVO findChantierByCodeMatr(String code, String matr) {
		// TODO Auto-generated method stub
		return null;
	}

	public ChantierService getChantierService() {
		return chantierService;
	}

	public void setChantierService(ChantierService chantierService) {
		this.chantierService = chantierService;
	}


//	public List<Pays> findAllPays() {
//		// TODO Auto-generated method stub
//		return chantierService.findAllPays();
//	}
	
}
