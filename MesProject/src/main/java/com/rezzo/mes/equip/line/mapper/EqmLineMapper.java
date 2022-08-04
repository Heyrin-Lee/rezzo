package com.rezzo.mes.equip.line.mapper;

import java.util.List;

import com.rezzo.mes.equip.line.service.EqmLineVO;

public interface EqmLineMapper {
	public List<EqmLineVO> eqmLineList(EqmLineVO vo);

	public void eqmLineUpdate(EqmLineVO vo);

	public void eqmLineDelete(EqmLineVO vo);
	
	public List<EqmLineVO> eqmLineSelectList(EqmLineVO vo);
	
	public EqmLineVO getLineCd();
}
