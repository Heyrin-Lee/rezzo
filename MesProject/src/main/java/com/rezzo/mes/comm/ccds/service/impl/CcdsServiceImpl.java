package com.rezzo.mes.comm.ccds.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<CcdsVO> ccdsDtlList(String keyword) {
		return mapper.ccdsDtlList(keyword);
	}

	@Override
	public List<CcdsVO> ccdsSelect(String keyword) {
		return mapper.ccdsSelect(keyword);
	}

	@Override
	public void ccdsInsert(CcdsVO ccdsVO) {

	}

	@Override
	public void ccdsUpdate(CcdsVO ccdsVO) {
	}

	@Override
	public void ccdsDelete(CcdsVO ccdsVO) {
	}

	@Override
	public List<CcdsVO> getCodeList(CcdsVO ccdsVO) {
		return mapper.getCodeList(ccdsVO);
	}
	
	@Override
	public Map<String, List<CcdsVO>> getCodes(String... ccds) {
		Map<String, List<CcdsVO>> map = new HashMap<String, List<CcdsVO>>();
		for(String ccd : ccds) {
			map.put(ccd, mapper.getCodeList(new CcdsVO(ccd)));
		}
		return map;
	}
}
