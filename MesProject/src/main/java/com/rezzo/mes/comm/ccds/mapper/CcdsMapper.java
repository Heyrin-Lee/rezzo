package com.rezzo.mes.comm.ccds.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.rezzo.mes.comm.ccds.service.CcdsVO;

@Mapper
public interface CcdsMapper {
	
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO);

	public List<CcdsVO> ccdsDtlList(String keyword);
	
	public List<CcdsVO> ccdsSelect(String keyword);

	public void ccdsInsert(CcdsVO ccdsVO);

	public void ccdsUpdate(CcdsVO ccdsVO);

	public void ccdsDelete(CcdsVO ccdsVO);

	public List<CcdsVO> getCodeList(CcdsVO ccdsVO);
	public Map<String, List<CcdsVO>> getCodes(String ... ccds);
}
