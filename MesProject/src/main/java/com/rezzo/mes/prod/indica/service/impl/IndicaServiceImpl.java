package com.rezzo.mes.prod.indica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.prod.indica.service.IndicaService;
import com.rezzo.mes.prod.indica.service.IndicaVO;
import com.rezzo.mes.prod.indica.mapper.IndicaMapper;

@Service
public class IndicaServiceImpl implements IndicaService {
	@Autowired IndicaMapper mapper;
	
	@Override
	public List<IndicaVO> planListModal(IndicaVO vo) {
		return mapper.planListModal(vo);
	}

}
