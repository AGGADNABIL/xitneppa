package com.tyba.appentix.web.referentiel.mbean;


import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.appentix.web.referentiel.ReferentielSrvPresentation;
import com.tyba.appentix.web.referentiel.impl.ReferentielBusDelegate;
import com.tyba.appentix.web.referentiel.webbean.ProfilMenuWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;
import com.tyba.technicalServices.web.SearchConfig;

@ManagedBean
@ViewScoped
public class ProfilMenuMBean extends BaseMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProfilMenuWebBean webBean= new ProfilMenuWebBean();
	private ProfilAccVO selectedProfil= new ProfilAccVO();
    private ProfilMenuVO rootSelected = new ProfilMenuVO();
	ReferentielSrvPresentation referentielService = (ReferentielSrvPresentation) BeansLookuper
			.lookup("referentielSrvPresentation");

	public void init() {
		webBean = new ProfilMenuWebBean();
		rootSelected=new ProfilMenuVO();
		
	}
	
	public void listerSousMenus(){
		
		webBean.setVos(referentielService.findMenuByRoot(webBean.getSelectedRoot().getMenuMenu(), webBean.getProfil().getCodeProAcc(), new SearchConfig()));

	}
	public void fetchMenuForProfil() {	
		
		selectedProfil=webBean.getProfil();
		webBean.setRoot(referentielService.findSuperRoot(webBean.getProfil().getCodeProAcc(), new SearchConfig()));
		rootSelected= webBean.getSelectedRoot();
		webBean.setVos(new ArrayList<ProfilMenuVO>());
		
	}
	public void updateRoot(){
		if(!webBean.getVo().getForma().equals("***"))
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Opération impossible, ceci n'est pas un dossier !!"));
		else{
		webBean.setRoot(new ArrayList<ProfilMenuVO>());
		webBean.getRoot().add(webBean.getVo());
		webBean.setVos(referentielService.findMenuByRoot(webBean.getVo().getMenuMenu(), webBean.getProfil().getCodeProAcc(), new SearchConfig()));
		}

	}
	public void updateChild(){
		
		if(webBean.getRoot().get(0).getRootMenu().equals("0"))
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Opération impossible, ceci est la racine des menus !!"));
		else{
		webBean.setRoot(new ArrayList<ProfilMenuVO>());
		webBean.getRoot().add(referentielService.findRootByMenu(webBean.getVo().getRootMenu(), webBean.getProfil().getCodeProAcc()));
		webBean.setVos(referentielService.findMenuByRoot(webBean.getVo().getRootMenu(), webBean.getProfil().getCodeProAcc(), new SearchConfig()));}
		
	}

	public void importerMenu(){
		
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		List<ProfilMenuVO> menusTempList= referentielService.findMenuByProfil("00", new SearchConfig());
		System.out.println("**************** profil "+webBean.getProfil().getCodeProAcc());
		System.out.println("**************** liste size "+menusTempList.size());
		if(menusTempList.size()>0){
		for (int i = 0; i < menusTempList.size(); i++) {	
			
			menusTempList.get(i).setCodePro(webBean.getProfil().getCodeProAcc());
		
		}

		
		
	   for (int i = 0; i < menusTempList.size(); i++) {
			clearReport();
		   ProfilMenuWebBean wbTemp= new ProfilMenuWebBean();
			wbTemp.setVo(menusTempList.get(i));
			error=referentielBusDelegate.creerProfilMenu(wbTemp);
			feedReport();

	   }	
	}
}
	public void creer() {
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		// webBean.getVo().setIdEtudiant("10");
		System.out.println("------------>id: "
				+ webBean.getVo().getId());
		
        webBean.getVo().setCodePro(webBean.getProfil().getCodeProAcc());
        webBean.getVo().setRootMenu( webBean.getRoot().get(0).getMenuMenu());
		error = referentielBusDelegate.creerProfilMenu(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void editer() {
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
        webBean.getVo().setRootMenu( webBean.getRoot().get(0).getMenuMenu());
		
		error = referentielBusDelegate.editerProfilMenu(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {
		
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		error = referentielBusDelegate.supprimerProfilMenu(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	
	public void resetWebBeanVO() {
		webBean.setVo(new ProfilMenuVO());
	}
	public ProfilMenuWebBean getWebBean() {		
		return webBean;		
	}
	public void setWebBean(ProfilMenuWebBean webBean) {
		this.webBean = webBean;
	}

	public ProfilAccVO getSelectedProfil() {
		return selectedProfil;
	}

	public void setSelectedProfil(ProfilAccVO selectedProfil) {
		this.selectedProfil = selectedProfil;
	}

	public ProfilMenuVO getRootSelected() {
		return rootSelected;
	}

	public void setRootSelected(ProfilMenuVO rootSelected) {
		this.rootSelected = rootSelected;
	}

	

}
