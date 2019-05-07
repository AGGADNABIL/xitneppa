package com.tyba.appentix.web.materiel.webbean;

import java.util.List;

import org.primefaces.event.SelectEvent;

import com.tyba.appentix.business.materiel.vo.MaintenanceVO;
import com.tyba.technicalServices.web.BaseWebBean;

public class MaintenanceWebBean extends BaseWebBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MaintenanceVO vo = new MaintenanceVO();
	private List<MaintenanceVO> vos;
	private List<MaintenanceVO> selectedVOs;
	
	
	public MaintenanceVO getVo() {
		return vo;
	}
	public void setVo(MaintenanceVO vo) {
		this.vo = vo;
	}
	public List<MaintenanceVO> getVos() {
		return vos;
	}
	public void setVos(List<MaintenanceVO> vos) {
		this.vos = vos;
	}
	public List<MaintenanceVO> getSelectedVOs() {
		return selectedVOs;
	}
	public void setSelectedVOs(List<MaintenanceVO> selectedVOs) {
		this.selectedVOs = selectedVOs;
	}
	
	public void onRowSelect(SelectEvent event) {
		setVo((MaintenanceVO) event.getObject());
    }


}
