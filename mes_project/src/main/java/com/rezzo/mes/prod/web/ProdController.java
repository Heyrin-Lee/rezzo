package com.rezzo.mes.prod.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdController {
	
	@RequestMapping("/prcs.do")
	public String prcs() {
		return "prod/prcs";
	}
	
	@RequestMapping("/plan.do")
	public String plan() {
		return "prod/plan";
	}
	
	@RequestMapping("/planSearch.do")
	public String planSearch() {
		return "prod/planSearch";
	}
	
	@RequestMapping("/indica.do")
	public String indica() {
		return "prod/indica";
	}
	
	@RequestMapping("/newfile.do")
	public String newfile() {
		return "prod/NewFile";
	}
	
	@RequestMapping("/indicaSearch.do")
	public String indicaSearch() {
		return "prod/indicaSearch";
	}
	
	@RequestMapping("/prodMng.do")
	public String prodMng() {
		return "prod/prodMng";
	}
	
}
