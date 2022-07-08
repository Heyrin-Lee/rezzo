package com.rezzo.mes.eqm.eqm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.eqm.eqm.mapper.EqmMapper;
import com.rezzo.mes.eqm.eqm.service.EqmService;
import com.rezzo.mes.eqm.eqm.service.EqmVO;

@Service
public class EqmServiceImpl implements EqmService {

	@Autowired
	private EqmMapper map;

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
	public List<EqmVO> eqmSelect(String keyword) {
		List<EqmVO> list = map.eqmSelect(keyword);
		return list;
	}

}
