package com.rezzo.mes.equip.line.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.equip.line.service.EqmLineService;
import com.rezzo.mes.equip.line.service.EqmLineVO;

@Controller
public class EqmLineController {

	@Autowired
	EqmLineService service;

	@RequestMapping("eqmLine")
	public String line() {
		return "equip/eqmLine";
	}

	@GetMapping("eqmLineList")
	@ResponseBody
	public List<EqmLineVO> eqmLineList(EqmLineVO vo) {
		List<EqmLineVO> eqmLineList = service.eqmLineList(vo);
		return eqmLineList;
	}

	@PostMapping("eqmLineDelete/{lindCd}")
	@ResponseBody
	public EqmLineVO eqmLineDelete(@PathVariable String lindCd, EqmLineVO vo) {
		vo.setLineCd(lindCd);
		service.eqmLineDelete(vo);
		return vo;
	}

	@PostMapping("eqmLineInsert")
	@ResponseBody
	public EqmLineVO eqmLineInsert(EqmLineVO vo) {
		service.eqmLineInsert(vo);
		return vo;
	}

	@PostMapping("eqmLineUpdate")
	@ResponseBody
	public EqmLineVO eqmLineUpdate(EqmLineVO vo) {
		service.eqmLineUpdate(vo);
		return vo;
	}

	@PostMapping("eqmLineSelectList")
	@ResponseBody
	public EqmLineVO eqmLineSelectList(EqmLineVO vo) {
		service.eqmLineSelectList(vo);
		return vo;
	}

}
