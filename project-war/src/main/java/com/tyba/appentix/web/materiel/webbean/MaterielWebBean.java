package com.tyba.appentix.web.materiel.webbean;

import java.util.List;


import com.tyba.appentix.business.materiel.vo.MaterielsVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class MaterielWebBean  extends BaseWebBean{

	
	private static final long serialVersionUID = 1L;
	
	private MaterielsVO vo = new MaterielsVO();
	private List<MaterielsVO> vos;
	private List<MaterielsVO> selectedVOs;
	
	
	public MaterielsVO getVo() {
		return vo;
	}
	public void setVo(MaterielsVO returnVO) {
		this.vo = returnVO;
	}
	public List<MaterielsVO> getVos() {
		return vos;
	}
	public void setVos(List<MaterielsVO> vos) {
		this.vos = vos;
	}
	public List<MaterielsVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<MaterielsVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}

}
