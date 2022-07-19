package com.rezzo.mes.comm.bom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.bom.mapper.BomMapper;
import com.rezzo.mes.comm.bom.service.BomService;
import com.rezzo.mes.comm.bom.service.BomVO;

@Service
public class BomServiceImpl implements BomService {
	
	@Autowired BomMapper mapper;

	@Override
	public List<BomVO> getBomList(String edctsCd) {
		return mapper.getBomList(edctsCd);
	}

	@Override
	public void saveBom(String edctsCd, List<BomVO> bomList) {
		mapper.saveBom(bomList);
	}

	@Override
	public void delBom(List<BomVO> bomList) {
		mapper.delBom(bomList);
	}

}
