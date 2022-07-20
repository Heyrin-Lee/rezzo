package com.rezzo.mes.sales.ist.mapper;

import java.util.List;

import com.rezzo.mes.comm.edcts.service.EdctsmVO;
import com.rezzo.mes.sales.ist.service.SalesIstVO;

public interface SalesIstMapper {

	//제품 입고 등록&수정
	public void saveIst(SalesIstVO vo);
	//제품 입고 전체 목록 - 현재 날짜 기준으로
	public List<SalesIstVO> salesIstList(SalesIstVO vo);
	//제품코드 목록 조회 모달창
	public List<EdctsmVO> edctsCdSearch(EdctsmVO vo);
}
