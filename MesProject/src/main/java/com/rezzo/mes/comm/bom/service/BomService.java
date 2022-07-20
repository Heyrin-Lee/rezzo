package com.rezzo.mes.comm.bom.service;

import java.util.List;

public interface BomService {
	
	//제품별 목록 조회
	public List<BomVO> getBomList(BomVO bomVO);
	//새로 입력
	public void insertBom(String edctsCd, List<BomVO> bomList);
	//저장
	public void saveBom(String edctsCd, List<BomVO> bomList);
	//삭제
	public void delBom(BomVO bomVO);
	//그리드 단건삭제
	public void delBomGrid(BomVO bomVO);
	
}
