package com.rezzo.mes.qc.insp.service;

import java.util.List;

import com.rezzo.mes.sales.order.service.OrderVO;

public interface PrdtInspService {
	
	//검사코드 종류 불러오기
	public List<PrdtInspVO> getInspCode();
	//주문서 모달 불러오기
	public List<OrderVO> prdtInspOrder();
	//전체 삭제
	public void delPrdtInsp(PrdtInspVO prdtInspVO);
	//검사 저장
	public void savePrdtInsp(List<PrdtInspVO> prdtInspList);
	//검사테이블 데이터 불러오기
	public List<PrdtInspVO> getPrdtInsp(PrdtInspVO prdtInspVO);
	
}
