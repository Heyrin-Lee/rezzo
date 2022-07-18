package com.rezzo.mes.resour.ordr.service.impl;

import com.rezzo.mes.resour.ordr.mapper.RscOrdrMapper;
import com.rezzo.mes.resour.ordr.service.RscOrdrService;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RordrServiceImpl implements RscOrdrService {

	@Autowired
	RscOrdrMapper mapper;

	@Override
	public List<RscOrdrVO> RscOrdrList(RscOrdrVO vo) {
		return mapper.RscOrdrList(vo);
	}
}
