package com.rezzo.mes.sales.oust.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.sales.order.service.OrderVO;
import com.rezzo.mes.sales.oust.service.SalesOustService;
import com.rezzo.mes.sales.oust.service.SalesOustVO;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

@Controller
public class SalesOustController {

	@Autowired SalesOustService service;
	
	//출고 등록 페이지 불러오기
	@RequestMapping("salesOust")
	public String salesOust() {
		return "sales/salesOust";
	}
	
	//출고 조회 페이지 불러오기
		@RequestMapping("salesOustSearch")
		public String salesOustSearch() {
			return "sales/salesOustSearch";
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
	
	//완제품 재고현황 모달에서 출고량 입력 후 출고등록
	@PostMapping("saveSalesOust")
	@ResponseBody	
	public List<SalesOustVO> saveSalesOust(SalesOustVO vo) {
		service.saveSalesOust(vo);
		return service.findOust(vo);
	}
	
	//출고등록 후 출고완료로 변경
	@PutMapping("updateProg")
	@ResponseBody
	public OrderVO updateProg(OrderVO vo) {
		service.updateProg(vo);
		return vo;
	}
	
	//출고현황 목록 불러오기
	@RequestMapping("findOust")
	@ResponseBody
	public List<SalesOustVO> findOust(SalesOustVO vo) {
		return service.findOust(vo);
	}
}
