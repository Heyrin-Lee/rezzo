package com.rezzo.mes.prod.plan.web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.equip.line.service.EqmLineService;
import com.rezzo.mes.equip.line.service.EqmLineVO;
import com.rezzo.mes.prod.plan.service.PlanService;
import com.rezzo.mes.prod.plan.service.PlanVO;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class Plancontroller {
	@Autowired
	PlanService service;
	
	@Autowired
	EqmLineService lineService;
	
	@RequestMapping("plan")
	public String lineList(Model model, EqmLineVO vo) {
		List<EqmLineVO> eqmLineSelectList = lineService.eqmLineSelectList(vo);
		model.addAttribute("line", eqmLineSelectList);

		return "prod/plan";
	}

	@RequestMapping("orderListModal")
	@ResponseBody
	public List<PlanVO> orderListModal(PlanVO vo) {
		return service.orderListModal(vo);
	}
 
	@GetMapping("getIndex")
	@ResponseBody
	public PlanVO getIndex(PlanVO vo) {
		return service.getIndex(vo);
	}
  
	@PostMapping("getPrcsFlow")
	@ResponseBody
	public List<PlanVO> getPrcsFlow(PlanVO vo) {
		return service.getPrcsFlow(vo);
	}

	@RequestMapping("getRscInfo")
	@ResponseBody
	public List<PlanVO> getRscInfo(PlanVO vo) {
		return service.getRscInfo(vo);
	}

	 
	@PostMapping("plan12Insert") 
	@ResponseBody
	public void plan12Insert(@RequestBody List<PlanVO> list) {
		service.grid1Insert(list.get(0));
		service.grid2Insert(list.get(1));
		service.orderUpdate(null);
	}
	 
	@PostMapping("grid5Update")
	@ResponseBody
	public void grid5Update(@RequestBody List<PlanVO> list) {
		service.grid5Update(list); 
	}  
 	
	@RequestMapping("orderUpdate")
	@ResponseBody
	public void orderUpdate(PlanVO vo) {
		service.orderUpdate(vo);
	}

}
