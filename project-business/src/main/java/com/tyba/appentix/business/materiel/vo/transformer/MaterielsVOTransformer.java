package com.tyba.appentix.business.materiel.vo.transformer;

import com.tyba.appentix.business.materiel.model.Materiels;


import com.tyba.appentix.business.materiel.vo.MaterielsVO;
import com.tyba.appentix.business.parametrage.vo.transformer.TypeMaterielVOTransformer;
import com.tyba.appentix.business.referentiel.model.Services;
import com.tyba.appentix.business.referentiel.vo.ServicesVO;
import com.tyba.appentix.business.referentiel.vo.transformer.ServicesVOTransformer;
import com.tyba.technicalServices.core.BaseTransformer;
import com.tyba.technicalServices.tools.Objects;

public class MaterielsVOTransformer extends BaseTransformer<Materiels, MaterielsVO>{

    private TypeMaterielVOTransformer typematerielTransformer = new TypeMaterielVOTransformer();
    
	private static MaterielsVOTransformer transformer = new MaterielsVOTransformer();
	@Override
	public MaterielsVO model2VO(Materiels model, boolean... forCombo) {
		MaterielsVO vo = new MaterielsVO();
		if (forCombo.length > 0 && forCombo[0]) {
			vo.setId(model.getId());
			vo.setLibelle(model.getLibelle());
			vo.setDescription(model.getDescription());
			vo.setDateIdentification(model.getDateIdentification());
			vo.setDetails(model.getDetails());
			vo.setEtat(model.getEtat());
			vo.setFicheTechnique(model.getFicheTechnique());
			vo.setImage(model.getImage());
			vo.setMatricule(model.getMatricule());
			vo.setModel(model.getModel());
			vo.setPropriete(model.getPropriete());
			vo.setReference(model.getReference());
			vo.setStatut(model.getStatut());
			vo.setTypeMateriel(model.getTypeMateriel());
		} else {
			Objects.copyProperties(vo, model);
		}
		return vo;
	}

	@Override
	public Materiels vo2Model(MaterielsVO vo) {
		Materiels model = new Materiels();
		

		Objects.copyProperties(model, vo);
		
		
		
		return model;
	}

	


	public static MaterielsVOTransformer getTransformer() {
		return transformer;
	}

	public static void setTransformer(MaterielsVOTransformer transformer) {
		MaterielsVOTransformer.transformer = transformer;
	}

	public TypeMaterielVOTransformer getTypematerielTransformer() {
		return typematerielTransformer;
	}

	public void setTypematerielTransformer(
			TypeMaterielVOTransformer typematerielTransformer) {
		this.typematerielTransformer = typematerielTransformer;
	}
	

	
	
}
