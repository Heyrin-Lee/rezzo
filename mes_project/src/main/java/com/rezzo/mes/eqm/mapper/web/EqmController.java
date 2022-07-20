package com.rezzo.mes.eqm.mapper.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.eqm.mapper.EqmMapper;
import com.rezzo.mes.eqm.service.EqmVO;

@Controller
public class EqmController {

	@Autowired
	EqmMapper map;

	@RequestMapping("/eqm")
	public String eqm() {
		return "eqm/eqm";
	}

	@GetMapping("/eqmList")
	@ResponseBody
	public List<EqmVO> EqmList(EqmVO vo) {
		List<EqmVO> eqmList = map.eqmList(vo);
		return eqmList;
	}
	
	@GetMapping("/eqmSelect")
	@ResponseBody
	public List<EqmVO> EqmSelect(EqmVO vo) {
		List<EqmVO> eqmSelect = map.eqmSelect(vo);
		return eqmSelect;
	}
	@RequestMapping("/line")
	public String line() {
		return "eqm/line";
	}

	@RequestMapping("/eqmopr")
	public String eqmopr() {
		return "eqm/eqmopr";
	}

	@RequestMapping("/eqmchek")
	public String eqmchek() {
		return "eqm/eqmchek";
	}

	@RequestMapping("/rltmeqm")
	public String rltmeqm() {
		return "eqm/rltmeqm";
	}
}
