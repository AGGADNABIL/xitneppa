
package com.tyba.appentix.web.materiel.impl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.materiel.model.Materiels;
import com.tyba.appentix.business.materiel.service.MaterielService;
import com.tyba.appentix.business.materiel.vo.MaterielsVO;
import com.tyba.appentix.business.materiel.vo.transformer.MaterielsVOTransformer;

import com.tyba.appentix.web.materiel.MaterielSrvPresentation;

/**

 * @author Jamal EL BOUROUMI
 */

@Service("materielSrvPresentation")
public class MaterielSrvPresentationImpl implements
		MaterielSrvPresentation, Serializable {

	
	private static final long serialVersionUID = -9195103923868652549L;

	@Autowired
	private MaterielService materielService;

	

	
	@Override
	public MaterielsVO findMaterielsById(String id) {

		Materiels models = materielService.findMaterielsById(id);
		return new MaterielsVOTransformer().model2VO(models, false);
	}

	@Override
	public List<MaterielsVO> findAllMateriels() {
		List<MaterielsVO> lvo = new ArrayList<MaterielsVO>();
		List<Materiels> m = materielService.findAllMateriels();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new MaterielsVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

	public MaterielService getMaterielService() {
		return materielService;
	}

	public void setMaterielService(MaterielService materielService) {
		this.materielService = materielService;
	}

}