package com.rezzo.mes.sales.stc.mapper;

import java.util.List;

import com.rezzo.mes.sales.stc.service.SalesStcVO;

public interface SalesStcMapper {
	
	//제품명 조회 모달
	public List<SalesStcVO> getPrdtNm(SalesStcVO vo);
	//완제품LOT번호별 재고 목록 저체조회(첫페이지)
	public List<SalesStcVO> getStcAllList(SalesStcVO vo);
	//완제품LOT번호별 재고 목록 조회(조건별)
	public List<SalesStcVO> getLotStcList(SalesStcVO vo);
}
