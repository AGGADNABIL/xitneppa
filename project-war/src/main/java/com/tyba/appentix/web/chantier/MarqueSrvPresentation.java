package com.tyba.appentix.web.chantier;

import java.util.List;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.appentix.business.parametrage.vo.MarquesVO;
import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.technicalServices.web.SearchConfig;

public interface MarqueSrvPresentation {

	
	//CHANTIER
	MarquesVO findMarqueById(Long id);
	MarquesVO findMarqueByDesc(String desc);	
	MarquesVO findMarqueByLib(String libelle);
	MarquesVO findMarqueByCriteria(String libelle,String descrption);
	List<MarquesVO> findAllMarque();
	
	//PAYS
	//List<Pays> findAllPays();
	
}
