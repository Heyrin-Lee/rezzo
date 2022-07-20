package com.rezzo.mes.comm.flow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.flow.mapper.PrcsFlowMapper;
import com.rezzo.mes.comm.flow.service.PrcsFlowService;
import com.rezzo.mes.comm.flow.service.PrcsFlowVO;

@Service
public class PrcsFlowServiceImpl implements PrcsFlowService {

	@Autowired PrcsFlowMapper mapper;

	@Override
	public List<PrcsFlowVO> getFlowList(PrcsFlowVO flowVO) {
		return mapper.getFlowList(flowVO);
	}

	@Override
	public void saveFlow(String edctsCd, List<PrcsFlowVO> flowList) {
		for(PrcsFlowVO flowVO : flowList) {
			flowVO.setEdctsCd(edctsCd);
			mapper.saveFlow(flowVO);
		}
	}
	
	@Override
	public void delFlow(PrcsFlowVO flowVO) {
		mapper.delFlow(flowVO);
	}

}
