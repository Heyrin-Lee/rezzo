package com.rezzo.mes.sales.stc.service;

import java.util.List;

public interface SalesStcService {

	public List<SalesStcVO> makeDtSearch(SalesStcVO vo);
	
	//제품명 조회 모달
	public List<SalesStcVO> getPrdtNm(SalesStcVO vo);
	//완제품 입출고, 수량 조회
	public List<SalesStcVO> getSalesRecord(SalesStcVO vo);
}
