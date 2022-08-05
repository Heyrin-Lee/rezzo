package com.rezzo.mes.sales.ist.service;

import java.util.List;

import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.order.service.OrderVO;

public interface SalesIstService {
	
	//제품 입고 등록&수정 - 제품 입고번호 생성, 등록 시 출력
	public void saveIst(SalesIstVO vo);
	//제품 입고 목록 현재 날짜 기준으로 조회(첫페이지)
	public List<SalesIstVO> salesIstList(SalesIstVO vo);
	//제품 입고 목록 조건별 조회
	public List<SalesIstVO> istOptionList(SalesIstVO vo);
	//완제품LOT번호 모달 조회
	public List<PrdtInspVO> getLotList(PrdtInspVO vo);
	//입고등록 후 입고완료로 진행상황 변경
	public void modifyProg(OrderVO vo);
	//입고조회페이지 완제품LOt번호 모달
	public List<PrdtInspVO> searchGetLotList(PrdtInspVO vo);
}
