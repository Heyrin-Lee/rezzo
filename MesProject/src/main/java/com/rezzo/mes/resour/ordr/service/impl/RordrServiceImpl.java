package com.rezzo.mes.resour.ordr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rezzo.mes.resour.ordr.mapper.RordrMapper;
import com.rezzo.mes.resour.ordr.service.RordrService;
import com.rezzo.mes.resour.ordr.service.RordrVO;

public class RordrServiceImpl implements RordrService{

	@Autowired RordrMapper mapper;

	@Override
	public List<RordrVO> ordrList(RordrVO vo) {
		return mapper.rordrList(vo);
	}
}
