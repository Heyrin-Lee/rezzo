package com.rezzo.mes.prod.indica.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.prod.indica.service.IndicaService;
import com.rezzo.mes.prod.indica.service.IndicaVO;
import com.rezzo.mes.prod.pdtl.service.PlanSrhVO;
import com.rezzo.mes.prod.plan.service.PlanVO;

@Controller
public class IndicaController {
	@Autowired IndicaService service;
	
	@RequestMapping("planListModal")
	@ResponseBody
	public List<IndicaVO> planListModal(IndicaVO vo) {
		return service.planListModal(vo);
	}
	
	@RequestMapping("getRsc")
	@ResponseBody
	public List<IndicaVO> getRsc(IndicaVO vo) {
		return service.getRsc(vo);
	}
	  
	@RequestMapping("indInsert")
	@ResponseBody
	public void indInsert(@RequestBody List<IndicaVO> list) {
		service.indicaInsert(list);
		service.indicaDtlInsert(list);
	}
	
	@PostMapping("getIndicaList")
	@ResponseBody
	public List<IndicaVO> getIndicaList(IndicaVO vo) {
		return service.getIndicaList(vo);
	}
	
	@RequestMapping("deleteIndica")
	@ResponseBody
	public void deletePlan(IndicaVO vo) {
		service.deleteIndica(vo);
		service.deleteIndicaDtl(vo);
	}
	
	
}
