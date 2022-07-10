package com.rezzo.mes.comm.ccds.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.comm.ccds.mapper.CcdsMapper;

@Controller
public class CcdsController {

	@Autowired CcdsMapper mapper;
	
	@RequestMapping("ccds")
	public String ccdsList(Model model) {
		model.addAttribute("ccdsList", mapper.getCcdsList(null));
		return "comm/ccds";
	}
	
	@RequestMapping("bom")
	public String bom() {
		return "comm/bom";
	}
	
	@RequestMapping("edcts")
	public String edcts() {
		return "comm/edcts";
	}
	
	@RequestMapping("rsc")
	public String rsc() {
		return "comm/rsc";
	}
	
	@RequestMapping("vend")
	public String vend() {
		return "comm/vend";
	}
	
	@RequestMapping("wrhous")
	public String wrhous() {
		return "comm/wrhous";
	}
	
}
