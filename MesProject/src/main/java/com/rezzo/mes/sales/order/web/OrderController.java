package com.rezzo.mes.sales.order.web;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.resour.insp.vo.OrdrVO;
import com.rezzo.mes.sales.order.service.OrderService;
import com.rezzo.mes.sales.order.service.OrderVO;



@Controller
public class OrderController {
	
	@Autowired OrderService service;
	
	//데이터 넘어오는지 확인
	@RequestMapping("order")
	@ResponseBody
	public List<OrderVO> searchOrdr(Model model) {
		return service.searchOrdr(null);
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
		return service.searchOrdr(vo);
	}
	
	//주문서 등록
	@PostMapping("addOrdr")
	public String addOrdr(@RequestBody List<OrderVO> vo) {
		System.out.println(vo);
		service.addOrdr(vo);
		return "sales/orderList";
	}

	//거래처 목록 조회 모달창
	@RequestMapping("comSearch")
	@ResponseBody
	public List<OrderVO> comSearch(OrderVO vo) {
		return service.comSearch(vo);
	}
	
	//제품명 목록 조회 모달창
	@RequestMapping("proSearch")
	@ResponseBody
	public List<OrderVO> proSearch(OrderVO vo) {
		return service.proSearch(vo);
	}
	
	//조건별 주문서 조회
	@GetMapping("findOrdr")
	@ResponseBody
		public List<OrderVO> findOrdr(OrderVO vo) {
		return service.findOrdr(vo);	
	
	}
	
	//주문서 삭제
	
}

