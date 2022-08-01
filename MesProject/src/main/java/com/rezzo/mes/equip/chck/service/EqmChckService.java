package com.rezzo.mes.equip.chck.service;

import java.util.List;
import java.util.Map;


public interface EqmChckService {
	
	public List<EqmChckVO> eqmChckList(EqmChckVO vo);
	
	public void eqmChckSave(EqmChckVO vo);
	
	public void eqmChckDelete(EqmChckVO vo);
	
	public List<EqmChckVO> eqmChckSearch(EqmChckVO vo);
	
	//엑셀 전체목록받아오기
	public List<Map<String, Object>> getEqmListMap(EqmChckVO vo);

	
}
