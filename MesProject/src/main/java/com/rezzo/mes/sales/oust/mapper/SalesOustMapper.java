package com.rezzo.mes.sales.oust.mapper;

import java.util.List;

import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

public interface SalesOustMapper {

	//진행중 주문서 조회
	public List<OrderVO> findOrder(OrderVO vo);
	//완제품 재고현황 모달로 조회
	public List<SalesStcVO> salesStcList(SalesStcVO vo);
}
