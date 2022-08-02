package com.rezzo.mes.sales.stc.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.stc.mapper.SalesStcMapper;
import com.rezzo.mes.sales.stc.service.SalesStcService;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

@Service
public class SalesStcServiceImpl implements SalesStcService{

	@Autowired SalesStcMapper mapper;

	//제품명 조회 모달
	@Override
	public List<SalesStcVO> getPrdtNm(SalesStcVO vo) {
		return mapper.getPrdtNm(vo);
	}

	//완제품LOT번호별 재고 목록 조회(조건별)
	@Override
	public List<SalesStcVO> getLotStcList(SalesStcVO vo) {
		return mapper.getLotStcList(vo);
	}

	//완제품LOT번호별 재고 목록 전체조회(첫페이지)
	@Override
	public List<SalesStcVO> getStcAllList(SalesStcVO vo) {
		return mapper.getStcAllList(vo);
	}

	
	
}
