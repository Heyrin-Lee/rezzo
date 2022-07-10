package com.rezzo.mes.sales.edcts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rezzo.mes.sales.edcts.mapper.EdctsMapper;
import com.rezzo.mes.sales.edcts.service.EdctsService;
import com.rezzo.mes.sales.edcts.service.EdctsVO;

public class EdctsServiceImpl implements EdctsService{

	@Autowired EdctsMapper mapper;
	
	@Override
	public List<EdctsVO> edctsList(EdctsVO vo) {
		return mapper.edctsList(vo);
	}
}
