package com.tyba.appentix.web.materiel.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.appentix.business.materiel.service.MaintenanceService;
import com.tyba.appentix.business.materiel.vo.MaintenanceVO;
import com.tyba.appentix.business.materiel.vo.transformer.MaintenanceVOTransformer;
import com.tyba.technicalServices.spring.BeansLookuper;
import com.tyba.technicalServices.web.ISearchResultVO;
import com.tyba.technicalServices.web.ResultBean;
import com.tyba.technicalServices.web.SearchBase;
import com.tyba.technicalServices.web.SearchConfig;
import com.tyba.technicalServices.web.SearchResultBean;

public class MaintenanceSearch extends SearchBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public SearchResultBean tranform(List<Object> resultQuery) {
		SearchResultBean searchResultBean = new SearchResultBean();
		ResultBean resultBean = new ResultBean();
		searchResultBean.setResultBean(resultBean);
		List<ISearchResultVO> listMaintenanceSearchResultsVo = new ArrayList<ISearchResultVO>();
		MaintenanceVOTransformer MaintenanceVOTransformer = new MaintenanceVOTransformer();
		for (Object o : resultQuery) {
			Maintenance srv = (Maintenance) o;
			listMaintenanceSearchResultsVo.add((MaintenanceVO) MaintenanceVOTransformer.model2VO(srv));
		}
		resultBean.setRows(listMaintenanceSearchResultsVo);
		return searchResultBean;
	}

	@SuppressWarnings("unchecked")
	public List specificExecute(Serializable searchBean,
			SearchConfig configuration, String sortField, String sortOrder) {
		MaintenanceCriteria criteria = (MaintenanceCriteria) searchBean;
			MaintenanceService maintenanceService = (MaintenanceService) BeansLookuper
					.lookup("maintenanceService");
			return maintenanceService.findMaintenanceByCriteria(criteria.getId(), criteria.getMateriel(), criteria.getMotif(), criteria.getCentreMaintenance(),
					criteria.getTechnicien(), criteria.getFrais(), criteria.getDateDebut(), criteria.getDateFin(),
					criteria.getDuree(), criteria.getRapport(), configuration, sortField, sortOrder);
	}

	@Override
	public SearchResultBean precondition(Serializable searchBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
