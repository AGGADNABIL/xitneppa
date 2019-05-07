package com.tyba.appentix.web.referentiel.webbean;

import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.referentiel.vo.PersonnelVO;
import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.UserEntityVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class UserEntityWebBean extends BaseWebBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserEntityVO vo;
	private List<UserEntityVO> vos;
	private List<UserEntityVO> selectedVOs;
	private PersonnelVO selectedPerso;
	private ProfilAccVO selectedProfil;
	

	public UserEntityWebBean() {
		vo = new UserEntityVO();
		vos = new ArrayList<UserEntityVO>();
		selectedVOs = new ArrayList<UserEntityVO>();
		selectedPerso= new PersonnelVO();
		selectedProfil= new ProfilAccVO();
	}

	public UserEntityVO getVo() {
		return vo;
	}
	public void setVo(UserEntityVO vo) {
		this.vo = vo;
	}
	public List<UserEntityVO> getVos() {
		return vos;
	}
	public void setVos(List<UserEntityVO> vos) {
		this.vos = vos;
	}
	public List<UserEntityVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<UserEntityVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}
	public PersonnelVO getSelectedPerso() {
		return selectedPerso;
	}
	public void setSelectedPerso(PersonnelVO selectedPerso) {
		this.selectedPerso = selectedPerso;
	}

	public ProfilAccVO getSelectedProfil() {
		return selectedProfil;
	}

	public void setSelectedProfil(ProfilAccVO selectedProfil) {
		this.selectedProfil = selectedProfil;
	}
	
	
}
