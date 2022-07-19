package com.rezzo.mes.equip.opr.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rezzo.mes.equip.eqm.service.EqmVO;


@Service
public interface EqmOprService {
	
		public List<EqmOprVO> eqmOprList(EqmOprVO vo);
				
		public List<Map<String, String>> OprList();
		
		public void eqmOprInsert (EqmOprVO vo);
		
		public void OprDelete(EqmOprVO vo);
		
		public List<Map<String, String>> OprSelectList(String keyword);
		
		public void oprUpdate (EqmOprVO vo);

}
