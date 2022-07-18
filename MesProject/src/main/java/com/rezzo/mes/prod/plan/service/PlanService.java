package com.rezzo.mes.prod.plan.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface PlanService {
	public List<PlanVO> orderListModal(PlanVO vo);
	public PlanVO getIndex(PlanVO vo);
	public List<PlanVO> getPrcsFlow(PlanVO vo);
	public List<PlanVO> getRscInfo(PlanVO vo);
	public void planInsert(PlanVO vo);
	public void grid1Insert(PlanVO vo);
	public void grid2Insert(PlanVO vo);
	public void grid5Insert(List<PlanVO> list);
}
