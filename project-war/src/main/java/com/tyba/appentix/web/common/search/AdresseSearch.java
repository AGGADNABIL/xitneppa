package com.tyba.appentix.web.common.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.common.Adresse;
import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.pays.service.AdresseService;
import com.tyba.appentix.business.common.pays.service.PaysService;
import com.tyba.appentix.business.common.vo.AdresseVO;
import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.appentix.business.common.vo.transformer.AdresseVOTransformer;
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

public class AdresseSearch extends SearchBase implements Serializable{
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listAdresseSearchResultsVo = new ArrayList<ISearchResultVO>();
		AdresseVOTransformer adresseVOTransformer = new AdresseVOTransformer();
		for (Object o : resultQuery) {
			Adresse srv = (Adresse) o;
			listAdresseSearchResultsVo.add((AdresseVO)adresseVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listAdresseSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {

			AdresseCriteria criteria = (AdresseCriteria) searchBean;
			 AdresseService  adresseService = (AdresseService) BeansLookuper
					.lookup("adresseService");
			return adresseService.findByCriteria(criteria.getDetail(), criteria.getVille(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
