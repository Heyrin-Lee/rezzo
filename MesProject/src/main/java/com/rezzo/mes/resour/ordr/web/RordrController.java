package com.rezzo.mes.resour.ordr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.resour.ordr.mapper.RordrMapper;

@Controller
public class RordrController {

	@Autowired RordrMapper mapper;
	
	@RequestMapping("rordrList")
	public String rordrList() {
		return "ressour/rordrList";
	}
	
	@RequestMapping("rordrAdd")
	public String rordrAdd() {
		return "ressour/rordrAdd";
	}
	
}
