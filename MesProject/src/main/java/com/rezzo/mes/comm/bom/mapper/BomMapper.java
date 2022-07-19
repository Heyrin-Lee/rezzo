package com.rezzo.mes.comm.bom.mapper;

import java.util.List;

import com.rezzo.mes.comm.bom.service.BomVO;

public interface BomMapper {
	
	//제품별 목록 조회
	public List<BomVO> getBomList(String edctsCd);
	//저장
	public void saveBom(List<BomVO> bomList);
	//삭제
	public void delBom(List<BomVO> bomList);

}
