package com.tyba.appentix.business.parametrage.uc;

import org.springframework.stereotype.Service;

import com.tyba.appentix.business.parametrage.rule.TypeMaterielBusinessRuleManager;
import com.tyba.technicalServices.core.IBusinessRuleManager;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.UseCaseController;

@Service("PARAMETRAGE_GererTypeMateriel_UC")
public class GererTypeMateriel extends UseCaseController{

	@Override
	protected IBusinessRuleManager getBusinessRuleManager() {
		// TODO Auto-generated method stub
		return new TypeMaterielBusinessRuleManager();
	}

	@Override
	protected ProcessResult business() {
		ProcessResult pr = new ProcessResult();
		return pr;
	}

}
