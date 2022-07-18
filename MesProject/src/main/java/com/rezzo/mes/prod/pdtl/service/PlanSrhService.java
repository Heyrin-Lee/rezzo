package com.rezzo.mes.prod.pdtl.service;

import java.util.List;

public interface PlanSrhService {
	public List<PlanSrhVO> getList(PlanSrhVO vo);
	public void deletePlan(PlanSrhVO vo);
	public void deletePlanDtl(PlanSrhVO vo);
	public void deleteHolding(PlanSrhVO vo);
}
