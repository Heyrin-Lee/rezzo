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
	public String getIndex(PlanVO vo) {
		return mapper.getIndex(vo);
	}

	@Override
	public List<PlanVO> getPrcsFlow(PlanVO vo) {
		return mapper.getPrcsFlow(vo);
	}

	@Override
	public List<PlanVO> getRscInfo(PlanVO vo) {
		return mapper.getRscInfo(vo);
	}

	@Override
	public void planInsert(PlanVO vo) {
		mapper.planInsert(vo);
	}

	@Override
	public void grid1Insert(PlanVO vo) {
		mapper.grid1Insert(vo);
		
	}

	@Override
	public void grid2Insert(PlanVO vo) {
		mapper.grid2Insert(vo);
	}

	@Override
	public void grid4Insert(List<PlanVO> list) {
		for(PlanVO vo : list) {
			mapper.grid4Insert(vo);
		}
	}

}
