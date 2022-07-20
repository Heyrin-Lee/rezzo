package com.rezzo.mes.comm.flow.service;

import java.util.List;

public interface PrcsFlowService {
	
	public List<PrcsFlowVO> getFlowList(PrcsFlowVO flowVO);
	
	public void saveFlow(String edctsCd, List<PrcsFlowVO> flowList);
	
	public void delFlow(PrcsFlowVO flowVO);
}
