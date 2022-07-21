package com.rezzo.mes.resour.ordr.web;

import com.rezzo.mes.resour.ordr.mapper.RscOrdrMapper;
import com.rezzo.mes.resour.ordr.service.RscOrdrService;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RscOrdrController {

	@Autowired
	RscOrdrMapper mapper;
	@Autowired
	RscOrdrService service;
	
	
	@RequestMapping("rscOrdr")
	public String rordrList() {
		return "resour/rscOrdr";
	}
	
	@RequestMapping("rscOrdrAdd")
	public String rordrAdd() {
		return "resour/rscOrdrAdd";
	}
	
	@PostMapping("rscOrdrCd")
	@ResponseBody
	public List<RscOrdrVO> rscOrdrCd(RscOrdrVO vo) {
		List<RscOrdrVO> ordrCd = service.rscOrdrCd(vo);
		return ordrCd;		
	}
	
	@GetMapping("rscOrdrList")
	@ResponseBody
	public List<RscOrdrVO> rscOrdrList(RscOrdrVO vo){
		List<RscOrdrVO> rscOrdrList = service.RscOrdrList(vo);
		return rscOrdrList;
	}
	
}
