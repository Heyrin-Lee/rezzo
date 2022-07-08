package com.rezzo.mes.comm.ccds.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.comm.ccds.mapper.CcdsMapper;

@Controller
public class CcdsController {

	@Autowired CcdsMapper mapper;
	
	@RequestMapping("ccdsList")
	public String ccdsList(Model model) {
		model.addAttribute("ccdsList", mapper.getCcdsList(null));
		return "common/ccdsList";
	}
}
