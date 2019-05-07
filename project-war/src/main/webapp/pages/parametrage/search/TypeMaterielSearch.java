package com.tyba.appentix.web.parametrage.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.parametrage.model.TypeMateriel;
import com.tyba.appentix.business.parametrage.service.ParametrageTypeMaterielService;
import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;
import com.tyba.appentix.business.parametrage.vo.transformer.TypeMaterielVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class TypeMaterielSearch extends SearchBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listTypeMaterielSearchResultsVo = new ArrayList<ISearchResultVO>();
		TypeMaterielVOTransformer typeMaterielVOTransformer = new TypeMaterielVOTransformer();
		for (Object o : resultQuery) {
			TypeMateriel srv = (TypeMateriel) o;
			listTypeMaterielSearchResultsVo.add((TypeMaterielVO) typeMaterielVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listTypeMaterielSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {

		    TypeMaterielCriteria criteria = (TypeMaterielCriteria) searchBean;
			ParametrageTypeMaterielService parametrageTypeMaterielService = (ParametrageTypeMaterielService) BeansLookuper
					.lookup("parametrageTypeMaterielService");
			return parametrageTypeMaterielService.findByCriteria(criteria.getReference(),criteria.getLibelle(), criteria.getDescription(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
