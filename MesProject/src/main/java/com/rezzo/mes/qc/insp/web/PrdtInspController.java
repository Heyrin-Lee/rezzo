package com.rezzo.mes.qc.insp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrdtInspController {
	
	@RequestMapping("prdtInsp")
	public String prdtInsp() {
		return "qc/prdtInsp";
	}

}
