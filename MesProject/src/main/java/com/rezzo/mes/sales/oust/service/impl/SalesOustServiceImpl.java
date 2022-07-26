package com.rezzo.mes.sales.oust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.vend.service.VendVO;
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

	//출고등록 후 출고완료로 변경
	@Override
	public void updateProg(OrderVO vo) {
		mapper.updateProg(vo);
	}

	//출고 조회 페이지
	//제품명 목록 조회 모달창
	@Override
	public List<SalesStcVO> getProd(SalesStcVO vo) {
		return mapper.getProd(vo);
	}

	//조건별 조회
	@Override
	public List<SalesOustVO> optionSearch(SalesOustVO vo) {
		return mapper.optionSearch(vo);
	}

	//제품명 검색 시 조회
	@Override
	public List<SalesOustVO> getProduct(SalesOustVO vo) {
		return mapper.getProduct(vo);
	}

}
