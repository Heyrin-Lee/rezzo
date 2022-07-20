package com.rezzo.mes.comm.bom.mapper;

import java.util.List;

import com.rezzo.mes.comm.bom.service.BomVO;

public interface BomMapper {
	
	//제품별 목록 조회
	public List<BomVO> getBomList(BomVO bomVO);
	//새로 입력
	public void insertBom(BomVO bomVO);
	//저장
	public void saveBom(BomVO bomVO);
	//삭제
	public void delBom(BomVO bomVO);
	//그리드 단건삭제
	public void delBomGrid(BomVO bomVO);	

}
