package com.rezzo.mes.sales.edcts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.sales.edcts.mapper.EdctsMapper;

@Controller
public class EdctsController {

	@Autowired EdctsMapper mapper;
	
	@RequestMapping("edctsList")
	public String edctsList() {
		return "sales/edctsList";
	}
	
}
