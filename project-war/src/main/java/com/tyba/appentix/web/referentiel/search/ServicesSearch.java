package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.transformer.ServicesVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class ServicesSearch extends SearchBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listServicesSearchResultsVo = new ArrayList<ISearchResultVO>();
		ServicesVOTransformer servicesVOTransformer = new ServicesVOTransformer();
		for (Object o : resultQuery) {
			Services srv = (Services) o;
			listServicesSearchResultsVo.add((ServicesVO) servicesVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listServicesSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {

			ServicesCriteria criteria = (ServicesCriteria) searchBean;
			ReferentielService referentielService = (ReferentielService) BeansLookuper
					.lookup("referentielService");
			return referentielService.findServicesByCriteria(criteria.getCodeService(), criteria.getLibelleService(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
