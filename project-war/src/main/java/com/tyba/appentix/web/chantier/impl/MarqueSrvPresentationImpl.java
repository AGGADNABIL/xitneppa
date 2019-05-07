package com.tyba.appentix.web.chantier.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.service.MarqueService;
import com.tyba.appentix.business.parametrage.vo.MarquesVO;

import com.tyba.appentix.business.parametrage.vo.transformer.MarquesVOTransformer;
import com.tyba.appentix.web.chantier.MarqueSrvPresentation;
@Service("marqueSrvPresentation")
public class MarqueSrvPresentationImpl implements MarqueSrvPresentation, Serializable{

	private static final long serialVersionUID = 1L;

	@Autowired
	private MarqueService marqueService;

	@Override
	public MarquesVO findMarqueById(Long id) {
		// TODO Auto-generated method stub		
				Marques models=marqueService.findMarquesById(id);
				return new MarquesVOTransformer().model2VO(models, false) ;
	}

	@Override
	public MarquesVO findMarqueByDesc(String desc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MarquesVO findMarqueByLib(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MarquesVO findMarqueByCriteria(String libelle, String descrption) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarquesVO> findAllMarque() {
		// TODO Auto-generated method stub
		List<MarquesVO> lvo = new ArrayList<MarquesVO>();
		List<Marques> m = marqueService.findAllMarques();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new MarquesVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	public MarqueService getMarqueService() {
		return marqueService;
	}

	public void setMarqueService(MarqueService marqueService) {
		this.marqueService = marqueService;
	}

	
}
