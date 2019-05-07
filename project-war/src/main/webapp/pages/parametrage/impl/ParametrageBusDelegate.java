package com.tyba.appentix.web.parametrage.impl;

import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.appentix.business.parametrage.Constantes;
import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;
import com.tyba.appentix.web.parametrage.IParametrageBusDelegate;
import com.tyba.appentix.web.parametrage.webbean.TypeMaterielWebBean;
import com.tyba.technicalServices.web.BaseBusDelegate;


public class ParametrageBusDelegate extends BaseBusDelegate implements
		IParametrageBusDelegate {

	/**
	 * Instantiates a new parametre bus delegate.
	 */
	public ParametrageBusDelegate() {

		domaine = "PARAMETRAGE";
	}



	public boolean creerTypeMateriel(TypeMaterielWebBean webBean) {
		String command = Constantes.COMMAND_GERER_TYPE_MATERIEL;
		String sousCommand = Constantes.SOUS_COMMAND_CREER_TYPE_MATERIEL;
		webBean.getVo().setStatut(EntityStatus.ENABLED);
		TypeMaterielVO returnVO = (TypeMaterielVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean editerTypeMateriel(TypeMaterielWebBean webBean) {
		String command = Constantes.COMMAND_GERER_TYPE_MATERIEL;
		String sousCommand = Constantes.SOUS_COMMAND_EDITER_TYPE_MATERIEL;
		TypeMaterielVO returnVO = (TypeMaterielVO) executeCommand(webBean.getVo(),
				command, sousCommand);
		if (!error) {
			webBean.setVo(returnVO);
		}

		return error;
	}

	public boolean supprimerTypeMateriel(TypeMaterielWebBean webBean) {
		String command = Constantes.COMMAND_GERER_TYPE_MATERIEL;
		String sousCommand = Constantes.SOUS_COMMAND_SUPPRIMER_TYPE_MATERIEL;
		TypeMaterielVO vo = webBean.getVo();

		vo.setStatut(EntityStatus.DELETED);
		executeCommand(vo, command, sousCommand);

		return error;
	}

}
