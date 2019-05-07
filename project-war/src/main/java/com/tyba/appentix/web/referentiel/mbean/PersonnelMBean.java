package com.tyba.appentix.web.referentiel.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.web.referentiel.ReferentielSrvPresentation;
import com.tyba.appentix.web.referentiel.impl.ReferentielBusDelegate;
import com.tyba.appentix.web.referentiel.webbean.PersonnelWebBean;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;

@ManagedBean
@ViewScoped
public class PersonnelMBean extends BaseMBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PersonnelWebBean webBean= new PersonnelWebBean();
	private PersonnelVO vo = new PersonnelVO();
	
	ReferentielSrvPresentation referentielService = (ReferentielSrvPresentation) BeansLookuper
			.lookup("referentielSrvPresentation");

	public String chargerInfos() {
		
		if(webBean.getVo().getMatr()==null )
			vo = referentielService.findPersonnelByCode(webBean.getVo().getNumEmploi());
		else if (webBean.getVo().getNumEmploi() ==null)
			vo = referentielService.findPersonnelByMatr(webBean.getVo().getMatr());
		else
		vo = referentielService.findPersonnelByCodeMatr(webBean.getVo().getNumEmploi(),webBean.getVo().getMatr());
		
		webBean.setVo(vo);
		
		return "chargerPers";

	}
	
	public String valider(){
		
		return "valider";
		
	}

	public String imprimer(){
			
				clearReport();
				ReferentielBusDelegate referentielBusDelegate = new ReferentielBusDelegate();
				error = referentielBusDelegate.impression_carte2(webBean);
				feedReport();
				
			return "imprimer";
		}
	
	public PersonnelWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(PersonnelWebBean webBean) {
		this.webBean = webBean;
	}

	public PersonnelVO getVo() {
		return vo;
	}

	public void setVo(PersonnelVO vo) {
		this.vo = vo;
	}

}
