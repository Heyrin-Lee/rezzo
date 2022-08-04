package com.rezzo.mes.equip.line.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.equip.line.mapper.EqmLineMapper;
import com.rezzo.mes.equip.line.service.EqmLineService;
import com.rezzo.mes.equip.line.service.EqmLineVO;

@Service
public class EqmLineServiceImpl implements EqmLineService {

	@Autowired
	private EqmLineMapper map;

	@Override
	public List<EqmLineVO> eqmLineList(EqmLineVO vo) {
		return map.eqmLineList(vo);
	}
 
	@Override
	public void eqmLineUpdate(EqmLineVO vo) {
		map.eqmLineUpdate(vo);
	}

	@Override
	public void eqmLineDelete(EqmLineVO vo) {
		map.eqmLineDelete(vo);
	}
	@Override
	public List<EqmLineVO> eqmLineSelectList(EqmLineVO vo) {
		return map.eqmLineSelectList(vo);		
	}

	@Override
	public EqmLineVO getLineCd() {
		return map.getLineCd();
	};

}
