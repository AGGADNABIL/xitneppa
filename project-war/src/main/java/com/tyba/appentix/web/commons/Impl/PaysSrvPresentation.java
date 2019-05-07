package com.tyba.appentix.web.commons.Impl;

import java.util.List;

import com.tyba.appentix.business.common.vo.PaysVO;

public interface PaysSrvPresentation {

	
	//PAYS
	PaysVO findPaysById(Long id);
	PaysVO findPaysByNom(String code);	
	
	List<PaysVO> findAllPays();
	
	//PAYS
	//List<Pays> findAllPays();
	
}
