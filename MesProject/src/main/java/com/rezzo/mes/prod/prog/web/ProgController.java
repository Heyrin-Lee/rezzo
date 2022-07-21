package com.rezzo.mes.prod.prog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.prod.prog.service.ProgService;
import com.rezzo.mes.prod.prog.service.ProgVO;

@Controller
public class ProgController {
	@Autowired ProgService service;
	
	@RequestMapping("indicaListModal")
	@ResponseBody
	public List<ProgVO> indicaListModal(ProgVO vo) {
		return service.indicaListModal(vo);
	}
	
	@RequestMapping("getPrcsProg")
	@ResponseBody
	public List<ProgVO> getPrcsProg(ProgVO vo) {
		return service.getPrcsProg(vo);
	}
}
