package com.rezzo.mes.equip.eqmopr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.equip.eqmopr.service.EqmOprService;
@Controller
public class EqmOprController {
	
	@Autowired
	EqmOprService eqmOprService;
	
	@RequestMapping("eqmOpr")
	public String eqmOpr() {
		
		return "equip/eqmOpr";
	}
	
	
}
