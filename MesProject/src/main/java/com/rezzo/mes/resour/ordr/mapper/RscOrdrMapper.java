package com.rezzo.mes.resour.ordr.mapper;

import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RscOrdrMapper {

	List<RscOrdrVO> RscOrdrList(RscOrdrVO vo);
	
	List<RscOrdrVO> rscOrdrCd(RscOrdrVO vo);
	
	// 그리드 상단 조회
	List<RscOrdrVO> rscCOrdrList(RscOrdrVO vo);
}
