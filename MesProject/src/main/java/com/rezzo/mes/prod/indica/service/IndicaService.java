package com.rezzo.mes.prod.indica.service;

import java.util.List;



public interface IndicaService {
	public List<IndicaVO> planListModal(IndicaVO vo); 
	public List<IndicaVO> getRsc(IndicaVO vo);
	public void indicaInsert(List<IndicaVO> list);
	public void indicaDtlInsert(List<IndicaVO> list);
	public void updatePlan(IndicaVO vo);
	
	public List<IndicaVO> getIndicaList(IndicaVO vo);
	public void deleteIndica(IndicaVO vo);
	public void deleteIndicaDtl(IndicaVO vo);
}
