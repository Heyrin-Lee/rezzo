package com.rezzo.mes.eqm.service.impl;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.eqm.mapper.EqmMapper;
import com.rezzo.mes.eqm.service.EqmService;
import com.rezzo.mes.eqm.service.EqmVO;

@Service
public class EqmServiceImpl implements EqmService {

	@Autowired
	private EqmMapper map;

	org.slf4j.Logger logger = LoggerFactory.getLogger(EqmServiceImpl.class);

	@Override
	public List<EqmVO> eqmList(EqmVO vo) {
		return map.eqmList(vo);
	}

	@Override
	public void eqmInsert(EqmVO vo) {
		map.eqmInsert(vo);
	}

	@Override
	public void eqmUpdate(EqmVO vo) {
		map.eqmUpdate(vo);
	}

	@Override
	public void eqmDelete(EqmVO vo) {
		map.eqmDelete(vo);
	}

	@Override
	public List<EqmVO> eqmSelect(EqmVO vo) {
		return map.eqmSelect(vo);
	}

}
