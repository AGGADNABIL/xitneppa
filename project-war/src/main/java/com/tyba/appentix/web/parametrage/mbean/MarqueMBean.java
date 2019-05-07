package com.tyba.appentix.web.parametrage.mbean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.parametrage.vo.MarquesVO;
import com.tyba.appentix.web.chantier.impl.MarqueBusDelegate;
import com.tyba.appentix.web.chantier.impl.MarqueSrvPresentationImpl;
import com.tyba.appentix.web.parametrage.webbean.MarquesWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean
@ViewScoped
public class MarqueMBean extends BaseMBean{

	/** 
	 */
	private static final long serialVersionUID = 1L;
	
	 MarquesWebBean webBean =new MarquesWebBean(); 
	 MarqueSrvPresentationImpl marqueService = (MarqueSrvPresentationImpl) BeansLookuper
			.lookup("marqueSrvPresentation");

	public void creer() {
		clearReport();
		MarqueBusDelegate chantierBusDelegate = new MarqueBusDelegate();
		
		error = chantierBusDelegate.creerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	public void editer() {
		System.out.println("edition effectuer.");
		clearReport();
		MarqueBusDelegate chantierBusDelegate = new MarqueBusDelegate();
		// webBean.getVo().setIdEtudiant("10");
		
		error = chantierBusDelegate.editerService(webBean);
		//System.out.println("error :"+error);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {
		
		clearReport();
		MarqueBusDelegate chantierBusDelegate = new MarqueBusDelegate();
		
		error = chantierBusDelegate.supprimerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	public void resetWebBeanVO() {
		webBean.setVo(new MarquesVO());
	}
	
	public String valider(){
		
		return "valider";
		
	}
	
   @PostConstruct
	public void init(){
		
	}
	
	public MarquesWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(MarquesWebBean webBean) {
		this.webBean = webBean;
	}

	
	public MarqueSrvPresentationImpl getMarqueService() {
		return marqueService;
	}
	public void setMarqueService(MarqueSrvPresentationImpl marqueService) {
		this.marqueService = marqueService;
	}
	public void onRowSelect(SelectEvent event) {
		 webBean.setVo((MarquesVO)event.getObject());
		// System.out.println("chV :"+chV.getNom());
    
   }
	
	
 
}
