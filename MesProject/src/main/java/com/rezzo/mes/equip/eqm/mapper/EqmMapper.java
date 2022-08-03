package com.rezzo.mes.equip.eqm.mapper;

import java.util.List;

import com.rezzo.mes.equip.eqm.service.EqmVO;


public interface EqmMapper {

	public List<EqmVO> eqmList(EqmVO vo);

	public List<EqmVO> eqmSelect(int opN,String keyword);;

	public void eqmInsert(EqmVO vo);
	
	public void eqmUpdate(EqmVO vo);
	
	public void eqmImgUpdate(EqmVO vo);
	
	public void eqmImgInsert(EqmVO vo);

	public void eqmDelete(EqmVO vo);
	
	public List<EqmVO> eqmCdSelect(String keyword);
	
	public void eqmUsUpdate(EqmVO vo);

}
