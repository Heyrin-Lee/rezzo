package com.rezzo.mes.prod.prcs.service;

import java.util.List;
import java.util.Map;

public interface PrcsService {
	public List<PrcsVO> prcsList(PrcsVO vo);
	public List<Map> prcsFind(PrcsVO vo);
	public void prcsInsert(PrcsVO vo);
	public void prcsDelete(List<PrcsVO> vo);
}
