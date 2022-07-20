package com.rezzo.mes.prod.indica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.prod.indica.service.IndicaService;
import com.rezzo.mes.prod.indica.service.IndicaVO;
import com.rezzo.mes.prod.pdtl.service.PlanSrhVO;
import com.rezzo.mes.prod.indica.mapper.IndicaMapper;

@Service
public class IndicaServiceImpl implements IndicaService {
	@Autowired IndicaMapper mapper;
	
	@Override
	public List<IndicaVO> planListModal(IndicaVO vo) {
		return mapper.planListModal(vo);
	}

	@Override
	public List<IndicaVO> getRsc(IndicaVO vo) {
		return mapper.getRsc(vo);
	}

	@Override
	public void indicaInsert(List<IndicaVO> list) {
		for(IndicaVO vo  : list) {
			mapper.indicaInsert(vo);
		}
	}

	@Override
	public void indicaDtlInsert(List<IndicaVO> list) {
		for(IndicaVO vo  : list) {
			mapper.indicaDtlInsert(vo);
		}
	}

	@Override
	public List<IndicaVO> getIndicaList(IndicaVO vo) {
		return mapper.getIndicaList(vo);
	}

	@Override
	public void deleteIndica(IndicaVO vo) {
		mapper.deleteIndica(vo);
	}

	@Override
	public void deleteIndicaDtl(IndicaVO vo) {
		mapper.deleteIndicaDtl(vo);
	}

	@Override
	public void updatePlan(IndicaVO vo) {
		mapper.updatePlan(vo);
	}
}
