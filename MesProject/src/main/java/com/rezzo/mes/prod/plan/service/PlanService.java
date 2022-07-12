package com.rezzo.mes.prod.plan.service;

import java.util.List;

import org.springframework.stereotype.Service;

public interface PlanService {
	public List<PlanVO> orderListModal(PlanVO vo);
	public Integer getIndex(PlanVO vo);
}
