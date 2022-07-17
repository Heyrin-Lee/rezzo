package com.rezzo.mes.equip.eqm.service;

import java.util.List;

public interface EqmService {
	public List<EqmVO> eqmList(EqmVO vo);

	public List<EqmVO> eqmSelect(String keyword);

	public void eqmInsert(EqmVO vo);
	
	public void eqmUpdate(EqmVO vo);

	public void eqmDelete(EqmVO vo);
	
	public void eqmImgUpdate(EqmVO vo);
	
	public void eqmImgInsert(EqmVO vo);

}
