package com.tyba.appentix.business.materiel.uc;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.materiel.Constantes;
import com.tyba.appentix.business.materiel.dao.MaterielsDaoJpa;
import com.tyba.appentix.business.materiel.service.MaterielService;
import com.tyba.appentix.business.materiel.vo.MaterielsVO;
import com.tyba.appentix.business.materiel.vo.transformer.MaterielsVOTransformer;
import com.tyba.appentix.common.AbstractUCTest;
import com.tyba.technicalServices.core.FacadeControllerImpl;
import com.tyba.technicalServices.core.ProcessResult;


public class GererMaterielsTest extends AbstractUCTest {

@Autowired
MaterielsDaoJpa materielsDao;

//@Test
//@Rollback(false)
public void creerMaterielsTest() {
	
	String domaine = Constantes.MATERIEL;
	String command = Constantes.COMMAND_GERER_MATERIEL;
	String sousCommand = Constantes.SOUS_COMMAND_CREER_MATERIEL;

	MaterielsVO vo = new MaterielsVO();
	
	vo.setReference("test@gmail.com");
	vo.setLibelle("2014/2015");
    vo.setStatut(EntityStatus.ENABLED);		

	// preparation ds parametres
	clientParameters.setDomaine(domaine);
	clientParameters.setCommand(command);
	clientParameters.setSousCommand(sousCommand);
	clientParameters.setVo(vo);
	
	// appel de l'UC
	final ProcessResult result = (new FacadeControllerImpl(clientParameters))
			.useCaseProcess();
	Assert.assertNotNull(result);
}
//@Test

public void editerServicesTest() {
	
	String domaine = Constantes.MATERIEL;
	String command = Constantes.COMMAND_GERER_MATERIEL;
	String sousCommand = Constantes.SOUS_COMMAND_EDITER_MATERIEL;
	MaterielsVO vo = new MaterielsVO();
	vo.setId(1L);
	vo.setDescription("descriptioon");
	vo.setLibelle("mylib");
	vo.setStatut(EntityStatus.ENABLED);
	// preparation ds parametres
	clientParameters.setDomaine(domaine);
	clientParameters.setCommand(command);
	clientParameters.setSousCommand(sousCommand);
	clientParameters.setVo(vo);
	

	// appel de l'UC
	final ProcessResult result = (new FacadeControllerImpl(clientParameters))
			.useCaseProcess();
	Assert.assertNotNull(result);
}

@Test
//@Rollback(true)
public void supprimerServicesTest() {
	
	String domaine = Constantes.MATERIEL;
	String command = Constantes.COMMAND_GERER_MATERIEL;
	String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_MATERIEL;
	MaterielsVO vo = new MaterielsVO();
	
	vo.setId(1L);

	// preparation ds parametres
	clientParameters.setDomaine(domaine);
	clientParameters.setCommand(command);
	clientParameters.setSousCommand(sousCommand);
	clientParameters.setVo(vo);	

	// appel de l'UC
	final ProcessResult result = (new FacadeControllerImpl(clientParameters))
			.useCaseProcess();
	Assert.assertNotNull(result);
}
	

}
