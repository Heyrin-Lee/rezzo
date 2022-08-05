package com.rezzo.mes.equip.chck.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.equip.chck.mapper.EqmChckMapper;
import com.rezzo.mes.equip.chck.service.EqmChckService;
import com.rezzo.mes.equip.chck.service.EqmChckVO;

@Service
public class EqmChckServiceImpl implements EqmChckService{

	@Autowired
	public EqmChckMapper map;
	
	@Override
	public List<EqmChckVO> eqmChckList(EqmChckVO vo) {
		return map.eqmChckList(vo);
	}

	@Override
	public void eqmChckSave(EqmChckVO vo){
		map.eqmChckSave(vo);
	}

	@Override
	public void eqmChckDelete(List<EqmChckVO> eqmChckList) {
		for(EqmChckVO vo : eqmChckList) {
			map.eqmChckDelete(vo);
		}
	}

	@Override
	public List<EqmChckVO> eqmChckSearch(EqmChckVO vo) {
		return map.eqmChckSearch(vo);
	}

	@Override
	public List<Map<String, Object>> getEqmListMap(EqmChckVO vo) {
		return map.getEqmListMap(vo);
	}

	

	
}
