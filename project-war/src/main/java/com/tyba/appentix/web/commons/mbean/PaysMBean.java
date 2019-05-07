package com.tyba.appentix.web.commons.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.appentix.web.commons.Impl.PaysBusDelegate;
import com.tyba.appentix.web.commons.Impl.PaysSrvPresentation;
import com.tyba.appentix.web.commons.webbean.PaysWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean(name="paysMBean")
@ViewScoped
public class PaysMBean extends BaseMBean {

	private static final long serialVersionUID = 1L;

	PaysWebBean webBean = new PaysWebBean();
	PaysSrvPresentation paysService = (PaysSrvPresentation) BeansLookuper
			.lookup("paysSrvPresentation");
	
	private List<SelectItem> pays;
	private Long selectPays;

	public void creer() {
		clearReport();
		PaysBusDelegate paysBusDelegate = new PaysBusDelegate();

		// webBean.getVo().setEtat('V');
		error = paysBusDelegate.creerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	
	public void editer() {

		clearReport();
		PaysBusDelegate paysBusDelegate = new PaysBusDelegate();
		// webBean.getVo().setIdEtudiant("10");

		error = paysBusDelegate.editerService(webBean);
		// System.out.println("error :"+error);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {

		clearReport();
		PaysBusDelegate paysBusDelegate = new PaysBusDelegate();
		error = paysBusDelegate.supprimerService(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void resetWebBeanVO() {
		webBean.setVo(new PaysVO());
	}

	public String valider() {

		return "valider";

	}

	public List<SelectItem> getItemsPays()
	{
		 pays=new ArrayList<SelectItem>();
		for (PaysVO p : paysService.findAllPays()){
			
			pays.add(new SelectItem(p.getId(), p.getNom()));
		}
		
		return pays;
	}
	
	@PostConstruct
	public void init() {
     selectPays=0L;
	}

	public Long getSelectPays() {
		return selectPays;
	}

	public void setSelectPays(Long selectPays) {
		this.selectPays = selectPays;
	}


	public PaysWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(PaysWebBean webBean) {
		this.webBean = webBean;
	}

	public PaysSrvPresentation getPaysService() {
		return paysService;
	}

	public void setPaysService(PaysSrvPresentation paysService) {
		this.paysService = paysService;
	}



	public List<SelectItem> getPays() {
		return pays;
	}


	public void setPays(List<SelectItem> pays) {
		this.pays = pays;
	}


	public void onRowSelect(SelectEvent event) {

		webBean.setVo((PaysVO) event.getObject());
		// System.out.println("chV :"+chV.getNom());

	}

}
