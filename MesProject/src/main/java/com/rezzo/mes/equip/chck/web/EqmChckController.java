package com.rezzo.mes.equip.chck.web;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rezzo.mes.CommonExcelView;
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
	@Autowired CommonExcelView commonExcelView;
	
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
	public void eqmChckDelete(@RequestBody List<EqmChckVO> eqmChckList) {
		service.eqmChckDelete(eqmChckList);
	};
	
	@PostMapping("eqmChckSearch")
	@ResponseBody
	public List<EqmChckVO> eqmChckSearch(EqmChckVO vo, EqmVO eqmVo){
		List<EqmChckVO> chckSearch = service.eqmChckSearch(vo);
		return chckSearch;
	}
	
	
	//내역 엑셀 다운로드
	@GetMapping(path="eqmChckExelView", produces = "application/vnd.ms-excel")
	public ModelAndView excelView(EqmChckVO vo, HttpServletResponse response) throws IOException {
		List<Map<String, Object>> list = service.getEqmListMap(vo);
		HashMap<String, Object> map = new HashMap<String, Object>();
		String[] header = {"점검코드", "설비코드", "설비명","가동여부", "점검일자", "점검구분", "판정", "조치사항", "조치내역", "담당자"};
		map.put("headers", header);
		map.put("filename", "eqmChck_list");
		map.put("datas", list);
		return new ModelAndView(commonExcelView, map);
	}
	
}
