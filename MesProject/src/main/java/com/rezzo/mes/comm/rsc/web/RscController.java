package com.rezzo.mes.comm.rsc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.rsc.service.RscService;
import com.rezzo.mes.comm.rsc.service.RscVO;

@Controller
public class RscController {
	
	@Autowired CcdsService ccdsService;
	@Autowired RscService rscService;
	
	@RequestMapping("rsc")
	public String rsc(Model model) {
		model.addAttribute("ccds", ccdsService.getCodes("WHS","RSC"));
		return "comm/rsc";
	}
	
	@RequestMapping("getRscList")
	@ResponseBody
	public List<RscVO> getRscList(@RequestParam("state") int state, @RequestParam(value="keyword") String keyword) {
		return rscService.getRscList(state, keyword);
	}
	
	//입력 or 수정
	@RequestMapping("saveRsc")
	@ResponseBody
	public List<RscVO> saveRsc(RscVO rscVO) {
		rscService.saveRsc(rscVO);
		return rscService.getRscList(1,"전체");
	}
	
	//삭제
	@RequestMapping("delRsc")
	@ResponseBody
	public List<RscVO> delRsc(RscVO rscVO) {
		rscService.delRsc(rscVO);
		return rscService.getRscList(1,"전체");
	}

}
