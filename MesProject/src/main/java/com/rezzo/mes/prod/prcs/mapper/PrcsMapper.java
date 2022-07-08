package com.rezzo.mes.prod.prcs.mapper;

import java.util.List;
import java.util.Map;

import com.rezzo.mes.prod.prcs.service.PrcsVO;

public interface PrcsMapper {
	public List<PrcsVO> prcsList(PrcsVO vo);
	public List<Map> prcsFind(PrcsVO vo);
	public void prcsInsert(PrcsVO vo);
}
