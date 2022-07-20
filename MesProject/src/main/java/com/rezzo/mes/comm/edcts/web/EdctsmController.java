package com.rezzo.mes.comm.edcts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.edcts.service.EdctsmService;
import com.rezzo.mes.comm.edcts.service.EdctsmVO;

@Controller
public class EdctsmController {
	
	@Autowired CcdsService ccdsService;
	@Autowired EdctsmService edctmService;
	
	@RequestMapping("edcts")
	public String edcts(Model model) {
		model.addAttribute("ccds", ccdsService.getCodes("WHS"));
		return "comm/edcts";
	}
	
	@PostMapping("getEdctsList")
	@ResponseBody
	public List<EdctsmVO> getEdctsList(EdctsmVO edctsVO) {
		return edctmService.getEdctsList(edctsVO);
	}
	
	@PostMapping("saveEdcts")
	@ResponseBody
	public List<EdctsmVO> saveEdcts(EdctsmVO edctsVO) {
		edctmService.saveEdcts(edctsVO);
		return edctmService.getEdctsList(null);
	}
	
	@PostMapping("delEdcts")
	@ResponseBody
	public List<EdctsmVO> delEdcts(EdctsmVO edctsVO) {
		edctmService.delEdcts(edctsVO);
		return edctmService.getEdctsList(null);
	}
	
	
	
}
