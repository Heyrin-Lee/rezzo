package com.rezzo.mes.comm.ccds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.ccds.mapper.CcdsMapper;
import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;

@Service
public class CcdsServiceImpl implements CcdsService{
	
	@Autowired CcdsMapper mapper;

	@Override
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO) {
		return mapper.ccdsList(ccdsVO);
	}

	@Override
	public List<CcdsVO> ccdsSelect(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ccdsInsert(CcdsVO ccdsVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccdsUpdate(CcdsVO ccdsVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccdsDelete(CcdsVO ccdsVO) {
		// TODO Auto-generated method stub
		
	}

}
