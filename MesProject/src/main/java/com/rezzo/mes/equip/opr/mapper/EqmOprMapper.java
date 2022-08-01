package com.rezzo.mes.equip.opr.mapper;

import java.util.List;
import java.util.Map;

import com.rezzo.mes.equip.opr.service.EqmOprVO;

public interface EqmOprMapper {

	
	public List<EqmOprVO> eqmOprList(EqmOprVO vo);
	
	public void eqmOprInsert(EqmOprVO vo);
	
	public List<Map<String, String>> OprList();
	
	public List<Map<String, String>> OprGetList(String keyword);
	
	public List<EqmOprVO> OprKeyList(EqmOprVO vo);
	
	public void OprDelete(EqmOprVO vo);
	
	public List<Map<String, String>> OprSelectList(String keyword);
	
	public void oprUpdate (EqmOprVO vo);
	
	//엑셀 전체목록받아오기
	public List<Map<String, Object>> getOprListMap(EqmOprVO vo);
}
