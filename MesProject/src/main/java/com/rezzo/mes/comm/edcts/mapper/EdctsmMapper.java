package com.rezzo.mes.comm.edcts.mapper;

import java.util.List;

import com.rezzo.mes.comm.edcts.service.EdctsmVO;

public interface EdctsmMapper {
	
	//전체목록 및 검색
	public List<EdctsmVO> getEdctsList(EdctsmVO edctsVO);
	//입력 or 수정
	public void saveEdcts(EdctsmVO edctsVO);
	//삭제
	public void delEdcts(EdctsmVO edctsVO);
	//제품코드 받아오기
	public EdctsmVO getEdctsCd();

}