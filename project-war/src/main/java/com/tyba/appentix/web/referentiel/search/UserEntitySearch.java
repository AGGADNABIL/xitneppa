package com.tyba.appentix.web.referentiel.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.referentiel.service.ReferentielService;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.appentix.business.referentiel.vo.transformer.UserEntityVOTransformer;
import com.tyba.technicalServices.security.UserEntity;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class UserEntitySearch extends SearchBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserEntitySearch(){
		
	}
	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listUsersSearchResultsVo = new ArrayList<ISearchResultVO>();
		UserEntityVOTransformer userVOTransformer = new UserEntityVOTransformer();
		for (Object o : resultQuery) {
			UserEntity user = (UserEntity) o;
			listUsersSearchResultsVo.add((UserEntityVO) userVOTransformer.model2VO(user));
		}
		resultBean.setRows(listUsersSearchResultsVo);
		return searchResultBean;
	}

	@Override
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {
		UserEntityCriteria criteria = (UserEntityCriteria) searchBean;
		ReferentielService referentielService = (ReferentielService) BeansLookuper
				.lookup("referentielService");
		return referentielService.findUserByCriteria(criteria.getUsername(), criteria.getFirstName(), criteria.getLastName(),criteria.getMatr(), criteria.getPopulation(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
