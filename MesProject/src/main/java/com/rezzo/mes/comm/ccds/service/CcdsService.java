package com.rezzo.mes.comm.ccds.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CcdsService {
	//공통코드 전체리스트 조회
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO);
	//공통코드 정보 조회
	public CcdsVO ccdInfo(CcdsVO ccdsVO);
	//공통코드 검색(코드이름)
	public List<CcdsVO> ccdsSelect(String keyword);
	//공통코드 추가
	public void ccdsInsert(CcdsVO ccdsVO);
	//공통코드 수정
	public void ccdsUpdate(CcdsVO ccdsVO);
	//세부공통코드 리스트 조회(공통코드, 공용)
	public List<CcdsVO> getCodeList(CcdsVO ccdsVO);
	//공통코드 검색(다중 파라미터)
	public Map<String, List<CcdsVO>> getCodes(String ... ccds);
	
	//세부코드 추가
	public void saveCcdDtl(String ccd, List<CcdsVO> dtlList);
	//세부코드 수정
	public void ccdDtlUpdate(List<CcdsVO> dtlList);
}
