package com.rezzo.mes.comm.ccds.mapper;

import java.util.List;

import com.rezzo.mes.comm.ccds.service.CcdsVO;

public interface CcdsMapper {
	
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO);

	public List<CcdsVO> ccdsSelect(String keyword);

	public void ccdsInsert(CcdsVO ccdsVO);

	public void ccdsUpdate(CcdsVO ccdsVO);

	public void ccdsDelete(CcdsVO ccdsVO);

}
