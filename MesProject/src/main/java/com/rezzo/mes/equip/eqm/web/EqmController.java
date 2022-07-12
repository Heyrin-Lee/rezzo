package com.rezzo.mes.equip.eqm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.equip.eqm.service.EqmService;
import com.rezzo.mes.equip.eqm.service.EqmVO;
import com.rezzo.mes.equip.line.service.EqmLineService;
import com.rezzo.mes.equip.line.service.EqmLineVO;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class EqmController {

	@Autowired
	EqmService eqmService;
	@Autowired
	EqmLineService lineService;
	@Autowired
	PrcsService prcsService;

	@RequestMapping("eqm")
	public String eqmLineList (Model model, EqmLineVO vo, PrcsVO prcsVo){
		List<EqmLineVO> eqmLineList = lineService.eqmLineList(vo);
		model.addAttribute("opList", eqmLineList);
		
		List<PrcsVO> prcsList=prcsService.prcsList(prcsVo);
		model.addAttribute("prcsList", prcsList);
		
		return "equip/eqm";
	}
	
	
	@GetMapping("eqmList")
	@ResponseBody
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public List<EqmVO> EqmList(EqmVO vo, Model model) {
		List<EqmVO> eqmList = eqmService.eqmList(vo);
		return eqmList;
	}

	@PostMapping("eqmSelect")
	@ResponseBody
	public List<EqmVO> eqmSelect(@RequestParam(value = "keyword") String keyword, Model model) {
		return eqmService.eqmSelect(keyword);
	}
	
	@PostMapping("eqmDelete/{eqmCd}")
	@ResponseBody
	public EqmVO eqmDelete (@PathVariable String eqmCd, EqmVO vo) {
		vo.setEqmCd(eqmCd);
		eqmService.eqmDelete(vo);
		return vo;
	}; 

	@PostMapping("eqmInsert")
	@ResponseBody
	public EqmVO eqmLineInsert(EqmVO vo) {
		eqmService.eqmInsert(vo);
		return vo;
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