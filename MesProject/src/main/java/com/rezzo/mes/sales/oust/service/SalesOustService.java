package com.rezzo.mes.sales.oust.service;

import java.util.List;

import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

public interface SalesOustService {

	//진행중 주문서 조회
	public List<OrderVO> findOrder(OrderVO vo);
	//완제품 재고현황 모달로 조회
	public List<SalesStcVO> salesStcList(SalesStcVO vo);
	//완제품 재고현황 모달에서 출고량 입력 후 출고등록
	public void saveSalesOust(SalesOustVO vo);
	//출고등록 후 출고완료로 변경
	public void updateProg(OrderVO vo);
	//출고현황 조회
	public List<SalesOustVO> findOust(SalesOustVO vo);
	
	//출고 조회 페이지
	//제품명 목록 조회 모달창
	public List<SalesStcVO> getProd(SalesStcVO vo);
	//조건별 조회
	public List<SalesOustVO> optionSearch(SalesOustVO vo);
	//제품명 검색 시 조회
	public List<SalesOustVO> getProduct(SalesOustVO vo);
}
