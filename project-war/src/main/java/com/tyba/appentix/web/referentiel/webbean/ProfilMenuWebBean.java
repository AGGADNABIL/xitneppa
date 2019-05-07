package com.tyba.appentix.web.referentiel.webbean;

import java.util.ArrayList;
import java.util.List;

import com.tyba.appentix.business.referentiel.vo.ProfilAccVO;
import com.tyba.appentix.business.referentiel.vo.ProfilMenuVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class ProfilMenuWebBean extends BaseWebBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7587438613908301357L;

	private ProfilMenuVO vo ; 
	private List<ProfilMenuVO> vos;
	private List<ProfilMenuVO> selectedVOs;
	private List<ProfilAccVO> selectedProfilAcc;
	private ProfilAccVO profil ;
	private List<ProfilMenuVO> root;
	private ProfilMenuVO selectedRoot;


	
	public ProfilMenuWebBean() {
		vo = new ProfilMenuVO();
		vos = new ArrayList<ProfilMenuVO>();
		selectedVOs = new ArrayList<ProfilMenuVO>();
		profil = new ProfilAccVO();
		root= new ArrayList<ProfilMenuVO>();
		selectedRoot= new ProfilMenuVO();
	}
	

	public ProfilMenuVO getVo() {
		return vo;
	}

	public void setVo(ProfilMenuVO vo) {
		this.vo = vo;
	}

	public List<ProfilMenuVO> getVos() {
		return vos;
	}

	public void setVos(List<ProfilMenuVO> vos) {
		this.vos = vos;
	}

	public List<ProfilMenuVO> getSelectedVOs() {
		return selectedVOs;
	}

	public void setSelectedVOs(List<ProfilMenuVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}

	public List<ProfilAccVO> getSelectedProfilAcc() {
		return selectedProfilAcc;
	}

	public void setSelectedProfilAcc(List<ProfilAccVO> selectedProfilAcc) {
		this.selectedProfilAcc = selectedProfilAcc;
	}

	public ProfilAccVO getProfil() {
		return profil;
	}

	public void setProfil(ProfilAccVO profil) {
		this.profil = profil;
	}


	public List<ProfilMenuVO> getRoot() {
		return root;
	}


	public void setRoot(List<ProfilMenuVO> root) {
		this.root = root;
	}


	public ProfilMenuVO getSelectedRoot() {
		return selectedRoot;
	}


	public void setSelectedRoot(ProfilMenuVO selectedRoot) {
		this.selectedRoot = selectedRoot;
	}
	
	
	
	
}
