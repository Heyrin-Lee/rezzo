package com.rezzo.mes.prod.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdController {
	
	@RequestMapping("/prod.do")
	public String prod() {
		return "prod/prcs";
	}
	
	@RequestMapping("/plan.do")
	public String plan() {
		return "prod/plan";
	}
}
