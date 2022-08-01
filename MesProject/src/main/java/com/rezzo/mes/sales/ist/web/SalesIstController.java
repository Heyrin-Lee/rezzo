package com.rezzo.mes.sales.ist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.ist.service.SalesIstService;
import com.rezzo.mes.sales.ist.service.SalesIstVO;

@Controller
public class SalesIstController {

	@Autowired SalesIstService service;
	
	//제품 입고 등록 페이지
	@RequestMapping("salesIst")
	public String salesIst() {
		return "sales/salesIst";
	}
	
	//제품 입고 조회 페이지
	@RequestMapping("salesIstSearch")
	public String saelsIstSearch() {
		return "sales/salesIstSearch";
	}
	
	//제품 입고 등록&수정
	@PostMapping("saveIst")
	@ResponseBody
	public List<SalesIstVO> saveIst(SalesIstVO vo) {
		service.saveIst(vo);
		return service.salesIstList(vo);
	}
	
	//제품 입고 목록 현재 날짜 기준으로 조회(첫페이지)
	@PostMapping("salesIstList")
	@ResponseBody
	public List<SalesIstVO> salesIstList(SalesIstVO vo) {
		return service.salesIstList(vo);
	}
	
	//완제품LOT번호 모달 조회
	@RequestMapping("getLotList")
	@ResponseBody
	public List<PrdtInspVO> getLotList(PrdtInspVO vo) {
		return service.getLotList(vo);
	}
	
	//제품 입고 목록 조건별 조회
	@PostMapping("istOptionList")
	@ResponseBody
	public List<SalesIstVO> istOptionList(SalesIstVO vo) {
		return service.istOptionList(vo);
	}
	
}
