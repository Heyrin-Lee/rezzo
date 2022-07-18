package com.rezzo.mes.prod.pdtl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rezzo.mes.prod.pdtl.service.PlanSrhVO;
@Mapper
public interface PlanSrhMapper {
	public List<PlanSrhVO> getList(PlanSrhVO vo);
	public void deletePlan(PlanSrhVO vo);
	public void deletePlanDtl(PlanSrhVO vo);
	public void deleteHolding(PlanSrhVO vo);
	public List<PlanSrhVO> planListModal(PlanSrhVO vo);
}
