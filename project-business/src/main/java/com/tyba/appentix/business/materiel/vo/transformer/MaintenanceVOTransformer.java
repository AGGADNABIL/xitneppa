package com.tyba.appentix.business.materiel.vo.transformer;

import com.tyba.appentix.business.materiel.model.Maintenance;
import com.tyba.appentix.business.materiel.vo.MaintenanceVO;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class MaintenanceVOTransformer extends BaseTransformer<Maintenance, MaintenanceVO>{

	
	private static MaintenanceVOTransformer transformer = new MaintenanceVOTransformer();

	@Override
	public MaintenanceVO model2VO(Maintenance model, boolean... forCombo) {
		MaintenanceVO vo = new MaintenanceVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setCentreMaintenance(model.getCentreMaintenance());
			vo.setDateDebut(model.getDateDebut());
			vo.setDateFin(model.getDateFin());
			vo.setDuree(model.getDuree());
			vo.setFrais(model.getFrais());
			vo.setMateriel(model.getMateriel());
			vo.setMotif(model.getMotif());
			vo.setProblemFrequent(model.getProblemFrequent());
			vo.setRapport(model.getRapport());
			vo.setStatut(model.getStatut());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Maintenance vo2Model(MaintenanceVO vo) {
		Maintenance model = new Maintenance();
		Objects.copyProperties(model, vo);
		return model;
	}

	public static MaintenanceVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(MaintenanceVOTransformer transformer) {
		MaintenanceVOTransformer.transformer = transformer;
	}

}
