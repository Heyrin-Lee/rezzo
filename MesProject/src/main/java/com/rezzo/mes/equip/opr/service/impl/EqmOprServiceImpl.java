package com.rezzo.mes.equip.opr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public List<Map<String, String>> OprGetList(String keyword) {
		return map.OprGetList(keyword);
	}

	@Override
	public List<EqmOprVO> OprKeyList(EqmOprVO vo) {
		return map.OprKeyList(vo);
	}

	@Override
	public List<Map<String, Object>> getOprListMap(EqmOprVO vo) {
		return map.getOprListMap(vo);
	}


	

}
