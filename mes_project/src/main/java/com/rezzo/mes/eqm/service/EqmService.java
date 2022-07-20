package com.rezzo.mes.eqm.service;

import java.util.List;

public interface EqmService {
	public List<EqmVO> eqmList(EqmVO vo);

	public List<EqmVO> eqmSelect(EqmVO vo);

	public void eqmInsert(EqmVO vo);

	public void eqmUpdate(EqmVO vo);

	public void eqmDelete(EqmVO vo);

}
