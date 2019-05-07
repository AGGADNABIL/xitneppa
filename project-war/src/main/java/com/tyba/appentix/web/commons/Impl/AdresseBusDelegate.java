package com.tyba.appentix.web.commons.Impl;




import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.common.vo.AdresseVO;
import com.tyba.appentix.business.referentiel.Constantes;
import com.tyba.appentix.web.commons.webbean.AdresseWebBean;
import com.tyba.appentix.web.referentiel.IReferentielBusDelegate;
import com.tyba.technicalServices.web.BaseBusDelegate;


public class AdresseBusDelegate extends BaseBusDelegate implements IReferentielBusDelegate {
	
	
	 public AdresseBusDelegate() {
		
		domaine = "VILLE";
	}

	// ville
	public boolean creerService(AdresseWebBean webBean) {
		String command = Constantes.COMMAND_GERER_VILLE;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_VILLE;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		AdresseVO returnVO = (AdresseVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}
		return error;
	}

	public boolean editerService(AdresseWebBean webBean) {
		String command = Constantes.COMMAND_GERER_VILLE;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_VILLE;
		AdresseVO returnVO = (AdresseVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean supprimerService(AdresseWebBean webBean) {
		String command = Constantes.COMMAND_GERER_VILLE;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_VILLE;
		AdresseVO vo = webBean.getVo();
		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);

		return error;
	}


}
