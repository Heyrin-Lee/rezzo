package com.rezzo.mes.resour.search.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdrSearchService {
	
	// 상단 그리드 전체조회
	List<OrdrSearchVO> ordrSearchList (OrdrSearchVO vo);
	
	// 상단 그리드 검색
	List<OrdrSearchVO> ordrSearchOneList (OrdrSearchVO vo);
	
	// 하단 그리드 발주 세부내역 조회
	List<OrdrSearchVO> ordrDtlList (OrdrSearchVO vo);
	
	// 업데이트
	
	void ordrDtlUpdate (List<OrdrSearchVO> ordrDtlUpdate);
	
}
