package com.rezzo.mes.prod.indica.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.prod.indica.service.IndicaService;
import com.rezzo.mes.prod.indica.service.IndicaVO;

@Controller
public class IndicaController {
	@Autowired IndicaService service;
	
	@RequestMapping("planListModal")
	@ResponseBody
	public List<IndicaVO> planListModal(IndicaVO vo) {
		return service.planListModal(vo);
	}
}
