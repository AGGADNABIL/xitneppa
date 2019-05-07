package com.tyba.appentix.web.referentiel.webbean;

import java.util.List;


import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class ServicesWebBean extends BaseWebBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicesVO vo = new ServicesVO();
	private List<ServicesVO> vos;
	private List<ServicesVO> selectedVOs;
	
	
	public ServicesVO getVo() {
		return vo;
	}
	public void setVo(ServicesVO vo) {
		this.vo = vo;
	}
	public List<ServicesVO> getVos() {
		return vos;
	}
	public void setVos(List<ServicesVO> vos) {
		this.vos = vos;
	}
	public List<ServicesVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<ServicesVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}

}
