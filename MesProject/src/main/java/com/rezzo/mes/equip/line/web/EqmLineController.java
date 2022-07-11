package com.rezzo.mes.equip.line.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.equip.line.mapper.EqmLineMapper;
import com.rezzo.mes.equip.line.service.EqmLineVO;

@Controller
public class EqmLineController {
	
	@Autowired 
	EqmLineMapper map;
	
	@RequestMapping("eqmLine")
	public String line() {
		return "equip/eqmLine";
	}
	
	@GetMapping("eqmLineList")
	@ResponseBody
	public List<EqmLineVO> eqmLineList(EqmLineVO vo){
		List<EqmLineVO> eqmLineList = map.eqmLineList(vo);
		return eqmLineList;
	}
	
	@PostMapping("eqmLineDelete/{lindCd}")
	@ResponseBody
	public EqmLineVO eqmLineDelete (@PathVariable String lindCd, EqmLineVO vo) {
		vo.setLineCd(lindCd);
		map.eqmLineDelete(vo);
		return vo;
	}
	
	@PostMapping("eqmLineInsert")
	@ResponseBody
	public EqmLineVO eqmLineInsert(EqmLineVO vo) {
		map.eqmLineInsert(vo);
		return vo;
	}
	
	@PostMapping("eqmLineUpdate")
	@ResponseBody
	public EqmLineVO eqmLineUpdate(EqmLineVO vo) {
		map.eqmLineUpdate(vo);
		return vo;
	}
	
 
}
