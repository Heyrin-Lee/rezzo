package com.rezzo.mes.comm.vend.service;

import java.util.List;

public interface VendService {
	
	//전체목록 및 검색
	public List<VendVO> getVendList(VendVO vendVO);
	//입력 or 수정
	public void saveVend(VendVO vendVO);
	//삭제
	public void delVend(VendVO vendVO);

}
