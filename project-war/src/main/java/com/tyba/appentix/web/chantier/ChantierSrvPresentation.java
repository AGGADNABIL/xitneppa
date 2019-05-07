package com.tyba.appentix.web.chantier;

import java.util.List;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.technicalServices.web.SearchConfig;

public interface ChantierSrvPresentation {

	
	//CHANTIER
	ChantiersVO findChantierById(String id);
	ChantiersVO findChantierByCode(String code);	
	ChantiersVO findChantierByMatr(String matr);
	ChantiersVO findChantierByCodeMatr(String code,String matr);
	List<ChantiersVO> findAllChantier();
	
	//PAYS
	//List<Pays> findAllPays();
	
}
