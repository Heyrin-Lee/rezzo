package com.rezzo.mes.prod.plansrh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.prod.plan.mapper.PlanMapper;
import com.rezzo.mes.prod.plansrh.mapper.PlanSrhMapper;
import com.rezzo.mes.prod.plansrh.service.PlanSrhService;
import com.rezzo.mes.prod.plansrh.service.PlanSrhVO;
@Service
public class PlanSrhServiceImpl implements PlanSrhService {

	@Autowired PlanSrhMapper mapper;
	@Override
	public List<PlanSrhVO> getList(PlanSrhVO vo) {
		return mapper.getList(vo);
	}

}
