package com.rezzo.mes.prod.plansrh.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.prod.plansrh.service.PlanSrhService;
import com.rezzo.mes.prod.plansrh.service.PlanSrhVO;

@Controller
public class PlanSrhController {
	@Autowired PlanSrhService service;
	
	@PostMapping("getList")
	@ResponseBody
	public List<PlanSrhVO> getList(PlanSrhVO vo) {
		System.out.println(vo);
		return service.getList(vo);
	}
}
