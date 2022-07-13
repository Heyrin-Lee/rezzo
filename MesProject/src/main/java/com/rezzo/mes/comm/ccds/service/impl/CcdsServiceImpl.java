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
public class CcdsServiceImpl implements CcdsService {

	@Autowired
	CcdsMapper mapper;

	// 공통코드 전체리스트 조회
	@Override
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO) {
		return mapper.ccdsList(ccdsVO);
	}

	// 공통코드 정보 조회
	@Override
	public CcdsVO ccdInfo(CcdsVO ccdsVO) {
		return mapper.ccdInfo(ccdsVO);
	}

	// 공통코드 검색(코드이름)
	@Override
	public List<CcdsVO> ccdsSelect(String keyword) {
		return mapper.ccdsSelect(keyword);
	}

	// 공통코드 추가
	@Override
	public void ccdsInsert(CcdsVO ccdsVO) {
		mapper.ccdsInsert(ccdsVO);
	}

	// 공통코드 수정
	@Override
	public void ccdsUpdate(CcdsVO ccdsVO) {
		mapper.ccdsUpdate(ccdsVO);
	}

	// 세부공통코드 리스트 조회(공통코드, 공용)
	@Override
	public List<CcdsVO> getCodeList(CcdsVO ccdsVO) {
		return mapper.getCodeList(ccdsVO);
	}

	// 공통코드 검색(다중 파라미터)
	@Override
	public Map<String, List<CcdsVO>> getCodes(String... ccds) {
		Map<String, List<CcdsVO>> map = new HashMap<String, List<CcdsVO>>();
		for (String ccd : ccds) {
			map.put(ccd, mapper.getCodeList(new CcdsVO(ccd)));
		}
		return map;
	}

	// 세부코드 추가
	@Override
	public void saveCcdDtl(String ccd, List<CcdsVO> dtlList) {
		if (ccd != "") {
			for (CcdsVO ccdDtl : dtlList) {
				ccdDtl.setCcd(ccd);
				mapper.ccdDtlInsert(ccdDtl);
			}
		} else {
			for (CcdsVO ccdDtl : dtlList) {
				mapper.ccdDtlUpdate(ccdDtl);
			}
		}

	}

	// 세부코드 수정
	@Override
	public void ccdDtlUpdate(List<CcdsVO> dtlList) {
		for (CcdsVO ccdDtl : dtlList) {
			mapper.ccdDtlUpdate(ccdDtl);
		}
	}
}
