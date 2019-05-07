package com.tyba.appentix.web.materiel.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.appentix.business.materiel.vo.MaintenanceVO;
import com.tyba.appentix.web.materiel.MaintenanceSrvPresentation;
import com.tyba.appentix.web.materiel.impl.MaintenanceBusDelegate;
import com.tyba.appentix.web.materiel.webbean.MaintenanceWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

/**
 * 
 * @author Aimad MAJDOU
 *
 */
@ManagedBean
@SessionScoped
public class MaintenanceMBean extends BaseMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 108000267372671638L;
	/**
	 * 
	 */
	/**
	 * 
	 */

	public MaintenanceMBean() {
		System.out.println("Hello from NaintenanceMBean");
	}
	MaintenanceWebBean webBean=new MaintenanceWebBean();
	MaintenanceSrvPresentation maintenanceService = (MaintenanceSrvPresentation) BeansLookuper
			.lookup("maintenanceSrvPresentation");

	public MaintenanceWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(MaintenanceWebBean webBean) {
		this.webBean = webBean; 
	}

	public void creer() {
		
		clearReport();
		MaintenanceBusDelegate  maintenanceBusDelegate = new MaintenanceBusDelegate();

		error = maintenanceBusDelegate.creerMaintenance(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
		System.out.println("Creer");
	}

	public void editer() {
		

		clearReport();
		MaintenanceBusDelegate maintenanceBusDelegate = new MaintenanceBusDelegate();
		// webBean.getVo().setIdEtudiant("10");
		
		error = maintenanceBusDelegate.editerMaintenance(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
		System.out.println("Modifier");
	}

	public void supprimer() {
		
		
		clearReport();
		MaintenanceBusDelegate maintenanceBusDelegate = new MaintenanceBusDelegate();
		
		error = maintenanceBusDelegate.supprimerMaintenance(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
		System.out.println("Hello from delete !");
	}
	

	public void resetWebBeanVO() {
		webBean.setVo(new MaintenanceVO());
	}
	
	public String redirect(){

		return "/pages/materiel/maintenance/gestionMaintenance.xhtml";
	}
	

	
}
