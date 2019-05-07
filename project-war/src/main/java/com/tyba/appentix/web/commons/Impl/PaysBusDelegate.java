package com.tyba.appentix.web.commons.Impl;




import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.appentix.business.referentiel.Constantes;
import com.tyba.appentix.web.commons.webbean.PaysWebBean;
import com.tyba.appentix.web.referentiel.IReferentielBusDelegate;
import com.tyba.technicalServices.web.BaseBusDelegate;


public class PaysBusDelegate extends BaseBusDelegate implements IReferentielBusDelegate {
	
	
	 public PaysBusDelegate() {
		
		domaine = "PAYS";
	}

	// chantier
	public boolean creerService(PaysWebBean webBean) {
		String command = Constantes.COMMAND_GERER_PAYS;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_PAYS;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		PaysVO returnVO = (PaysVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}
		return error;
	}

	public boolean editerService(PaysWebBean webBean) {
		String command = Constantes.COMMAND_GERER_PAYS;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_PAYS;
		PaysVO returnVO = (PaysVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean supprimerService(PaysWebBean webBean) {
		String command = Constantes.COMMAND_GERER_PAYS;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_PAYS;
		PaysVO vo = webBean.getVo();
		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);

		return error;
	}


}
