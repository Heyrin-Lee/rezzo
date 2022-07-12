package com.rezzo.mes.sales.order.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.sales.order.service.OrderService;
import com.rezzo.mes.sales.order.service.OrderVO;



@Controller
public class OrderController {
	
	@Autowired OrderService mapper;
	
	//데이터 넘어오는지 확인
	@RequestMapping("order")
	@ResponseBody
	public List<OrderVO> searchOrdr(Model model) {
		return mapper.searchOrdr(null);
	}
	
	//주문서 조회/등록 페이지 불러오기
	@RequestMapping("orderList")
	public String orderList() {
		return "sales/orderList";
	}
	
	//주문서 전체 불러오기
	@GetMapping("orderSelect")
	@ResponseBody
	public List<OrderVO> orderSelect(OrderVO vo) {
		return mapper.searchOrdr(vo);
	}
	
	//주문서 등록
	@PostMapping("addOrdr")
	public String addOrdr(@RequestBody List<OrderVO> vo) {
		System.out.println(vo);
		mapper.addOrdr(vo);
		return "sales/orderList";
	}
	
	//거래처 목록 조회 모달창
	@RequestMapping("comSearch")
	@ResponseBody
	public List<OrderVO> comSearch(OrderVO vo) {
		return mapper.comSearch(vo);
	}
	
	//제품명 목록 조회 모달창
	@RequestMapping("proSearch")
	@ResponseBody
	public List<OrderVO> proSearch(OrderVO vo) {
		return mapper.proSearch(vo);
	}
	
}

