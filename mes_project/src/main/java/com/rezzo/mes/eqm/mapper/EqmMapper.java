package com.rezzo.mes.eqm.mapper;

import java.util.List;

import com.rezzo.mes.eqm.service.EqmVO;

public interface EqmMapper {

	public List<EqmVO> eqmList(EqmVO vo);

	public List<EqmVO> eqmSelect(EqmVO vo);

	public void eqmInsert(EqmVO vo);

	public void eqmUpdate(EqmVO vo);

	public void eqmDelete(EqmVO vo);

}
