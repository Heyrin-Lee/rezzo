package com.rezzo.mes.sales.ist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.edcts.service.EdctsmVO;
import com.rezzo.mes.sales.ist.service.SalesIstService;
import com.rezzo.mes.sales.ist.service.SalesIstVO;
import com.rezzo.mes.sales.order.service.OrderVO;

@Controller
public class SalesIstController {

	@Autowired SalesIstService service;
	
	//제품 입고 등록 페이지
	@RequestMapping("salesIst")
	public String salesIst() {
		return "sales/salesIst";
	}
	
	//제품 입고 등록&수정
	@PostMapping("saveIst")
	@ResponseBody
	public List<SalesIstVO> saveIst(SalesIstVO vo) {
		service.saveIst(vo);
		return service.salesIstList(vo);
	}
	
	//제품 입고 전체 목록 - 현재 날짜 기준으로
	@PostMapping("salesIstList")
	@ResponseBody
	public List<SalesIstVO> salesIstList(SalesIstVO vo) {
		return service.salesIstList(vo);
	}
	
}
