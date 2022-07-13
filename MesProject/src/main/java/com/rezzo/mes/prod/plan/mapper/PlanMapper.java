package com.rezzo.mes.prod.plan.mapper;

import java.util.List;
import java.util.Map;

import com.rezzo.mes.prod.plan.service.PlanVO;

public interface PlanMapper {
	public List<PlanVO> orderListModal(PlanVO vo);
	public Integer getIndex(PlanVO vo);
	public List<Map> getPrcsFlow(PlanVO vo);
}
