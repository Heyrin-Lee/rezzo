package com.rezzo.mes.comm.edcts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.edcts.mapper.EdctsmMapper;
import com.rezzo.mes.comm.edcts.service.EdctsmService;
import com.rezzo.mes.comm.edcts.service.EdctsmVO;

@Service
public class EdctsmServiceImpl implements EdctsmService {

	@Autowired EdctsmMapper mapper;
	
	@Override
	public List<EdctsmVO> getEdctsList(EdctsmVO edctsVO) {
		return mapper.getEdctsList(edctsVO);
	}

	@Override
	public void saveEdcts(EdctsmVO edctsVO) {
		mapper.saveEdcts(edctsVO);
	}

	@Override
	public void delEdcts(EdctsmVO edctsVO) {
		mapper.delEdcts(edctsVO);
	}

	@Override
	public EdctsmVO getEdctsCd() {
		return mapper.getEdctsCd();
	}

}
