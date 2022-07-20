package com.rezzo.mes.comm.flow.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.flow.service.PrcsFlowService;
import com.rezzo.mes.comm.flow.service.PrcsFlowVO;

@Controller
public class PrcsFlowController {
	
	@Autowired PrcsFlowService service;
	
	@RequestMapping("getFlowList")
	@ResponseBody
	public List<PrcsFlowVO> getFlowList(PrcsFlowVO flowVO) {
		return service.getFlowList(flowVO);
	}
	
	@RequestMapping("saveFlow/{edctsCd}")
	@ResponseBody
	public List<PrcsFlowVO> saveFlow(@PathVariable("edctsCd")String edctsCd, @RequestBody List<PrcsFlowVO> flowList) {
		service.saveFlow(edctsCd, flowList);
		PrcsFlowVO flowVO = flowList.get(0);
		flowVO.setEdctsCd(edctsCd);
		return service.getFlowList(flowVO);
	}
	
	@RequestMapping("delFlow")
	@ResponseBody
	public List<PrcsFlowVO> delFlow(PrcsFlowVO flowVO) {
		service.delFlow(flowVO);
		return service.getFlowList(flowVO);
	}
}
