package com.rezzo.mes.sales.oust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.oust.mapper.OustMapper;
import com.rezzo.mes.sales.oust.service.OustService;
import com.rezzo.mes.sales.oust.service.OustVO;

@Service
public class OustServiceImpl implements OustService{

	@Autowired OustMapper mapper;
	public List<OustVO> searchOust(OustVO vo) {
		return mapper.searchOust(vo);
	}
}
