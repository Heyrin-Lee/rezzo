package com.rezzo.mes.eqm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.eqm.service.EqmService;

@Controller
public class EqmController {

	@Autowired EqmService service;

	@RequestMapping("/line.do")
	public String line() {
		return "eqm/line";
	}

	@RequestMapping("/eqm.do")
	public String eqm(Model model) {
		model.addAttribute("eqms", service.eqmList());
		return "eqm/eqm";
	}

	@RequestMapping("/eqmopr.do")
	public String eqmopr() {
		return "eqm/eqmopr";
	}

	@RequestMapping("/eqmchek.do")
	public String eqmchek() {
		return "eqm/eqmchek";
	}

	@RequestMapping("/rltmeqm.do")
	public String rltmeqm() {
		return "eqm/rltmeqm";
	}

}
