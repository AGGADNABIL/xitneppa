package com.tyba.appentix.web.parametrage.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.service.ChantierService;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.appentix.business.parametrage.vo.transformer.ChantiersVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class ChantiersSearch extends SearchBase implements Serializable{
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listChantiersSearchResultsVo = new ArrayList<ISearchResultVO>();
		ChantiersVOTransformer chantiersVOTransformer = new ChantiersVOTransformer();
		for (Object o : resultQuery) {
			Chantiers srv = (Chantiers) o;
			listChantiersSearchResultsVo.add((ChantiersVO) chantiersVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listChantiersSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {

			ChantiersCriteria criteria = (ChantiersCriteria) searchBean;
			 ChantierService  chantierService = (ChantierService) BeansLookuper
					.lookup("chantierService");
			return chantierService.findChantiersByCriteria(criteria.getReference(),criteria.getNom(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
