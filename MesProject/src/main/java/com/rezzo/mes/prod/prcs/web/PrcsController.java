package com.rezzo.mes.prod.prcs.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class PrcsController {
	
	@Autowired PrcsService service;
	@Autowired CcdsService ccdsService;
	
	@GetMapping("/prcs")
	public String vend(Model model, CcdsVO vo) {
		model.addAttribute("ccds", ccdsService.getCodes("PRC"));
		return "prod/prcs";
	}

	/* 전체공정조회 */
	@GetMapping("/prcsList")
	@ResponseBody
	public List<PrcsVO> prcsList(PrcsVO vo) {
		return service.prcsList(vo); 
	}
	
	/* 공정구분으로 조회 */
	@GetMapping("/prcsList/{option}")
	@ResponseBody
	public List<Map> prcsSelectList(@PathVariable String option, PrcsVO vo) {
		vo.setPrcsFg(option);
		return service.prcsFind(vo);
	}
	
	/* 새로운 공정등록 */
	@GetMapping("/prcsInsert")
	@ResponseBody
	public PrcsVO prcsInsert(PrcsVO vo) {
		System.out.println(vo);
		service.prcsInsert(vo); 
		return vo;
	}
	
	/* 공정삭제 */
	@PostMapping("/prcsDelete")
	@ResponseBody
	public int prcsDelete(@RequestBody List<PrcsVO> list) {
		service.prcsDelete(list);
		return list.size();
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
	
//	@GetMapping("/prcsSearch")
//	public String prcsSearch() {
//		return "prod/prcsSearch";
//	}
//	
	@GetMapping("/prodMng")
	public String prodMng() {
		return "prod/prodMng";
	}
	
}
