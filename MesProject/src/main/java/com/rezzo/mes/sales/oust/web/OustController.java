package com.rezzo.mes.sales.oust.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.sales.edcts.service.EdctsVO;
import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.oust.service.OustService;
import com.rezzo.mes.sales.oust.service.OustVO;

@Controller
public class OustController {

	@Autowired OustService service;
	
	//출고조회 페이지 불러오기
	@RequestMapping("oust")
	public String oust() {
		return "sales/oust";
	}
	
	//출고등록 페이지 불러오기
	@RequestMapping("addOust")
	public String addOust() {
		return "sales/addOust";
	}
	
	//주문서 전체 목록 - 첫 페이지
	@GetMapping("orderList")
	@ResponseBody
	public List<OrderVO> orderList(OrderVO vo) {
		return service.orderList(vo);
	}
	
	//제품 재고 모달창
	@RequestMapping("edctsstcList")
	@ResponseBody
	public List<OustVO> edctsstcList(OustVO vo) {
		return service.edctsstcList(vo);
	}
	
	//완제품 재고 모달창
	@RequestMapping("stcModal")
	@ResponseBody
	public List<EdctsVO> stcModal(EdctsVO vo) {
		return service.stcModal(vo);
	}
}
