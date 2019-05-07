package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.referentiel.model.ProfilMenu;
import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.appentix.business.referentiel.vo.transformer.ProfilMenuVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class ProfilMenuSearch extends SearchBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listMenuSearchResultsVo = new ArrayList<ISearchResultVO>();
		ProfilMenuVOTransformer proAccVOTransformer = new ProfilMenuVOTransformer();
		for (Object o : resultQuery) {
			ProfilMenu srv = (ProfilMenu) o;
			listMenuSearchResultsVo.add((ProfilMenuVO) proAccVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listMenuSearchResultsVo);
		return searchResultBean;
	}

	@Override
	public List specificExecute(Serializable searchBean,
		SearchConfig configuration, String sortField, String sortOrder) {
		ProfilMenuCriteria criteria = (ProfilMenuCriteria) searchBean;
		ReferentielService referentielService = (ReferentielService) BeansLookuper.lookup("referentielService");
		return referentielService.findMenuByCriteria(criteria.getMenuMenu(), criteria.getLibMenu(), criteria.getRang(), 
				criteria.getForma(), criteria.getValid(), criteria.getDroit(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
