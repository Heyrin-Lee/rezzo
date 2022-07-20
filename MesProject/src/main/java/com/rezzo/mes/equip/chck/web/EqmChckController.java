package com.rezzo.mes.equip.chck.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.equip.chck.service.EqmChckService;
import com.rezzo.mes.equip.chck.service.EqmChckVO;
import com.rezzo.mes.equip.eqm.service.EqmService;
import com.rezzo.mes.equip.eqm.service.EqmVO;
import com.rezzo.mes.equip.line.service.EqmLineService;
import com.rezzo.mes.equip.line.service.EqmLineVO;
import com.rezzo.mes.equip.opr.service.EqmOprService;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class EqmChckController {
	
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
	EqmOprService EqmOprservice;
	@Autowired
	EqmChckService service;

	@RequestMapping("eqmChck")
	public String eqmChck(Model model, EqmVO vo, EqmLineVO lineVo, PrcsVO prcsVo, CcdsVO ccdsVO) {

		return "equip/eqmchck";
	}
	
	@GetMapping("eqmChckList")
	@ResponseBody
	public List<EqmChckVO> eqmChckList(EqmChckVO vo, EqmVO eqmVo){
		List<EqmChckVO> chckList = service.eqmChckList(vo);
		return chckList;
	}
	
	@PostMapping("eqmChckSave")
	@ResponseBody
	public void eqmChckSave(EqmChckVO vo) {
		service.eqmChckSave(vo);
	}
	
	@PostMapping("eqmChckDelete")
	@ResponseBody
	public EqmChckVO eqmChckDelete(EqmChckVO vo) {
		service.eqmChckDelete(vo);
		return vo;
	}
	
	@PostMapping("eqmChckSearch")
	@ResponseBody
	public List<EqmChckVO> eqmChckSearch(EqmChckVO vo, EqmVO eqmVo){
		List<EqmChckVO> chckSearch = service.eqmChckSearch(vo);
		return chckSearch;
	}
	
}
