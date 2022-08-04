package com.rezzo.mes.equip.line.service;

import java.util.List;

public interface EqmLineService {
	public List<EqmLineVO> eqmLineList(EqmLineVO vo);

	public void eqmLineUpdate(EqmLineVO vo);

	public void eqmLineDelete(EqmLineVO vo);

	public List<EqmLineVO> eqmLineSelectList(EqmLineVO vo);
	
	public EqmLineVO getLineCd();
}
