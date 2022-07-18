package com.rezzo.mes.sales.ist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.ist.mapper.SalesIstMapper;
import com.rezzo.mes.sales.ist.service.SalesIstService;
import com.rezzo.mes.sales.ist.service.SalesIstVO;

@Service
public class SalesIstServiceImpl implements SalesIstService{
	
	@Autowired SalesIstMapper mapper;

	@Override
	public List<SalesIstVO> salesIst(SalesIstVO vo) {
		return mapper.salesIst(vo);
	}
	

}
