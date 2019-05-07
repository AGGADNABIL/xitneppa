package com.tyba.appentix.web.commons.Impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.pays.service.AdresseService;
import com.tyba.appentix.business.common.vo.AdresseVO;
import com.tyba.appentix.business.common.vo.transformer.AdresseVOTransformer;
@Service("adresseSrvPresentation")
public class AdresseSrvPresentationImpl implements AdresseSrvPresentation, Serializable{

	private static final long serialVersionUID = 1L;

	@Autowired
	private AdresseService adresseService;

	
	@Override
	public AdresseVO findVilleById(Long id) {
		// TODO Auto-generated method stub		
				Adresse models=adresseService.findById(id);
				return new AdresseVOTransformer().model2VO(models, false) ;
	}

	
	

	@Override
	public AdresseVO findVilleByNom(String code) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<AdresseVO> findAllVille() {
		// TODO Auto-gene
		List<AdresseVO> lvo = new ArrayList<AdresseVO>();
		List<Adresse> m = adresseService.findAll();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new AdresseVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}




	@Override
	public List<AdresseVO> findVilleByIdPays(Long idPays) {
		// TODO Auto-generated method stub
		List<AdresseVO> lvo = new ArrayList<AdresseVO>();
		List<Adresse> m = adresseService.findVilleByIdPays(idPays);
		for (int i = 0; i < m.size(); i++)
			lvo.add(new AdresseVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	
}
