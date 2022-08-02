package com.rezzo.mes.equip.chck.mapper;

import java.util.List;
import java.util.Map;

import com.rezzo.mes.equip.chck.service.EqmChckVO;

public interface EqmChckMapper {
	
	public List<EqmChckVO> eqmChckList(EqmChckVO vo);
	public void eqmChckSave(EqmChckVO vo);
	public void eqmChckDelete(EqmChckVO vo);
	public List<EqmChckVO> eqmChckSearch(EqmChckVO vo);
	public List<Map<String, Object>> getEqmListMap(EqmChckVO vo);
	
}
