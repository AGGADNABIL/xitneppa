package com.tyba.appentix.business.parametrage.uc;

import org.springframework.stereotype.Service;

import com.tyba.appentix.business.parametrage.rule.TypeMaterielCategBusinessRuleManager;
import com.tyba.technicalServices.core.IBusinessRuleManager;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.UseCaseController;

@Service("PARAMETRAGE_GererTypeMaterielCateg_UC")
public class GererTypeMaterielCateg extends UseCaseController{

	@Override
	protected IBusinessRuleManager getBusinessRuleManager() {
		// TODO Auto-generated method stub
		return new TypeMaterielCategBusinessRuleManager();
	}

	@Override
	protected ProcessResult business() {
		ProcessResult pr = new ProcessResult();
		return pr;
	}

}
