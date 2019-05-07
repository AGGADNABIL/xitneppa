package com.tyba.appentix.web.referentiel.webbean;

import java.util.List;

import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class PersonnelWebBean extends BaseWebBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonnelVO vo = new PersonnelVO();
	private List<PersonnelVO> vos;
	private List<PersonnelVO> selectedVOs;
	
	
	public PersonnelVO getVo() {
		return vo;
	}
	public void setVo(PersonnelVO vo) {
		this.vo = vo;
	}
	public List<PersonnelVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<PersonnelVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}
	public List<PersonnelVO> getVos() {
		return vos;
	}
	public void setVos(List<PersonnelVO> vos) {
		this.vos = vos;
	}


}
