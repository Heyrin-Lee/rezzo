package com.rezzo.mes.prod.prcs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.prod.prcs.mapper.PrcsMapper;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class PrcsController {
	
	@Autowired PrcsMapper mapper;
	
	@GetMapping("/prcsList")
	@ResponseBody
	public List<PrcsVO> prcsList(PrcsVO vo) {
		return mapper.prcsList(vo); 
	}
	
	@GetMapping("/prcs")
	public String prcs() {
		return "prod/prcs";
	}
	
	
	
}
