package com.rezzo.mes.sales.stc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.sales.stc.service.SalesStcService;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

@Controller
public class SalesStcController {

	@Autowired SalesStcService service;
	
	//완제품재고 조회 페이지 불러오기
	@RequestMapping("salesStc")
	public String salesStc(Model model) {
		model.addAttribute("lotNo", service.getLotStcList(null));
		return "sales/salesStc";
	}
	
	//제품명 조회 모달
	@RequestMapping("getPrdtNm")
	@ResponseBody
	public List<SalesStcVO> getPrdtNm(SalesStcVO vo) {
		return service.getPrdtNm(vo);
	}
	
	//완제품LOT번호별 재고 목록 조회
	@PostMapping("getLotStcList")
	@ResponseBody
	public List<SalesStcVO> getLotStcList(SalesStcVO vo) {
		return service.getLotStcList(vo);
	}
	
}
