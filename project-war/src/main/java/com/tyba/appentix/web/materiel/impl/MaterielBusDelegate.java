
package com.tyba.appentix.web.materiel.impl;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.materiel.Constantes;
import com.tyba.appentix.business.materiel.vo.MaterielsVO;
import com.tyba.appentix.web.materiel.IMaterielBusDelegate;
import com.tyba.appentix.web.materiel.webbean.MaterielWebBean;
import com.tyba.technicalServices.web.BaseBusDelegate;

/**

 * @author Jamal EL BOUROUMI
 */
public class MaterielBusDelegate extends BaseBusDelegate implements
		IMaterielBusDelegate {

	/**
	 * Instantiates a new referentiel bus delegate.
	 */
	public MaterielBusDelegate() {

		domaine = "MATERIEL";
	}

	


	public boolean creerMateriel(MaterielWebBean webBean) {
		String command = Constantes.COMMAND_GERER_MATERIEL;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_MATERIEL;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		MaterielsVO returnVO = (MaterielsVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean editerMateriel(MaterielWebBean webBean) {
		String command = Constantes.COMMAND_GERER_MATERIEL;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_MATERIEL;
		MaterielsVO returnVO = (MaterielsVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}
	
	public boolean supprimerMateriel(MaterielWebBean webBean) {
		String command = Constantes.COMMAND_GERER_MATERIEL;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_MATERIEL;
		MaterielsVO vo = webBean.getVo();

		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);

		return error;
	}

	
	
	
	
	
}
