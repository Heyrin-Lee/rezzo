package com.rezzo.mes.prod.prcs.service.impl;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<Map> prcsFind(PrcsVO vo) {
		return mapper.prcsFind(vo);
	}

	@Override
	public void prcsInsert(PrcsVO vo) {
		mapper.prcsInsert(vo);
	}

	@Override
	public void prcsDelete(PrcsVO vo) {
		mapper.prcsDelete(vo);
	}
}
