package com.rezzo.mes.resour.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResourController {

	//자재 발주
	@RequestMapping("/resourOrdr")
	public String resourOrdr() {
		return "resource/resourOrdr";
	}
	
	//자재 발주 조회
	@RequestMapping("/resourOrdrSearch")
	public String resourOrdrSearch() {
		return "resource/resourOrdrSearch";
	}
}
