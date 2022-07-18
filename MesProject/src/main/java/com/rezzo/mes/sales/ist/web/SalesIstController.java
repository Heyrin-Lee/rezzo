package com.rezzo.mes.sales.ist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.sales.ist.service.SalesIstService;

@Controller
public class SalesIstController {

	@Autowired SalesIstService service;
	
	//제품 입고 등록 페이지
	@RequestMapping("salesIst")
	public String salesIst() {
		return "sales/salesIstPage";
	}
}
