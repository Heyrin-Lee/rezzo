package com.rezzo.mes.prod.plan.web;

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
import com.rezzo.mes.prod.plan.service.PlanService;
import com.rezzo.mes.prod.plan.service.PlanVO;

@Controller
public class Plancontroller {
	@Autowired
	PlanService service;

	@RequestMapping("orderListModal")
	@ResponseBody
	public List<PlanVO> orderListModal(PlanVO vo) {
		return service.orderListModal(vo);
	}

	@GetMapping("getIndex")
	@ResponseBody
	public Integer getIndex(PlanVO vo) {
		System.out.println(vo.getIndicaDt());
		return service.getIndex(vo);
	}

	@PostMapping("getPrcsFlow")
	@ResponseBody
	public List<PlanVO> getPrcsFlow(PlanVO vo) {
		System.out.println(vo.getEdctsCd());
		return service.getPrcsFlow(vo);
	}

	@RequestMapping("getRscInfo")
	@ResponseBody
	public List<PlanVO> getRscInfo(PlanVO vo) {
		System.out.println(vo.getEdctsCd());
		return service.getRscInfo(vo);
	}

	
	@RequestMapping("planInsert") 
	public void planInsert(PlanVO vo, List<PlanVO> list) {
		service.grid1Insert(vo);
		service.grid2Insert(vo);
		service.grid4Insert(list);
	}
	 

}
