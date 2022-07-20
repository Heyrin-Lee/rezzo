package com.rezzo.mes.sales.ist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.edcts.service.EdctsmVO;
import com.rezzo.mes.sales.ist.mapper.SalesIstMapper;
import com.rezzo.mes.sales.ist.service.SalesIstService;
import com.rezzo.mes.sales.ist.service.SalesIstVO;
import com.rezzo.mes.sales.order.service.OrderVO;

@Service
public class SalesIstServiceImpl implements SalesIstService{
	
	@Autowired SalesIstMapper mapper;

	//제품 입고 등록&수정
	@Override
	public void saveIst(SalesIstVO vo) {
		mapper.saveIst(vo);
	}

	//제품 입고 전체 목록 - 현재 날짜 기준으로
	@Override
	public List<SalesIstVO> salesIstList(SalesIstVO vo) {
		return mapper.salesIstList(vo);
	}

	//제품코드 input 클릭 -> 제품코드 목록 모달창
	@Override
	public List<EdctsmVO> edctsCdSearch(EdctsmVO vo) {
		return mapper.edctsCdSearch(vo);
	}


}
