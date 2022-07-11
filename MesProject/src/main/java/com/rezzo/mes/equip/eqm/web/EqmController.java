package com.rezzo.mes.equip.eqm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.equip.eqm.mapper.EqmMapper;
import com.rezzo.mes.equip.eqm.service.EqmVO;
import com.rezzo.mes.equip.line.mapper.EqmLineMapper;
import com.rezzo.mes.equip.line.service.EqmLineVO;

@Controller
public class EqmController {

	@Autowired
	EqmMapper map;
	@Autowired
	EqmLineMapper mapper;

	@RequestMapping("eqm")
	public String eqmLineList (Model model){
		List<EqmLineVO> eqmLineList = mapper.eqmLineList(null);
		model.addAttribute("opList", eqmLineList);
		return "equip/eqm";
	}
	
	
	@GetMapping("eqmList")
	@ResponseBody
	public List<EqmVO> EqmList(EqmVO vo, Model model) {
		List<EqmVO> eqmList = map.eqmList(vo);
		return eqmList;
	}

	@PostMapping("eqmSelect")
	@ResponseBody
	public List<EqmVO> eqmSelect(@RequestParam(value = "keyword") String keyword, Model model) {
		return map.eqmSelect(keyword);
	}


	/*
	 * @RequestMapping("line") public String line() { return "eqm/line"; }
	 * 
	 * @RequestMapping("eqmopr") public String eqmopr() { return "eqm/eqmopr"; }
	 * 
	 * @RequestMapping("/eqmchek") public String eqmchek() { return "eqm/eqmchek"; }
	 * 
	 * @RequestMapping("/rltmeqm") public String rltmeqm() { return "eqm/rltmeqm"; }
	 */
}