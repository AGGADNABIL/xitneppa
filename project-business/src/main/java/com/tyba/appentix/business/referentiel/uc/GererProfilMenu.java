package com.tyba.appentix.business.referentiel.uc;

import org.springframework.stereotype.Service;

import com.tyba.appentix.business.referentiel.rule.ProfilMenuBusinessRuleManager;
import com.tyba.technicalServices.core.IBusinessRuleManager;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.UseCaseController;

@Service("REFERENTIEL_GererProfilMenu_UC")
public class GererProfilMenu extends UseCaseController {

	@Override
	protected IBusinessRuleManager getBusinessRuleManager() {
		// TODO Auto-generated method stub
		return new ProfilMenuBusinessRuleManager();
	}

	@Override
	protected ProcessResult business() {
		ProcessResult pr = new ProcessResult();
		return pr;
	}

}
