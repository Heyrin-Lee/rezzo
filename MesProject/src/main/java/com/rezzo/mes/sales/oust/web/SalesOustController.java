package com.rezzo.mes.sales.oust.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.oust.service.SalesOustService;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

@Controller
public class SalesOustController {

	@Autowired SalesOustService service;
	
	//출고 등록 페이지 불러오기
	@RequestMapping("salesOust")
	public String salesOust() {
		return "sales/salesOust";
	}
	
	//진행중 주문서 현황 목록 조회
	@RequestMapping("findOrder")
	@ResponseBody
	public List<OrderVO> findOrder(OrderVO vo) {
		return service.findOrder(vo);
	}
	
	//완제품 재고 목록 모달로 조회
	@RequestMapping("salesStcList")
	@ResponseBody
	public List<SalesStcVO> salesStcList(SalesStcVO vo) {
		return service.salesStcList(vo);
	}
	
}
