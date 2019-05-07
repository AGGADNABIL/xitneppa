package com.tyba.appentix.web.parametrage.mbean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.vo.transformer.AdresseVOTransformer;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.appentix.web.chantier.ChantierSrvPresentation;
import com.tyba.appentix.web.chantier.impl.ChantierBusDelegate;
import com.tyba.appentix.web.commons.mbean.AdresseMBean;
import com.tyba.appentix.web.parametrage.webbean.ChantiersWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean
@ViewScoped
public class ChantierMBean extends BaseMBean{

	/** 
	 */
	private static final long serialVersionUID = 1L;
	
	//private ChantiersVO chV=new ChantiersVO();
	 ChantiersWebBean webBean =new ChantiersWebBean(); 
	ChantierSrvPresentation chantierService = (ChantierSrvPresentation) BeansLookuper
			.lookup("chantierSrvPresentation");
	
	@ManagedProperty(value="#{adresseMBean}")
	private AdresseMBean adresseMBean;
	
    
	public void creer() {
		clearReport();
		ChantierBusDelegate chantierBusDelegate = new ChantierBusDelegate();
		//System.out.println("selectVille"+adresseMBean.getSelectVille());
		AdresseVOTransformer transf=new AdresseVOTransformer();
		Adresse adresse =transf.vo2Model(adresseMBean.getAdresse());
		webBean.getVo().setAdresse(adresse);
		error = chantierBusDelegate.creerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	public void editer() {
		
		clearReport();
		ChantierBusDelegate chantierBusDelegate = new ChantierBusDelegate();
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
		ChantierBusDelegate chantierBusDelegate = new ChantierBusDelegate();
		error = chantierBusDelegate.supprimerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	public void resetWebBeanVO() {
		webBean.setVo(new ChantiersVO());
	}
	
	public String valider(){
		
		return "valider";
		
	}
	
	public String redirect() {
		return "/pages/parametrage/chantier/gererChantier.xhtml";
	}
	
   @PostConstruct
	public void init(){
		
	}
	
	public ChantiersWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(ChantiersWebBean webBean) {
		this.webBean = webBean;
	}

	public ChantierSrvPresentation getChantierService() {
		return chantierService;
	}

	public void setChantierService(ChantierSrvPresentation chantierService) {
		this.chantierService = chantierService;
	}
	
	
	public AdresseMBean getAdresseMBean() {
		return adresseMBean;
	}
	public void setAdresseMBean(AdresseMBean adresseMBean) {
		this.adresseMBean = adresseMBean;
	}
	public void onRowSelect(SelectEvent event) {
		
		 webBean.setVo((ChantiersVO)event.getObject());
		// System.out.println("chV :"+chV.getNom());
    
   }
	
	
 
}
