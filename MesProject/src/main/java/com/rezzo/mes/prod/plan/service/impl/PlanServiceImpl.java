package com.rezzo.mes.prod.plan.service.impl;

import java.util.List;

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
	public int getIndex(PlanVO vo) {
		return mapper.getIndex(vo);
	}

}
