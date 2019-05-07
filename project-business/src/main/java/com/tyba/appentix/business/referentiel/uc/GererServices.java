package com.tyba.appentix.business.referentiel.uc;

import org.springframework.stereotype.Service;

import com.tyba.appentix.business.referentiel.rule.ServicesBusinessRuleManager;
import com.tyba.technicalServices.core.IBusinessRuleManager;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.UseCaseController;

@Service("REFERENTIEL_GererServices_UC")
public class GererServices extends UseCaseController{

	@Override
	protected IBusinessRuleManager getBusinessRuleManager() {
		// TODO Auto-generated method stub
		return new ServicesBusinessRuleManager();
	}

	@Override
	protected ProcessResult business() {
		ProcessResult pr = new ProcessResult();
		return pr;
	}

}
