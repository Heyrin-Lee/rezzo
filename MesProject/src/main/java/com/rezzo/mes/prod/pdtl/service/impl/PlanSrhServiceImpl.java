package com.rezzo.mes.prod.pdtl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.prod.pdtl.mapper.PlanSrhMapper;
import com.rezzo.mes.prod.pdtl.service.PlanSrhService;
import com.rezzo.mes.prod.pdtl.service.PlanSrhVO;
import com.rezzo.mes.prod.plan.mapper.PlanMapper;
@Service
public class PlanSrhServiceImpl implements PlanSrhService {

	@Autowired PlanSrhMapper mapper;
	@Override
	public List<PlanSrhVO> getList(PlanSrhVO vo) {
		return mapper.getList(vo);
	}
	@Override
	public void deletePlan(PlanSrhVO vo) {
		mapper.deletePlan(vo);
	}
	@Override
	public void deletePlanDtl(PlanSrhVO vo) {
		mapper.deletePlanDtl(vo);
	}
	@Override
	public void deleteHolding(PlanSrhVO vo) {
		mapper.deleteHolding(vo);
	}

	

}
