package com.rezzo.mes.common.ccds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.common.ccds.mapper.CcdsMapper;
import com.rezzo.mes.common.ccds.service.CcdsService;
import com.rezzo.mes.common.ccds.service.CcdsVO;

@Service
public class CcdsServiceImpl implements CcdsService{
	
	@Autowired CcdsMapper mapper;

	@Override
	public List<CcdsVO> getCcdsList(CcdsVO ccdsVO) {
		return mapper.getCcdsList(ccdsVO);
	}

}
