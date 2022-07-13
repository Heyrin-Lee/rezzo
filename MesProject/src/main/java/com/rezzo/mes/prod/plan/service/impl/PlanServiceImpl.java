package com.rezzo.mes.prod.plan.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.prod.plan.mapper.PlanMapper;
import com.rezzo.mes.prod.plan.service.PlanService;
import com.rezzo.mes.prod.plan.service.PlanVO;
@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired PlanMapper mapper;
	
	@Override
	public List<PlanVO> orderListModal(PlanVO vo) {
		return mapper.orderListModal(vo);
	}

	@Override
	public Integer getIndex(PlanVO vo) {
		return mapper.getIndex(vo);
	}

	@Override
	public List<Map> getPrcsFlow(PlanVO vo) {
		return mapper.getPrcsFlow(vo);
	}

}
