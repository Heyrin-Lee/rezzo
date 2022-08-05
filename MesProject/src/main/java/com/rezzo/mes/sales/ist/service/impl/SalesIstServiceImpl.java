package com.rezzo.mes.sales.ist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.ist.mapper.SalesIstMapper;
import com.rezzo.mes.sales.ist.service.SalesIstService;
import com.rezzo.mes.sales.ist.service.SalesIstVO;
import com.rezzo.mes.sales.order.service.OrderVO;

@Service
public class SalesIstServiceImpl implements SalesIstService{
	
	@Autowired SalesIstMapper mapper;

	
	//제품 입고 목록 현재 날짜 기준으로 조회(첫페이지)
	@Override
	public List<SalesIstVO> salesIstList(SalesIstVO vo) {
		return mapper.salesIstList(vo);
	}

	//완제품 LOT번호 모달 조회
	@Override
	public List<PrdtInspVO> getLotList(PrdtInspVO vo) {
		return mapper.getLotList(vo);
	}

	//입고 등록,수정
	@Override
	public void saveIst(SalesIstVO vo) {
			mapper.saveIst(vo);			
	}

	//제품 입고 목록 조건별 조회
	@Override
	public List<SalesIstVO> istOptionList(SalesIstVO vo) {
		return mapper.istOptionList(vo);
	}

	//입고등록 후 진행상황 입고완료로 변경
	@Override
	public void modifyProg(OrderVO vo) {
		mapper.modifyProg(vo);
		
	}
	
	//입고조회페이지 완제품LOT번호 모달
	@Override
	public List<PrdtInspVO> searchGetLotList(PrdtInspVO vo) {
		return mapper.searchGetLotList(vo);
	}


}
