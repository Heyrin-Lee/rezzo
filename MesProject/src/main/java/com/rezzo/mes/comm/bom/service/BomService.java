package com.rezzo.mes.comm.bom.service;

import java.util.List;

public interface BomService {
	
	//제품별 목록 조회
	public List<BomVO> getBomList(String edctsCd);
	//저장
	public void saveBom(String edctsCd, List<BomVO> bomList);
	//삭제
	public void delBom(List<BomVO> bomList);
	
}
