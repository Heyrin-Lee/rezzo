package com.rezzo.mes.sales.oust.mapper;

import java.util.List;

import com.rezzo.mes.sales.edcts.service.EdctsVO;
import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.oust.service.OustVO;

public interface OustMapper {

	public List<OustVO> searchOust(OustVO vo);
	//전체 주문서 조회 - 첫페이지
	public List<OrderVO> orderList(OrderVO vo);
	//제품 재고 모달창
	public List<OustVO> edctsstcList(OustVO vo);
	//완제품 재고 현황 모달창
	public List<EdctsVO> stcModal(EdctsVO vo);
}
