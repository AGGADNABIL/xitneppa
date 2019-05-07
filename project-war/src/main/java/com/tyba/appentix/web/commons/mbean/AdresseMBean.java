package com.tyba.appentix.web.commons.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.common.vo.AdresseVO;
import com.tyba.appentix.web.commons.Impl.AdresseBusDelegate;
import com.tyba.appentix.web.commons.Impl.AdresseSrvPresentation;
import com.tyba.appentix.web.commons.webbean.AdresseWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean(name="adresseMBean")
@ViewScoped
public class AdresseMBean extends BaseMBean {

	private static final long serialVersionUID = 1L;

	AdresseWebBean webBean = new AdresseWebBean();
	AdresseSrvPresentation adresseService = (AdresseSrvPresentation) BeansLookuper
			.lookup("adresseSrvPresentation");

	// @ManagedProperty(value="#{message}")
	// private MessageBean messageBean;

	@ManagedProperty(value = "#{paysMBean}")
	private PaysMBean paysMBean;

	private List<SelectItem> items;
	

	private Long SelectVille;

	public void creer() {
		clearReport();
		AdresseBusDelegate adresseBusDelegate = new AdresseBusDelegate();

		error = adresseBusDelegate.creerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	public AdresseVO getAdresse(){
		return adresseService.findVilleById(SelectVille);
	}

	public List<SelectItem> getItemsVille() {
		items = new ArrayList<SelectItem>();
		for (AdresseVO adr : adresseService.findVilleByIdPays(paysMBean
				.getSelectPays())) {
			items.add(new SelectItem(adr.getId(), adr.getVille()));
		}
		return items;
	}

	
	public void editer() {

		clearReport();
		AdresseBusDelegate adresseBusDelegate = new AdresseBusDelegate();
		// webBean.getVo().setIdEtudiant("10");

		error = adresseBusDelegate.editerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {
		clearReport();
		AdresseBusDelegate adresseBusDelegate = new AdresseBusDelegate();

		error = adresseBusDelegate.supprimerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void resetWebBeanVO() {
		webBean.setVo(new AdresseVO());
	}

	public String valider() {

		return "valider";

	}

	@PostConstruct
	public void init() {

	}

	public PaysMBean getPaysMBean() {
		return paysMBean;
	}

	public void setPaysMBean(PaysMBean paysMBean) {
		this.paysMBean = paysMBean;
	}

	public Long getSelectVille() {
		return SelectVille;
	}

	public void setSelectVille(Long selectVille) {
		SelectVille = selectVille;
	}

	public AdresseWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(AdresseWebBean webBean) {
		this.webBean = webBean;
	}

	public AdresseSrvPresentation getAdresseService() {
		return adresseService;
	}

	public void setAdresseService(AdresseSrvPresentation adresseService) {
		this.adresseService = adresseService;
	}

	public void onRowSelect(SelectEvent event) {

		webBean.setVo((AdresseVO) event.getObject());
		// System.out.println("chV :"+chV.getNom());

	}

}
