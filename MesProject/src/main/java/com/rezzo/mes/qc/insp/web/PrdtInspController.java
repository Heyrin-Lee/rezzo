package com.rezzo.mes.qc.insp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.qc.insp.service.PrdtInspService;
import com.rezzo.mes.qc.insp.service.PrdtInspVO;

@Controller
public class PrdtInspController {
	
	@Autowired PrdtInspService service;
	
	@RequestMapping("prdtInsp")
	public String prdtInsp() {
		return "qc/prdtInsp";
	}
	
	@RequestMapping("getInspCode")
	@ResponseBody
	public List<PrdtInspVO> getInspCode() {
		return service.getInspCode();
	}

}
