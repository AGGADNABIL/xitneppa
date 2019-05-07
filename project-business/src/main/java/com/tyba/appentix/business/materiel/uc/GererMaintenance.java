package com.tyba.appentix.business.materiel.uc;

import org.springframework.stereotype.Service;

import com.tyba.appentix.business.materiel.rule.MaintenanceBusinessRuleManager;
import com.tyba.technicalServices.core.IBusinessRuleManager;
import com.tyba.technicalServices.core.ProcessResult;
import com.tyba.technicalServices.core.UseCaseController;

@Service("MAINTENANCE_GererMaintenance_UC")
public class GererMaintenance extends UseCaseController{

	@Override
	protected IBusinessRuleManager getBusinessRuleManager() {
		// TODO Auto-generated method stub
		return new MaintenanceBusinessRuleManager();
	}

	@Override
	protected ProcessResult business() {
		ProcessResult pr = new ProcessResult();
		return pr;
	}

}
