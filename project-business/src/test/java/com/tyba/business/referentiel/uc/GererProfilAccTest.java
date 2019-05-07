package com.tyba.business.referentiel.uc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.tyba.appentix.business.referentiel.Constantes;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.common.AbstractUCTest;
import com.tyba.technicalServices.core.FacadeControllerImpl;
import com.tyba.technicalServices.core.ProcessResult;

public class GererProfilAccTest extends AbstractUCTest{

	@Autowired
	ReferentielService referentielService;
	
	@Test
	@Rollback(true)
	public void editerProfilAccTest() {
		String domaine = Constantes.REFERENTIEL;
		String command = Constantes.COMMAND_GERER_PROFILACC;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_PROFILACC;

		ProfilAccVO vo = new ProfilAccVO();		
		vo.setCodeProAcc("10");
		vo.setLibPro("test");
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
