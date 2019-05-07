package com.tyba.appentix.web.parametrage.webbean;

import java.util.List;

import com.tyba.appentix.business.parametrage.vo.MarquesVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class MarquesWebBean extends BaseWebBean {
	private static final long serialVersionUID = 1L;

	private MarquesVO vo = new MarquesVO();
	private List<MarquesVO> vos;
	private List<MarquesVO> selectedVOs;

	public MarquesVO getVo() {
		return vo;
	}

	public void setVo(MarquesVO vo) {
		this.vo = vo;
	}

	public List<MarquesVO> getVos() {
		return vos;
	}

	public void setVos(List<MarquesVO> vos) {
		this.vos = vos;
	}

	public List<MarquesVO> getSelectedVOs() {
		return selectedVOs;
	}

	public void setSelectedVOs(List<MarquesVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}

}
