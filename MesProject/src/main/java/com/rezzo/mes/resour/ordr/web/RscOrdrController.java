package com.rezzo.mes.resour.ordr.web;

import com.rezzo.mes.resour.ordr.mapper.RscOrdrMapper;
import com.rezzo.mes.resour.ordr.service.RscOrdrService;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	
	@GetMapping("rscCOrdrList")
	@ResponseBody
	public List<RscOrdrVO> rscOrdrList(RscOrdrVO vo){
		List<RscOrdrVO> rscCOrdrList = service.rscCOrdrList(vo);
		return rscCOrdrList;
	}
	
	@PostMapping("rscSOrdrList")
	@ResponseBody
	public List<RscOrdrVO> rscSOrdrList(RscOrdrVO vo){
		List<RscOrdrVO> rscSOrdrList = service.rscSOrdrList(vo);
		return rscSOrdrList;
	}
	
	@PostMapping("rscRowSelectList")
	@ResponseBody
	public List<RscOrdrVO> rscRowSelectList(@Param("rscCd") RscOrdrVO vo){
		List<RscOrdrVO> rscRowSelectList = service.rscRowSelectList(vo);
		return rscRowSelectList;
	}
	
	@PostMapping("rscOrdrInsert")
	@ResponseBody
	public List<RscOrdrVO> rscOrdrInsert(@RequestBody List<RscOrdrVO> OrdrList, RscOrdrVO vo){
		service.rscOrdrFInsert(OrdrList);
		service.rscOrdrInsert(OrdrList);
		return service.rscCOrdrList(vo);
	}
	
}
