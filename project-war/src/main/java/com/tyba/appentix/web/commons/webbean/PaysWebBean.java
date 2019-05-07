package com.tyba.appentix.web.commons.webbean;

import java.util.List;

import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class PaysWebBean extends BaseWebBean {
	private static final long serialVersionUID = 1L;
	
	private PaysVO vo = new PaysVO();
	private List<PaysVO> vos;
	private List<PaysVO> selectedVOs;
	
	
	public PaysVO getVo() {
		return vo;
	}
	public void setVo(PaysVO vo) {
		this.vo = vo;
	}
	public List<PaysVO> getVos() {
		return vos;
	}
	public void setVos(List<PaysVO> vos) {
		this.vos = vos;
	}
	public List<PaysVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<PaysVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}
	
	
	
	
	

}

