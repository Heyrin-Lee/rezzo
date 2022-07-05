package com.rezzo.mes.eqm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EqmController {
	
	@RequestMapping("/line.do")
	public String line() {
		return "eqm/line";
	}
	
	@RequestMapping("/eqm.do")
	public String equ() {
		return "eqm/eqm";
	}
	
	
}
