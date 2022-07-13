package com.rezzo.mes.comm.ccds.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;

@Controller
public class CcdsController {

	@Autowired CcdsService service;
	
	@RequestMapping("ccds")
	public String ccds() {
		return "comm/ccds";
	}
	
	@RequestMapping("ccdsList")
	@ResponseBody
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO) {
		List<CcdsVO> ccdsList = service.ccdsList(ccdsVO);
		return ccdsList;
	}
	
	@PostMapping("ccdInfo")
	@ResponseBody
	public CcdsVO ccdInfo(CcdsVO ccdsVO) {
		CcdsVO ccdInfo = service.ccdInfo(ccdsVO);
		 return ccdInfo;
	 }
	
	@PostMapping("ccdsSelect")
	@ResponseBody
	public List<CcdsVO> ccdsSelect(@RequestParam(value="keyword") String keyword) {
		List<CcdsVO> ccdsSelect = service.ccdsSelect(keyword);
		 return ccdsSelect;
	 }
	
	@PostMapping("ccdsInsert")
	public String ccdsInsert(CcdsVO ccdsVO) {
		service.ccdsInsert(ccdsVO);
		return "comm/ccds";
	}
	
	@PostMapping("ccdsUpdate")
	public String ccdsUpdate(CcdsVO ccdsVO) {
		service.ccdsUpdate(ccdsVO);
		return "comm/ccds";
	}
	
	@PostMapping("getCodeList")
	@ResponseBody
	public List<CcdsVO> getCodeList(CcdsVO ccdsVO) {
		List<CcdsVO> getCodeList = service.getCodeList(ccdsVO);
		return getCodeList;
	}
	
	@PostMapping("/saveCcdDtl/{ccd}")
	@ResponseBody
	public List<CcdsVO> saveCcdDtl(@PathVariable("ccd") String ccd, @RequestBody List<CcdsVO> dtlList, CcdsVO ccdsVO) {
		service.saveCcdDtl(ccd, dtlList);
		ccdsVO.setCcd(ccd);
		return service.getCodeList(ccdsVO);
	}
	
	
	//화면확인 test
	@RequestMapping("bom")
	public String bom() {
		return "comm/bom";
	}
	
	@RequestMapping("edcts")
	public String edcts() {
		return "comm/edcts";
	}
	
	@RequestMapping("rsc")
	public String rsc() {
		return "comm/rsc";
	}
	
	@RequestMapping("wrhous")
	public String wrhous() {
		return "comm/wrhous";
	}
	
}
