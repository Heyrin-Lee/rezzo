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


@Controller
public class EqmController {

	@Autowired EqmMapper map;

	@RequestMapping("eqm")
	public String eqm() {
		return "eqm/eqm";
	}

	@GetMapping("eqmList")
	@ResponseBody
	public List<EqmVO> EqmList(EqmVO vo) {
		List<EqmVO> eqmList = map.eqmList(vo);
		return eqmList;
	}


	 @PostMapping("eqmSelect")
	 public String eqmSelect(@RequestParam(value="keyword") String keyword, Model model) {
		 model.addAttribute("selectList", map.eqmSelect(keyword));
		 return "eqmSelect";
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
