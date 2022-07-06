package com.rezzo.mes.ccd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CcdController {
	
	@RequestMapping("/ccd.do")
	public String ccd() {
		return "ccd/ccd";
	}
	
	@RequestMapping("/ccds.do")
	public String ccds() {
		return "ccd/ccds";
	}

}
