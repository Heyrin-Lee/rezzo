package com.rezzo.mes.order.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

	@RequestMapping("/order")
	public String order() {
		return "order/order";
	}
	
	@RequestMapping("/companyList")
	public String companyList() {
		return "order/companyList";
	}
	
	@RequestMapping("/productList")
	public String productList() {
		return "order/productList";
	}
	
	@RequestMapping("/orderRegister")
	public String orderRegister() {
		return "order/orderRegister";
	}
}

