package com.tyba.appentix.web.commons.webbean;

import java.util.List;

import com.tyba.appentix.business.common.vo.AdresseVO;
import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class AdresseWebBean extends BaseWebBean {
	private static final long serialVersionUID = 1L;
	
	private AdresseVO vo = new AdresseVO();
	private List<AdresseVO> vos;
	private List<AdresseVO> selectedVOs;
	
	
	public AdresseVO getVo() {
		return vo;
	}
	public void setVo(AdresseVO vo) {
		this.vo = vo;
	}
	public List<AdresseVO> getVos() {
		return vos;
	}
	public void setVos(List<AdresseVO> vos) {
		this.vos = vos;
	}
	public List<AdresseVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<AdresseVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}
	
	
	
	
	

}

