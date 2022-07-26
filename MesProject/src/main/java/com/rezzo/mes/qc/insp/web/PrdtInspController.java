package com.rezzo.mes.qc.insp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.qc.insp.service.PrdtInspService;
import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.order.service.OrderVO;

@Controller
public class PrdtInspController {
	
	@Autowired PrdtInspService service;
	
	@RequestMapping("prdtInsp")
	public String prdtInsp(Model model) {
		model.addAttribute("lots", service.getPrdtInsp(null));
		return "qc/prdtInsp";
	}
	
	@RequestMapping("getInspCode")
	@ResponseBody
	public List<PrdtInspVO> getInspCode() {
		return service.getInspCode();
	}

	@RequestMapping("prdtInspOrder")
	@ResponseBody
	public List<OrderVO> prdtInspOrder() {
		return service.prdtInspOrder();
	}
	
	@RequestMapping("delPrdtInsp")
	public void delPrdtInsp(PrdtInspVO prdtInspVO) {
		service.delPrdtInsp(prdtInspVO);
	}
	
	@RequestMapping("savePrdtInsp")
	public void savePrdtInsp(@RequestBody List<PrdtInspVO> prdtInspList) {
		service.savePrdtInsp(prdtInspList);
	}
	
	@RequestMapping("getPrdtInsp")
	@ResponseBody
	public List<PrdtInspVO> getPrdtInsp(PrdtInspVO prdtInspVO) {
		return service.getPrdtInsp(prdtInspVO);
	}
}
