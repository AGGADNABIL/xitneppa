package com.tyba.appentix.web.parametrage.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.parametrage.model.Marques;
import com.tyba.appentix.business.parametrage.service.MarqueService;
import com.tyba.appentix.business.parametrage.vo.MarquesVO;
import com.tyba.appentix.business.parametrage.vo.transformer.MarquesVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class MarquesSearch extends SearchBase implements Serializable{
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listMarquesSearchResultsVo = new ArrayList<ISearchResultVO>();
		MarquesVOTransformer marquesVOTransformer = new MarquesVOTransformer();
		for (Object o : resultQuery) {
			Marques srv = (Marques) o;
			listMarquesSearchResultsVo.add((MarquesVO) marquesVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listMarquesSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {

			MarquesCriteria criteria = (MarquesCriteria) searchBean;
			 MarqueService  marqueService = (MarqueService) BeansLookuper
					.lookup("marqueService");
			return marqueService.findMarquesByCriteria(criteria.getLibelle(),criteria.getDescription(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
