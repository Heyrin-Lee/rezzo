package com.rezzo.mes.sales.ist.service;

import java.util.List;

import com.rezzo.mes.comm.edcts.service.EdctsmVO;

public interface SalesIstService {
	
	//제품 입고 등록&수정 - 제품 입고번호 생성, 등록 시 출력
	public void saveIst(SalesIstVO vo);
	//제품 입고 전체 목록 - 현재 날짜 기준으로
	public List<SalesIstVO> salesIstList(SalesIstVO vo);
}
