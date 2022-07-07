package com.rezzo.mes.ccd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CcdController {
	
	@RequestMapping("/ccd")
	public String ccd() {
		return "common/ccd";
	}
	
	@RequestMapping("/ccds")
	public String ccds() {
		return "common/ccds";
	}

	@RequestMapping("/rsc")
	public String rsc() {
		return "common/rsc";
	}
	
	@RequestMapping("/vend")
	public String vend() {
		return "common/vend";
	}
}
