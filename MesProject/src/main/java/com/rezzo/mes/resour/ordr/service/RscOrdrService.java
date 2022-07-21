package com.rezzo.mes.resour.ordr.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RscOrdrService {

    List<RscOrdrVO> RscOrdrList(RscOrdrVO vo);
    
	List<RscOrdrVO> rscOrdrCd(RscOrdrVO vo);
    
	// 그리드 상단 조회
	List<RscOrdrVO> rscCOrdrList(RscOrdrVO vo);
	
}
