package com.tyba.appentix.business.materiel.uc;

import org.springframework.stereotype.Service;


import com.tyba.appentix.business.materiel.rule.MaterielsBusinessRuleManager;
import com.tyba.technicalServices.core.IBusinessRuleManager;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.UseCaseController;

@Service("MATERIEL_GererMateriels_UC")
public class GererMateriels extends UseCaseController{

	@Override
	protected IBusinessRuleManager getBusinessRuleManager() {
		// TODO Auto-generated method stub
		return new MaterielsBusinessRuleManager();
	}

	@Override
	protected ProcessResult business() {
		ProcessResult pr = new ProcessResult();
		return pr;
	}

}
