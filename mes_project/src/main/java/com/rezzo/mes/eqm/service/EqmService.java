package com.rezzo.mes.eqm.service;

import java.util.List;

import com.rezzo.mes.eqm.vo.EqmVO;


public interface EqmService {
	List<EqmVO> eqmList();
	EqmVO eqmSelect(EqmVO vo);

	int eqmInsert(EqmVO vo);

	int eqmUpdate(EqmVO vo);

	int eqmDelete(EqmVO vo);

}
