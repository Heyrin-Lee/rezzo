package com.rezzo.mes.equip.line.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.equip.line.mapper.EqmLineMapper;
import com.rezzo.mes.equip.line.service.EqmLineVO;

@Controller
public class EqmLineController {
	
	@Autowired 
	EqmLineMapper map;
	
	@RequestMapping("eqmLine")
	public String line() {
		return "eqm/eqmLine";
	}
	
	@GetMapping("eqmLineList")
	@ResponseBody
	public List<EqmLineVO> eqmLineList(EqmLineVO vo){
		List<EqmLineVO> eqmLineList = map.eqmLineList(vo);
		return eqmLineList;
	}
	

}
