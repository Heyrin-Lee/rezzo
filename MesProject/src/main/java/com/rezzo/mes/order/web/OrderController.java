package com.rezzo.mes.order.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.order.mapper.OrderMapper;
import com.rezzo.mes.order.service.OrderVO;

@Controller
public class OrderController {
	
	@Autowired OrderMapper mapper;
	
	//데이터 넘어오는지 확인
	@RequestMapping("order")
	@ResponseBody
	public List<OrderVO> searchOrdr(Model model) {
		return mapper.searchOrdr(null);
	}
	
	//주문서 조회/등록 페이지 확인
	@RequestMapping("orderList")
	public String orderList() {
		return "order/orderList";
	}
	
}

