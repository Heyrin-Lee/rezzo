package com.rezzo.mes.prod.prog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.prod.prog.mapper.ProgMapper;
import com.rezzo.mes.prod.prog.service.ProgService;
import com.rezzo.mes.prod.prog.service.ProgVO;

@Service
public class ProgServiceImpl implements ProgService {
	
	@Autowired ProgMapper mapper;
	
	@Override
	public List<ProgVO> indicaListModal(ProgVO vo) {
		return mapper.indicaListModal(vo);
	}

	@Override
	public List<ProgVO> getPrcsProg(ProgVO vo) {
		return mapper.getPrcsProg(vo);
	}

}
