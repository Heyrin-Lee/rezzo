package com.rezzo.mes.equip.opr.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.equip.eqm.service.EqmService;
import com.rezzo.mes.equip.eqm.service.EqmVO;
import com.rezzo.mes.equip.line.service.EqmLineService;
import com.rezzo.mes.equip.line.service.EqmLineVO;
import com.rezzo.mes.equip.opr.service.EqmOprService;
import com.rezzo.mes.equip.opr.service.EqmOprVO;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class EqmOprController {

	@Autowired
	String saveDir;
	@Autowired
	EqmService eqmService;
	@Autowired
	EqmLineService lineService;
	@Autowired
	PrcsService prcsService;
	@Autowired
	CcdsService ccdsService;
	@Value("$com.rezzo.upload.path}")
	private String uploadPath;
	@Autowired
	EqmOprService service;

	@RequestMapping("eqmOpr")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public String eqmOpr(Model model, EqmVO vo, EqmLineVO lineVo, PrcsVO prcsVo, CcdsVO ccdsVO) {
		List<EqmLineVO> eqmLineSelectList = lineService.eqmLineSelectList(lineVo);
		model.addAttribute("opList", eqmLineSelectList);

		List<EqmVO> eqmList = eqmService.eqmList(vo);
		model.addAttribute("eqmList", eqmList);

		List<PrcsVO> prcsList = prcsService.prcsList(prcsVo);
		model.addAttribute("prcsList", prcsList);

		model.addAttribute("ccds", ccdsService.getCodes("EQM"));

		return "equip/eqmOpr";
	}

	//전체목록
	@GetMapping("OprList")
	@ResponseBody
	public List<Map<String, String>> OprList() {
		List<Map<String, String>> result = service.OprList();
		return result;
	}
	
	// 가동/비가동 검색
	@PostMapping("OprSelectList")
	@ResponseBody
	public List<Map<String, String>> OprSelectList(@RequestParam(value="keyword")String keyword, Model model) {
		return service.OprSelectList(keyword);
	}
	
	@PostMapping("OprGetList")
	@ResponseBody
	public List<Map<String, String>> OprGetList(@RequestParam(value="keyword")String keyword) {
		return service.OprGetList(keyword);
	}

	// 등록

	@PostMapping("eqmOqrInsert")
	@ResponseBody
	public List<EqmVO> eqmOqrInsert(EqmOprVO vo, EqmVO eqmVo, Model model) {
		service.eqmOprInsert(vo);
		List<EqmVO> eqmList = eqmService.eqmList(eqmVo);
		return eqmList;
	}
	
	//삭제

	@PostMapping("OprDelete")
	@ResponseBody
	public EqmOprVO eqmDelete(EqmOprVO vo) {
		service.OprDelete(vo);
		return vo;
	};
	
	//세부내역 업데이트
	
	@PostMapping("OprUpdate")
	@ResponseBody
	public List<Map<String, String>> oprUpdate(EqmOprVO vo){
		System.out.println(vo);
		service.oprUpdate(vo);
		List<Map<String, String>> result = service.OprList();
		return result;
	}
	
	// 세부내역 검색
	
	@PostMapping("OprKeyList")
	@ResponseBody
	public List<EqmOprVO> OprKeyList(EqmOprVO vo) {
		return service.OprKeyList(vo);
	}
	
	
	
}
