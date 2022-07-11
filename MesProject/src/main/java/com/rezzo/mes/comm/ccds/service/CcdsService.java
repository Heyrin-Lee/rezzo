package com.rezzo.mes.comm.ccds.service;

import java.util.List;

public interface CcdsService {
	
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO);

	public List<CcdsVO> ccdsSelect(String keyword);

	public void ccdsInsert(CcdsVO ccdsVO);

	public void ccdsUpdate(CcdsVO ccdsVO);

	public void ccdsDelete(CcdsVO ccdsVO);

}
