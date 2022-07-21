package com.rezzo.mes.sales.oust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.oust.mapper.SalesOustMapper;
import com.rezzo.mes.sales.oust.service.SalesOustService;
import com.rezzo.mes.sales.oust.service.SalesOustVO;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

@Service
public class SalesOustServiceImpl implements SalesOustService{

	@Autowired SalesOustMapper mapper;
	
	//진행중 주문서 조회
	@Override
	public List<OrderVO> findOrder(OrderVO vo) {
		return mapper.findOrder(vo);
	}

	//완제품 재고 현황 목록 모달로 조회
	@Override
	public List<SalesStcVO> salesStcList(SalesStcVO vo) {
		return mapper.salesStcList(vo);
	}

	//완제품 재고현황 모달에서 출고량 입력 후 출고등록
	@Override
	public void saveSalesOust(SalesOustVO vo) {
		mapper.saveSalesOust(vo);	
	}
	
	//출고현황 조회
	@Override
	public List<SalesOustVO> findOust(SalesOustVO vo) {
		return mapper.findOust(vo);
	}

}
