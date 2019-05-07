package com.tyba.appentix.web.commons.Impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyba.appentix.business.common.Pays;
import com.tyba.appentix.business.common.pays.service.PaysService;
import com.tyba.appentix.business.common.vo.PaysVO;
import com.tyba.appentix.business.common.vo.transformer.PaysVOTransformer;

@Service("paysSrvPresentation")
public class PaysSrvPresentationImpl implements PaysSrvPresentation,
		Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private PaysService paysService;

	@Override
	public PaysVO findPaysById(Long id) {
		// TODO Auto-generated method stub
		Pays models = paysService.findPaysById(id);
		return new PaysVOTransformer().model2VO(models, false);
	}

	@Override
	public PaysVO findPaysByNom(String code) {

		return null;
	}

	@Override
	public List<PaysVO> findAllPays() {
		// TODO Auto-generated method stub

		List<PaysVO> lvo = new ArrayList<PaysVO>();
		List<Pays> m = paysService.findAllPays();
		for (int i = 0; i < m.size(); i++)
			lvo.add(new PaysVOTransformer().model2VO(m.get(i), false));
		return lvo;
	}

}
