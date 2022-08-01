package com.rezzo.mes.equip.opr.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;



@Service
public interface EqmOprService {
	
		public List<EqmOprVO> eqmOprList(EqmOprVO vo);
				
		public List<Map<String, String>> OprList();
		
		public List<Map<String, String>> OprGetList(String keyword);
		
		public List<EqmOprVO> OprKeyList(EqmOprVO vo);
		
		public void eqmOprInsert (EqmOprVO vo);
		
		public void OprDelete(EqmOprVO vo);
		
		public List<Map<String, String>> OprSelectList(String keyword);
		
		public void oprUpdate (EqmOprVO vo);
		
		//엑셀 전체목록받아오기
		public List<Map<String, Object>> getOprListMap(EqmOprVO vo);

}
