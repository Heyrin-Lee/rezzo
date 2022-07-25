package com.rezzo.mes.resour.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.resour.search.mapper.OrdrSearchMapper;
import com.rezzo.mes.resour.search.service.OrdrSearchService;
import com.rezzo.mes.resour.search.service.OrdrSearchVO;

@Service
public class OrdrSearchServiceImpl implements OrdrSearchService {
	
	@Autowired
	OrdrSearchMapper mapper;

	@Override
	public List<OrdrSearchVO> ordrSearchList(OrdrSearchVO vo) {
		return mapper.ordrSearchList(vo);
	}

	@Override
	public List<OrdrSearchVO> ordrSearchOneList(OrdrSearchVO vo) {
		return mapper.ordrSearchList(vo);
	}
	
	
	
}
