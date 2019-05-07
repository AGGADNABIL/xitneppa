package com.tyba.appentix.web.referentiel.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.web.referentiel.ReferentielSrvPresentation;
import com.tyba.appentix.web.referentiel.impl.ReferentielBusDelegate;
import com.tyba.appentix.web.referentiel.webbean.ServicesWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean
@ViewScoped
public class ServiceMBean extends BaseMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3962717729399008040L;
	/**
	 * 
	 */

	private ServicesWebBean webBean=new ServicesWebBean();
	ReferentielSrvPresentation referentielService = (ReferentielSrvPresentation) BeansLookuper
			.lookup("referentielSrvPresentation");

	
	public void creer() {
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
	
		System.out.println("------------>id: "
				+ webBean.getVo().getId());
		

		error = referentielBusDelegate.creerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void editer() {
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		// webBean.getVo().setIdEtudiant("10");
		
		error = referentielBusDelegate.editerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {
		
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		error = referentielBusDelegate.supprimerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	

	public void resetWebBeanVO() {
		webBean.setVo(new ServicesVO());
	}

	public ServicesWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(ServicesWebBean webBean){
		this.webBean = webBean;
	}
	
	
}
