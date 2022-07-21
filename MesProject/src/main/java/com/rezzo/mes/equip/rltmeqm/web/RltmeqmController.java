package com.rezzo.mes.equip.rltmeqm.web;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RltmeqmController {
	
	@RequestMapping("rltmeqm")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public String eqmOpr() {
		return "equip/rltmeqm";
	}

	
}
