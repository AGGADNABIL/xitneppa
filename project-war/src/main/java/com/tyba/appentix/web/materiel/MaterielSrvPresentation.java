
 
package com.tyba.appentix.web.materiel;

import java.util.List;

import com.tyba.appentix.business.materiel.vo.MaterielsVO;

/**
 * 
 * @author Jamal EL BOUROUMI
 */
public interface MaterielSrvPresentation {

	MaterielsVO findMaterielsById(String id);



	List<MaterielsVO> findAllMateriels();

}
