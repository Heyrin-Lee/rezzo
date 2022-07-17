package com.rezzo.mes.sales.oust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.edcts.service.EdctsVO;
import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.oust.mapper.OustMapper;
import com.rezzo.mes.sales.oust.service.OustService;
import com.rezzo.mes.sales.oust.service.OustVO;

@Service
public class OustServiceImpl implements OustService{

	@Autowired OustMapper mapper;
	
	@Override
	public List<OustVO> searchOust(OustVO vo) {
		return mapper.searchOust(vo);
	}

	//제품 재고 모달창
	@Override
	public List<OustVO> edctsstcList(OustVO vo) {
		return mapper.edctsstcList(vo);
	}

	//주문서 전체 목록 - 첫페이지
	@Override
	public List<OrderVO> orderList(OrderVO vo) {
		return mapper.orderList(vo);
	}

	//완제품 재고 모달창
	@Override
	public List<EdctsVO> stcModal(EdctsVO vo) {
		return mapper.stcModal(vo);
	}
	
	
}
