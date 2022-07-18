package com.rezzo.mes.resour.ordr.web;

import com.rezzo.mes.resour.ordr.mapper.RscOrdrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RscOrdrController {

	@Autowired
	RscOrdrMapper mapper;
	
	@RequestMapping("rscOrdrList")
	public String rordrList() {
		return "resour/rscOrdrList";
	}
	
	@RequestMapping("rscOrdrAdd")
	public String rordrAdd() {
		return "resour/rscOrdrAdd";
	}
	
}
