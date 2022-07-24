package com.rezzo.mes.sales.stc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.sales.stc.service.SalesStcService;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

@Controller
public class SalesStcController {

	@Autowired SalesStcService service;
	
	//완제품재고 조회 페이지 불러오기
	@RequestMapping("salesStc")
	public String salesStc() {
		return "sales/salesStc";
	}
	
	@RequestMapping("makeDtSearch")
	@ResponseBody
	public List<SalesStcVO> makeDtSearch(SalesStcVO vo) {
		return service.makeDtSearch(vo);
	}
}
