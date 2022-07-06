package com.rezzo.mes.rsc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RscController {

	@RequestMapping("/rsc.do")
	public String ccds() {
		return "rsc/rsc";
	}
}
