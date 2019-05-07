package com.tyba.appentix.web.chantier.impl;




import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.parametrage.Constantes;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;


import com.tyba.appentix.web.parametrage.webbean.ChantiersWebBean;
import com.tyba.appentix.web.referentiel.IReferentielBusDelegate;
import com.tyba.technicalServices.web.BaseBusDelegate;



public class ChantierBusDelegate extends BaseBusDelegate implements IReferentielBusDelegate {
	
	
	 public ChantierBusDelegate() {
		
		domaine = "CHANTIER";
	}

	// chantier
	public boolean creerService(ChantiersWebBean webBean) {
		String command = Constantes.COMMAND_GERER_CHANTIERS;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_CHANTIER;
		//webBean.getVo().setIdVille(idVille);
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		ChantiersVO returnVO = (ChantiersVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}
		return error;
	}

	public boolean editerService(ChantiersWebBean webBean) {
		String command = Constantes.COMMAND_GERER_CHANTIERS;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_CHANTIER;
		ChantiersVO returnVO = (ChantiersVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		//System.out.println("my id :"+returnVO.getId()+" resp :"+returnVO.getResponsable());
		if (!error) {
			
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean supprimerService(ChantiersWebBean webBean) {
		String command = Constantes.COMMAND_GERER_CHANTIERS;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_CHANTIER;
		ChantiersVO vo = webBean.getVo();
		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);

		return error;
	}


}
