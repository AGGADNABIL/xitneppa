package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.referentiel.model.ProfilAcc;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.transformer.ProfilAccVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class ProfilAccSearch extends SearchBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listCategSearchResultsVo = new ArrayList<ISearchResultVO>();
		ProfilAccVOTransformer proAccVOTransformer = new ProfilAccVOTransformer();
		for (Object o : resultQuery) {
			ProfilAcc srv = (ProfilAcc) o;
			listCategSearchResultsVo.add((ProfilAccVO) proAccVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listCategSearchResultsVo);
		return searchResultBean;
	}

	@Override
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {
		ProfilAccCriteria criteria = (ProfilAccCriteria) searchBean;
		ReferentielService referentielService = (ReferentielService) BeansLookuper
				.lookup("referentielService");
		return referentielService.findProAccByCriteria(criteria.getCodeProAcc(), criteria.getLibPro(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
