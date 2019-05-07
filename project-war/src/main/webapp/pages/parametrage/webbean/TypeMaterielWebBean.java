package com.tyba.appentix.web.parametrage.webbean;

import java.util.List;

import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;
import com.tyba.technicalServices.web.BaseWebBean;


public class TypeMaterielWebBean extends BaseWebBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TypeMaterielVO vo = new TypeMaterielVO();
	private List<TypeMaterielVO> vos;
	private List<TypeMaterielVO> selectedVOs;
	
	
	public TypeMaterielVO getVo() {
		return vo;
	}
	public void setVo(TypeMaterielVO vo) {
		this.vo = vo;
	}
	public List<TypeMaterielVO> getVos() {
		return vos;
	}
	public void setVos(List<TypeMaterielVO> vos) {
		this.vos = vos;
	}
	public List<TypeMaterielVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<TypeMaterielVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}

}
