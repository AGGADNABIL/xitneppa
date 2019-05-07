package com.tyba.appentix.web.parametrage.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;
import com.tyba.appentix.web.parametrage.ParametrageSrvPresentation;
import com.tyba.appentix.web.parametrage.impl.ParametrageBusDelegate;
import com.tyba.appentix.web.parametrage.webbean.TypeMaterielWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean
@ViewScoped
public class TypeMaterielMBean extends BaseMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3962717729399008040L;
	/**
	 * 
	 */

	private TypeMaterielWebBean webBean=new TypeMaterielWebBean();
	ParametrageSrvPresentation parametrageSrvPresentation = (ParametrageSrvPresentation) BeansLookuper
			.lookup("parametrageSrvPresentation");

	
	public void creer() {
		clearReport();
		ParametrageBusDelegate parametrageBusDelegate = new ParametrageBusDelegate();
		
		System.out.println("------------>id: "
				+ webBean.getVo().getTypeId());
		

		error = parametrageBusDelegate.creerTypeMateriel(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void editer() {
		clearReport();
		ParametrageBusDelegate parametrageBusDelegate = new ParametrageBusDelegate();
		// webBean.getVo().setIdEtudiant("10");
		
		error = parametrageBusDelegate.editerTypeMateriel(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {
		
		clearReport();
		ParametrageBusDelegate parametrageBusDelegate = new ParametrageBusDelegate();
		error = parametrageBusDelegate.supprimerTypeMateriel(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	public String redirect() {
		return "/pages/materiel/parametrage/typeMateriel/gestionTypeMateriel.xhtml";
	}
	

	public void resetWebBeanVO() {
		webBean.setVo(new TypeMaterielVO());
	}

	public TypeMaterielWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(TypeMaterielWebBean webBean){
		this.webBean = webBean;
	}
	
	public void onRowSelect(SelectEvent event) {
		webBean.setVo((TypeMaterielVO)event.getObject());
		
    }
	
}
