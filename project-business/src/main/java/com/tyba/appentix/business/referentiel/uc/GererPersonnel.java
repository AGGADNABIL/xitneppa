package com.tyba.appentix.business.referentiel.uc;

import org.springframework.stereotype.Service;

import com.tyba.appentix.business.referentiel.rule.PersonnelBusinessRuleManager;
import com.tyba.technicalServices.core.IBusinessRuleManager;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.UseCaseController;


@Service("REFERENTIEL_GererPersonnel_UC")
public class GererPersonnel extends UseCaseController {

	@Override
	protected IBusinessRuleManager getBusinessRuleManager() {
		// TODO Auto-generated method stub
		return new PersonnelBusinessRuleManager();
	}

	@Override
	protected ProcessResult business() {
		// TODO Auto-generated method stub
		ProcessResult pr = new ProcessResult();

		return pr;
	}

}
