package com.rezzo.mes.eqm.eqm.mapper;

import java.util.List;

import com.rezzo.mes.eqm.eqm.service.EqmVO;

public interface EqmMapper {

	public List<EqmVO> eqmList(EqmVO vo);

	public List<EqmVO> eqmSelect(String keyword);

	public void eqmInsert(EqmVO vo);

	public void eqmUpdate(EqmVO vo);

	public void eqmDelete(EqmVO vo);

}
