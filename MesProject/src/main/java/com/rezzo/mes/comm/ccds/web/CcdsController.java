package com.rezzo.mes.comm.ccds.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.mapper.CcdsMapper;
import com.rezzo.mes.comm.ccds.service.CcdsVO;

@Controller
public class CcdsController {

	@Autowired CcdsMapper mapper;
	
	@RequestMapping("ccds")
	public String ccds() {
		return "comm/ccds";
	}
	
	@RequestMapping("ccdsList")
	@ResponseBody
	public List<CcdsVO> ccdsList(CcdsVO vo) {
		List<CcdsVO> ccdsList = mapper.ccdsList(vo);
		return ccdsList;
	}
	
	@PostMapping("ccdsDtlList")
	@ResponseBody
	 public List<CcdsVO> ccdsDtlList(@RequestParam(value="keyword") String keyword) {
		List<CcdsVO> ccdsDtlList = mapper.ccdsDtlList(keyword);
		 return ccdsDtlList;
	 }
	
	@PostMapping("ccdsSelect")
	@ResponseBody
	 public List<CcdsVO> ccdsSelect(@RequestParam(value="keyword") String keyword) {
		List<CcdsVO> ccdsSelect = mapper.ccdsSelect(keyword);
		 return ccdsSelect;
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
