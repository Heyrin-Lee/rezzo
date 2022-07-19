package com.rezzo.mes.equip.opr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.equip.eqm.service.EqmVO;
import com.rezzo.mes.equip.opr.mapper.EqmOprMapper;
import com.rezzo.mes.equip.opr.service.EqmOprService;
import com.rezzo.mes.equip.opr.service.EqmOprVO;

@Service
public class EqmOprServiceImpl implements EqmOprService {

	@Autowired
	EqmOprMapper map;
	
	@Override
	public List<EqmOprVO> eqmOprList(EqmOprVO vo) {
		return map.eqmOprList(vo);
	}

	@Override
	public void eqmOprInsert(EqmOprVO vo) {
		map.eqmOprInsert(vo);
	}

	@Override
	public List<Map<String, String>> OprList() {
		return map.OprList();
	}



	@Override
	public List<Map<String, String>> OprSelectList(String keyword) {
		return map.OprSelectList(keyword);
	}

	@Override
	public void OprDelete(EqmOprVO vo) {
		map.OprDelete(vo);
	}

	@Override
	public void oprUpdate(EqmOprVO vo) {
		map.oprUpdate(vo);
	}


	

}
