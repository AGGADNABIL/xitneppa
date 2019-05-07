package com.tyba.appentix.web.chantier.impl;




import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.parametrage.Constantes;
import com.tyba.appentix.business.parametrage.vo.MarquesVO;
import com.tyba.appentix.web.parametrage.webbean.MarquesWebBean;
import com.tyba.appentix.web.referentiel.IReferentielBusDelegate;
import com.tyba.technicalServices.web.BaseBusDelegate;


public class MarqueBusDelegate extends BaseBusDelegate implements IReferentielBusDelegate {
	
	
	 public MarqueBusDelegate() {
		
		domaine = "MARQUE";
	}

	// chantier
	public boolean creerService(MarquesWebBean webBean) {
		String command = Constantes.COMMAND_GERER_MARQUES;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_MARQUE;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		MarquesVO returnVO = (MarquesVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}
		return error;
	}

	public boolean editerService(MarquesWebBean webBean) {
		String command = Constantes.COMMAND_GERER_MARQUES;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_MARQUE;
		MarquesVO returnVO = (MarquesVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		
		if (!error) {
			
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean supprimerService(MarquesWebBean webBean) {
		String command = Constantes.COMMAND_GERER_MARQUES;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_MARQUE;
		MarquesVO vo = webBean.getVo();
		System.out.println("réussite.");
		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);

		return error;
	}


}
