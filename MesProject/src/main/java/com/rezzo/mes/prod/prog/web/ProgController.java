package com.rezzo.mes.prod.prog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.prod.prog.service.ProgService;
import com.rezzo.mes.prod.prog.service.ProgVO;
import com.rezzo.mes.resour.oust.web.RscOustController;

@Controller
public class ProgController {
	@Autowired ProgService service;
	@Autowired RscOustController controller;
	
	//자재 관련 컨트롤autowired 해야함
	//com.rezzo.mes.resour.oust.web
	//letHoldOust 호출 
		
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
	// +설비 켜기 추가
	@RequestMapping("insertEqmCd")
	@ResponseBody
	@Transactional
	public void insertEqmCd(ProgVO vo) {
		System.out.println(vo);
		service.insertEqmCd(vo);
		service.updateEqm1(vo);
	}
	
	@RequestMapping("selectEqm")
	@ResponseBody
	public ProgVO selectEqm(ProgVO vo) {
		return service.selectEqm(vo);
	}
	
	// 주문서 상태 생산완료로, 설비 끄기, 불량 업데이트
	@RequestMapping("afterProd")
	@ResponseBody
	@Transactional
	public void afterProd(ProgVO vo) {
		service.updateOrderStatus(vo);
		service.updateEqm2(vo);
		service.insertEdctsInfo(vo);
		service.updateIndica(vo);
	}
	
	// 공정 insert 공정상세, 불량상세
	@RequestMapping("insertProgPrcs")
	@ResponseBody
	public void insertProgPrcs(@RequestBody List<ProgVO> list) {
		service.insertProgPrcs(list);
	}
	
	@RequestMapping("insertInfer")
	@ResponseBody
	public void insertInfer(ProgVO vo) {
		service.insertInfer(vo);
	}
	
}
