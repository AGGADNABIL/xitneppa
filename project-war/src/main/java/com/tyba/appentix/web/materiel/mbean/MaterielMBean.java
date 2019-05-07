package com.tyba.appentix.web.materiel.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.materiel.vo.MaterielsVO;
import com.tyba.appentix.business.materiel.vo.transformer.MaterielsVOTransformer;
import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;
import com.tyba.appentix.business.parametrage.vo.transformer.TypeMaterielVOTransformer;
import com.tyba.appentix.web.materiel.MaterielSrvPresentation;
import com.tyba.appentix.web.materiel.impl.MaterielBusDelegate;
import com.tyba.appentix.web.materiel.webbean.MaterielWebBean;
import com.tyba.appentix.web.parametrage.ParametrageSrvPresentation;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.BaseMBean;
import com.tyba.technicalServices.web.JSFUtils;

@ManagedBean(name = "materielMBean")
@SessionScoped
public class MaterielMBean extends BaseMBean {

	private String type;

	private List<TypeMaterielVO> types = new ArrayList<TypeMaterielVO>();

	private List<String> typesMateriel = new ArrayList<String>();

	private static final long serialVersionUID = 1265033802066039769L;

	MaterielWebBean webBean = new MaterielWebBean();

	MaterielSrvPresentation materielService = (MaterielSrvPresentation) BeansLookuper
			.lookup("materielSrvPresentation");

	ParametrageSrvPresentation parametrageService = (ParametrageSrvPresentation) BeansLookuper
			.lookup("parametrageSrvPresentation");

	@PostConstruct
	public void init() {
		types = parametrageService.findAllTypeMateriels();
		for (int i = 0; i < types.size(); i++) {
			System.out.println("coucou");

			typesMateriel.add(types.get(i).getReference());
		}

	}

	public void creer() {
		clearReport();
		TypeMaterielVO typematerielVO = parametrageService
				.findTypeMaterielByTypeId(type);

        TypeMaterielVOTransformer tMT= new TypeMaterielVOTransformer();
        
		webBean.getVo().setTypeMateriel(tMT.vo2Model(typematerielVO));
		MaterielBusDelegate materielBusDelegate = new MaterielBusDelegate();

		error = materielBusDelegate.creerMateriel(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void editer() {
		clearReport();
		MaterielBusDelegate materielBusDelegate = new MaterielBusDelegate();

		System.out
				.println("editer editer editer editer editer editer editer editer editer "
						+ webBean.getVo().getModel());

		error = materielBusDelegate.editerMateriel(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public void supprimer() {

		clearReport();

		System.out
				.println("supprimer supprimer supprimer supprimer supprimer supprimer   "
						+ webBean.getVo().getDetails());

		MaterielBusDelegate materielBusDelegate = new MaterielBusDelegate();
		error = materielBusDelegate.supprimerMateriel(webBean);
		if (!isError()) {
			JSFUtils.contextExecute("_hideDialog()");
		}
		feedReport();
	}

	public String redirect() {
		System.out
				.println("redirect redirect redirect redirect redirect redirect ");
		return "/pages/materiel/ficheMateriel/gestionMateriel.xhtml";
	}

	public void resetWebBeanVO() {
		webBean.setVo(new MaterielsVO());
	}

	public void onRowSelect(SelectEvent event) {
		webBean.setVo((MaterielsVO) event.getObject());

	}

	public MaterielWebBean getWebBean() {
		return webBean;
	}

	public void setWebBean(MaterielWebBean webBean) {
		this.webBean = webBean;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MaterielSrvPresentation getMaterielService() {
		return materielService;
	}

	public void setMaterielService(MaterielSrvPresentation materielService) {
		this.materielService = materielService;
	}

	public List<TypeMaterielVO> getTypes() {
		return types;
	}

	public void setTypes(List<TypeMaterielVO> types) {
		this.types = types;
	}

	public List<String> getTypesMateriel() {
		return typesMateriel;
	}

	public void setTypesMateriel(List<String> typesMateriel) {
		this.typesMateriel = typesMateriel;
	}

	public ParametrageSrvPresentation getParametrageService() {
		return parametrageService;
	}

	public void setParametrageService(
			ParametrageSrvPresentation parametrageService) {
		this.parametrageService = parametrageService;
	}

}
