package com.rezzo.mes.sales.order.service;

import java.util.List;

import com.rezzo.mes.comm.vend.service.VendVO;

public interface OrderService {

	//전체주문서 조회
	public List<OrderVO> searchOrdr(OrderVO vo);
	//거래처 목록 조회 모달창
	public List<VendVO> comSearch(VendVO vo);	
	//제품명 목록 조회 모달창
	public List<OrderVO> proSearch(OrderVO vo);
	//조건별 주문서 조회
	public List<OrderVO> findOrdr(OrderVO vo);
	//주문서 삭제
	public void deleteOrdr(List<OrderVO> delList);
	//주문서 수정
	public void saveOrdr(List<OrderVO> ordList);
	//주문번호 생성, 가져오기
	public Integer getordrNo(OrderVO vo);
}
