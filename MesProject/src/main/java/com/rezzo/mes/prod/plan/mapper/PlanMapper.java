package com.rezzo.mes.prod.plan.mapper;

import java.util.List;

import com.rezzo.mes.prod.plan.service.PlanVO;

public interface PlanMapper {
	public List<PlanVO> orderListModal(PlanVO vo);
	public Integer getIndex(PlanVO vo);
}
