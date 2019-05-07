package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.referentiel.model.Personnel;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.transformer.PersonnelVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class PersonnelSearch extends SearchBase implements Serializable{

	/**
	 * 
	 */
	
	public PersonnelSearch(){
		super();

		
	}
	
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listPersonnelSearchResultsVo = new ArrayList<ISearchResultVO>();
		PersonnelVOTransformer personnelVOTransformer = new PersonnelVOTransformer();
		for (Object o : resultQuery) {
			Personnel personnel = (Personnel) o;
			listPersonnelSearchResultsVo.add((PersonnelVO) personnelVOTransformer.model2VO(personnel));
		}
		resultBean.setRows(listPersonnelSearchResultsVo);
		return searchResultBean;
	}

	@Override
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {
		PersonnelCriteria criteria = (PersonnelCriteria) searchBean;
		ReferentielService referentielService = (ReferentielService) BeansLookuper
				.lookup("referentielService");
		return referentielService.findPersonneleByCriteria(criteria.getNumEmploi() , criteria.getNomNaissance(), criteria.getPrenom(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
