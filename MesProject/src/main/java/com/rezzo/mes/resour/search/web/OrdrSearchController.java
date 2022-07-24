package com.rezzo.mes.resour.search.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.resour.search.service.OrdrSearchService;
import com.rezzo.mes.resour.search.service.OrdrSearchVO;

@Controller
public class OrdrSearchController {
	
	@Autowired
	OrdrSearchService service;
	
	@RequestMapping("rscOrdrSearch")
	public String resourOrdrSearch() {
		return "resour/rscOrdrSearch";
	}
	
	@GetMapping("ordrSearchList")
	@ResponseBody
	public List<OrdrSearchVO> ordrSearchList(OrdrSearchVO vo) {
		List<OrdrSearchVO> ordrSearchList = service.ordrSearchList(vo);
		return ordrSearchList;
	}
	
}
