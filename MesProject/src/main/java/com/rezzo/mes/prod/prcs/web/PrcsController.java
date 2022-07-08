package com.rezzo.mes.prod.prcs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.prod.prcs.mapper.PrcsMapper;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class PrcsController {
	
	@Autowired PrcsMapper mapper;

	/* 전체공정조회 */
	@GetMapping("/prcsList")
	@ResponseBody
	public List<PrcsVO> prcsList(PrcsVO vo) {
		return mapper.prcsList(vo); 
	}
	
	/* 공정구분으로 단건조회 */
	@GetMapping("/prcsList/{prcsFg}")
	@ResponseBody
	public PrcsVO prcsSelectList(@PathVariable String prcsCtnt, PrcsVO vo) {
		vo.setPrcsCtnt(prcsCtnt);
		return vo;
	}
	
	@GetMapping("/prcs")
	public String prcs() {
		return "prod/prcs";
	}
	
	@GetMapping("/indica")
	public String indica() {
		return "prod/indica";
	}
	
	@GetMapping("/indicaSearch")
	public String indicaSearch() {
		return "prod/indicaSearch";
	}
	
	@GetMapping("/plan")
	public String plan() {
		return "prod/plan";
	}
	
	@GetMapping("/planSearch")
	public String planSearch() {
		return "prod/planSearch";
	}
	
	@GetMapping("/prcsSearch")
	public String prcsSearch() {
		return "prod/prcsSearch";
	}
	
	@GetMapping("/prodMng")
	public String prodMng() {
		return "prod/prodMng";
	}
	
}
