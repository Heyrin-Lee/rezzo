package com.rezzo.mes.eqm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.rezzo.mes.eqm.mapper.EqmMapper;
import com.rezzo.mes.eqm.service.EqmService;
import com.rezzo.mes.eqm.vo.EqmVO;

@Service
public class EqmServiceImpl implements EqmService {

	@Autowired
	private EqmMapper map;
	
	@Override
	public List<EqmVO> eqmList() {
		return map.eqmList();
	}

	@Override
	public EqmVO eqmSelect(EqmVO vo) {
		return map.eqmSelect(vo);
	}

	@Override
	public int eqmInsert(EqmVO vo) {
		return map.eqmInsert(vo);
	}

	@Override
	public int eqmUpdate(EqmVO vo) {
		return map.eqmUpdate(vo);
	}

	@Override
	public int eqmDelete(EqmVO vo) {
		return map.eqmDelete(vo);
	}

}
