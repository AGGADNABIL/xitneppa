package com.tyba.appentix.web.referentiel.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.appentix.web.referentiel.impl.ReferentielBusDelegate;
import com.tyba.appentix.web.referentiel.webbean.UserEntityWebBean;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean
@ViewScoped
public class UserEntityMBean extends BaseMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserEntityWebBean webBean = new UserEntityWebBean();
	
	public void creer() {
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		System.out.println("------------>id: "
				+ webBean.getVo().getUsername());
		
		webBean.getVo().setPassword("ucad");
		error = referentielBusDelegate.creerUser(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void editer() {
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		// webBean.getVo().setIdEtudiant("10");
		
		error = referentielBusDelegate.editerUser(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {
		
		clearReport();
		ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
		error = referentielBusDelegate.supprimerUser(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}
	
	public void onRowDblClckSelect(final SelectEvent event) {

		PersonnelVO persoVO = (PersonnelVO) event.getObject();

		this.webBean.getVo().setMatr(persoVO.getMatr());
		this.webBean.getVo().setLastName(persoVO.getNomNaissance());	
		this.webBean.getVo().setFirstName(persoVO.getPrenom());
		this.webBean.getVo().setUsername(persoVO.getEmail());
	}
	
	public void onRowDblClckSelectProf(final SelectEvent event) {

		ProfilAccVO profilVO = (ProfilAccVO) event.getObject();
		this.webBean.getVo().setProfil(profilVO.getCodeProAcc());

	}
	
	public void onRowDblClckSelectE(final SelectEvent event) {

		PersonnelVO persoVO = (PersonnelVO) event.getObject();

		this.webBean.getVo().setMatr(persoVO.getMatr());
		this.webBean.getVo().setLastName(persoVO.getNomNaissance());	
		this.webBean.getVo().setFirstName(persoVO.getPrenom());
		this.webBean.getVo().setUsername(persoVO.getEmail());
	}
	
	public void onRowDblClckSelectProfE(final SelectEvent event) {

		ProfilAccVO profilVO = (ProfilAccVO) event.getObject();
		this.webBean.getVo().setProfil(profilVO.getCodeProAcc());

	}
	
	public void resetWebBeanVO() {
		webBean.setVo(new UserEntityVO());
	}
	
	public UserEntityWebBean getWebBean() {
		return webBean;
	}
	public void setWebBean(UserEntityWebBean webBean) {
		this.webBean = webBean;
	}
	

}
