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
import com.rezzo.mes.prod.plan.service.PlanService;
import com.rezzo.mes.prod.plan.service.PlanVO;

@Controller
public class Plancontroller {
	@Autowired PlanService service;
	
	@RequestMapping("orderListModal")
	@ResponseBody
	public List<PlanVO> orderListModal(PlanVO vo) {
		return service.orderListModal(vo);
	}
	
	@GetMapping("getIndex")
	@ResponseBody
	public Integer getIndex(PlanVO vo) {
		return service.getIndex(vo);
	}
	
	@RequestMapping("getPrcsFlow/{edctsCd}")
	@ResponseBody
	public List<Map> getPrcsFlow(@PathVariable String edctsCd, @RequestBody PlanVO vo) {
		System.out.println(edctsCd);
		vo.setEdctsCd(edctsCd);
		return service.getPrcsFlow(vo);
	}
}

