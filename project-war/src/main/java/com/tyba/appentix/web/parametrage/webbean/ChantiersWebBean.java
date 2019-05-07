package com.tyba.appentix.web.parametrage.webbean;

import java.util.List;

import com.tyba.appentix.business.parametrage.vo.ChantiersVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class ChantiersWebBean extends BaseWebBean {
	private static final long serialVersionUID = 1L;
	
	private ChantiersVO vo = new ChantiersVO();
	private List<ChantiersVO> vos;
	private List<ChantiersVO> selectedVOs;
	
	
	public ChantiersVO getVo() {
		return vo;
	}
	public void setVo(ChantiersVO vo) {
		this.vo = vo;
	}
	public List<ChantiersVO> getVos() {
		return vos;
	}
	public void setVos(List<ChantiersVO> vos) {
		this.vos = vos;
	}
	public List<ChantiersVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<ChantiersVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}
	
	

}
