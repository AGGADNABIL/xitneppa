package com.tyba.appentix.web.referentiel.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.web.referentiel.ReferentielSrvPresentation;
import com.tyba.appentix.web.referentiel.impl.ReferentielBusDelegate;
import com.tyba.appentix.web.referentiel.webbean.ProfilAccWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean
@ViewScoped
public class ProfilAccMBean extends BaseMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProfilAccWebBean webBean = new ProfilAccWebBean();
	ReferentielSrvPresentation referentielService = (ReferentielSrvPresentation) BeansLookuper
			.lookup("referentielSrvPresentation");
	
	public void creer() {
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		// webBean.getVo().setIdEtudiant("10");
		System.out.println("------------>id: "
				+ webBean.getVo().getId());
		

		error = referentielBusDelegate.creerProfilAcc(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void editer() {
		System.out.println("teeeeeeeeest");
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		// webBean.getVo().setIdEtudiant("10");		
		error = referentielBusDelegate.editerProfilAcc(webBean);
		System.out.println("*********************** "+error);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {
		
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		error = referentielBusDelegate.supprimerProfilAcc(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	public void resetWebBeanVO() {
		webBean.setVo(new ProfilAccVO());
	}

	public ProfilAccWebBean getWebBean() {
		return webBean;
	}
	public void setWebBean(ProfilAccWebBean webBean) {
		this.webBean = webBean;
	}

}
