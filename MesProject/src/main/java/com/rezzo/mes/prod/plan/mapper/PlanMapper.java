package com.rezzo.mes.prod.plan.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.rezzo.mes.prod.plan.service.PlanVO;

@Mapper
public interface PlanMapper {
	public List<PlanVO> orderListModal(PlanVO vo);
	public Integer getIndex(PlanVO vo);
	public List<PlanVO> getPrcsFlow(PlanVO vo);
	public List<PlanVO> getRscInfo(PlanVO vo);
	public void planInsert(PlanVO vo);
	public void grid1Insert(PlanVO vo);
	public void grid2Insert(PlanVO vo);
	public void grid4Insert(List<PlanVO> list);
}
