package com.rezzo.mes.comm.flow.mapper;

import java.util.List;

import com.rezzo.mes.comm.flow.service.PrcsFlowVO;

public interface PrcsFlowMapper {
	
	public List<PrcsFlowVO> getFlowList(PrcsFlowVO flowVO);
	
	public void saveFlow(PrcsFlowVO flowVO);

	public void delFlow(PrcsFlowVO flowVO);
}
