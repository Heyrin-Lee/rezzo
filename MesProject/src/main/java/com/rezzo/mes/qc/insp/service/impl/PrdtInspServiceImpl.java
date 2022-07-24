package com.rezzo.mes.qc.insp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.qc.insp.mapper.PrdtInspMapper;
import com.rezzo.mes.qc.insp.service.PrdtInspService;
import com.rezzo.mes.qc.insp.service.PrdtInspVO;

@Service
public class PrdtInspServiceImpl implements PrdtInspService {
	
	@Autowired PrdtInspMapper mapper;
	
	@Override
	public List<PrdtInspVO> getInspCode() {
		return mapper.getInspCode();
	}

}
