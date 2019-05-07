package com.tyba.appentix.web.common.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.pays.service.PaysService;
import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.appentix.business.common.vo.transformer.PaysVOTransformer;
import com.tyba.appentix.business.parametrage.model.Chantiers;
import com.tyba.appentix.business.parametrage.service.ChantierService;
import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.appentix.business.parametrage.vo.transformer.ChantiersVOTransformer;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.transformer.ServicesVOTransformer;
import com.tyba.appentix.web.referentiel.search.ServicesCriteria;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class PaysSearch extends SearchBase implements Serializable{
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listPaysSearchResultsVo = new ArrayList<ISearchResultVO>();
		PaysVOTransformer paysVOTransformer = new PaysVOTransformer();
		for (Object o : resultQuery) {
			Pays srv = (Pays) o;
			listPaysSearchResultsVo.add((PaysVO) paysVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listPaysSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {

			PaysCriteria criteria = (PaysCriteria) searchBean;
			 PaysService  paysService = (PaysService) BeansLookuper
					.lookup("paysService");
			return paysService.findPaysByCriteria(criteria.getNom(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
