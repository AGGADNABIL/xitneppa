package com.tyba.appentix.web.materiel.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.appentix.business.materiel.service.MaterielService;
import com.tyba.appentix.business.materiel.vo.MaterielsVO;
import com.tyba.appentix.business.materiel.vo.transformer.MaterielsVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class MaterielsSearch extends SearchBase implements Serializable{

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
MaterielsVOTransformer servicesVOTransformer = new MaterielsVOTransformer();
		for (Object o : resultQuery) {
			Materiels srv = (Materiels) o;
			listServicesSearchResultsVo.add((MaterielsVO) servicesVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listServicesSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {

			MaterielsCriteria criteria = (MaterielsCriteria) searchBean;
			MaterielService referentielService = (MaterielService) BeansLookuper
					.lookup("materielService");
			return referentielService.findMaterielsByCriteria(criteria.getReferenceMateriel(), criteria.getLibelleMateriel(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
