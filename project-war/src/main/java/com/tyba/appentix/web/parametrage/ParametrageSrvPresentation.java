
package com.tyba.appentix.web.parametrage;

import java.util.List;

import com.tyba.appentix.business.parametrage.vo.TypeMaterielVO;


public interface ParametrageSrvPresentation {

    //TypeMateriel
	TypeMaterielVO findTypeMaterielByTypeId(String id);
   
	List<TypeMaterielVO> findAllTypeMateriels();
   

}
