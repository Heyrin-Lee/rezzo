package com.rezzo.mes.prod.indica.mapper;

import java.util.List;


import com.rezzo.mes.prod.indica.service.IndicaVO;
import com.rezzo.mes.prod.pdtl.service.PlanSrhVO;

public interface IndicaMapper {
	public List<IndicaVO> planListModal(IndicaVO vo);
	public List<IndicaVO> getRsc(IndicaVO vo);
	public void indicaInsert(IndicaVO vo);
	public void indicaDtlInsert(IndicaVO vo);
	public void updatePlan(IndicaVO vo);
	
	public List<IndicaVO> getIndicaList(IndicaVO vo);
	public void deleteIndica(IndicaVO vo);
	public void deleteIndicaDtl(IndicaVO vo);
	
	
}
