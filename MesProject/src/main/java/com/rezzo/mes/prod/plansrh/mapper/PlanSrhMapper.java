package com.rezzo.mes.prod.plansrh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rezzo.mes.prod.plansrh.service.PlanSrhVO;
@Mapper
public interface PlanSrhMapper {
	public List<PlanSrhVO> getList(PlanSrhVO vo);
}
