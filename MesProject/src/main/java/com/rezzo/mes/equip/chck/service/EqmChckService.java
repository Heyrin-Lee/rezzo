package com.rezzo.mes.equip.chck.service;

import java.util.List;

public interface EqmChckService {
	
	public List<EqmChckVO> eqmChckList(EqmChckVO vo);
	
	public void eqmChckSave(EqmChckVO vo);
	
	public void eqmChckDelete(EqmChckVO vo);
	
	public List<EqmChckVO> eqmChckSearch(EqmChckVO vo);
}
