package com.rezzo.mes.edctsOust.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OustController {

	//출고 등록
	@RequestMapping("/oust")
	public String oust() {
		return "oust/oust";
	}
	
	//출고 등록 조회
	@RequestMapping("/oustSearch")
	public String releaseSearch() {
		return "oust/oustSearch";
	}
	
	//완제품 재고 조회
	@RequestMapping("/edctsSearch")
	public String edctsSearch() {
		return "oust/edctsSearch";
	}
}
