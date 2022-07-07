package com.rezzo.mes.prod.prcs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.prod.prcs.mapper.PrcsMapper;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;
@Service
public class PrcsServiceImpl implements PrcsService {
	
	@Autowired PrcsMapper mapper;

	@Override
	public List<PrcsVO> prcsList(PrcsVO vo) {
		return mapper.prcsList(vo);
	}
}
