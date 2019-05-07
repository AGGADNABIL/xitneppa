package com.tyba.appentix.web.commons.Impl;

import java.util.List;

import com.tyba.appentix.business.common.vo.AdresseVO;

public interface AdresseSrvPresentation {

	
	//Ville
	AdresseVO findVilleById(Long id);
	AdresseVO findVilleByNom(String code);
	List<AdresseVO> findVilleByIdPays(Long idPays);
	
	List<AdresseVO> findAllVille();
	
	
	
}
