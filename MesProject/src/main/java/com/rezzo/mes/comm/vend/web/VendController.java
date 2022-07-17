package com.rezzo.mes.comm.vend.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.vend.service.VendService;
import com.rezzo.mes.comm.vend.service.VendVO;

@Controller
public class VendController {
	
	@Autowired CcdsService ccdsService;
	@Autowired VendService vendService;
	
	@GetMapping("vend")
	public String vend(Model model) {
		model.addAttribute("ccds", ccdsService.getCodes("VND"));
		return "comm/vend";
	}
	
	@PostMapping("getVendList")
	@ResponseBody
	public List<VendVO> getVendList(VendVO vendVO) {
		return vendService.getVendList(vendVO);
	}
	
	@PostMapping("saveVend")
	@ResponseBody
	public List<VendVO> saveVend(VendVO vendVO) {
		vendService.saveVend(vendVO);
		return vendService.getVendList(null);
	}
	
	@PostMapping("delVend")
	@ResponseBody
	public List<VendVO> delVend(VendVO vendVO) {
		vendService.delVend(vendVO);
		return vendService.getVendList(null);
	}
}
