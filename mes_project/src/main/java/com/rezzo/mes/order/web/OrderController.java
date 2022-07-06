package com.rezzo.mes.order.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

	@RequestMapping("/order.do")
	public String order() {
		return "order/order";
	}
	
	@RequestMapping("/companyList.do")
	public String companyList() {
		return "order/companyList";
	}
	
	@RequestMapping("/productList.do")
	public String productList() {
		return "order/productList";
	}
	
	@RequestMapping("/orderRegister.do")
	public String orderRegister() {
		return "order/orderRegister";
	}
}

