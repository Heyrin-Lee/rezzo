package com.rezzo.mes.resour.search.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rezzo.mes.resour.search.service.OrdrSearchVO;

@Mapper
public interface OrdrSearchMapper {

	// 상단 그리드 전체조회
	List<OrdrSearchVO> ordrSearchList (OrdrSearchVO vo);
	
	// 상단 그리드 검색
	List<OrdrSearchVO> ordrSearchOneList (OrdrSearchVO vo);
	
	List<OrdrSearchVO> ordrDtlList (OrdrSearchVO vo);

	// 업데이트
	
	void ordrDtlUpdate (OrdrSearchVO vo);
	
}
