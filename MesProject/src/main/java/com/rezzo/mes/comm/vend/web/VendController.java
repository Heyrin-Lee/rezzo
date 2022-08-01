package com.rezzo.mes.comm.vend.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.vend.service.VendService;
import com.rezzo.mes.comm.vend.service.VendVO;

@Controller
public class VendController {
	
	@Autowired CcdsService ccdsService;
	@Autowired VendService vendService;
	
	@GetMapping("vend")
	public String vend(Model model) {
		model.addAttribute("ccds", ccdsService.getCodes("VND"));
		return "comm/vend";
	}
	
	@PostMapping("getVendList")
	@ResponseBody
	public List<VendVO> getVendList(VendVO vendVO) {
		return vendService.getVendList(vendVO);
	}
	
	@PostMapping("saveVend")
	@ResponseBody
	public List<VendVO> saveVend(VendVO vendVO) {
		vendService.saveVend(vendVO);
		return vendService.getVendList(null);
	}
	
	@PostMapping("delVend")
	@ResponseBody
	public List<VendVO> delVend(VendVO vendVO) {
		vendService.delVend(vendVO);
		return vendService.getVendList(null);
	}
	
	//거래처정보 엑셀 다운로드
	@RequestMapping(path="vendExelView", produces = "application/vnd.ms-excel")
	public ModelAndView excelView(VendVO vendVO, HttpServletResponse response) throws IOException {
		List<Map<String, Object>> list = vendService.getVendListMap(vendVO);
		HashMap<String, Object> map = new HashMap<String, Object>();
		String[] header = {"구분", "거래처코드", "거래처명", "사업자등록번호", "전화번호", "비고"};
		map.put("headers", header);
		map.put("filename", "vend_list");
		map.put("datas", list);
		return new ModelAndView("commonExcelView", map);
	}
	
}
