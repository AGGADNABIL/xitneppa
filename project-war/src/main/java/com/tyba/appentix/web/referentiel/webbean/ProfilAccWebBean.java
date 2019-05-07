package com.tyba.appentix.web.referentiel.webbean;

import java.util.List;

import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class ProfilAccWebBean extends BaseWebBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProfilAccVO vo = new ProfilAccVO();
	private List<ProfilAccVO> vos;
	private List<ProfilAccVO> selectedVOs;
	
	
	public ProfilAccVO getVo() {
		return vo;
	}
	public void setVo(ProfilAccVO vo) {
		this.vo = vo;
	}
	public List<ProfilAccVO> getVos() {
		return vos;
	}
	public void setVos(List<ProfilAccVO> vos) {
		this.vos = vos;
	}
	public List<ProfilAccVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<ProfilAccVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}

}
