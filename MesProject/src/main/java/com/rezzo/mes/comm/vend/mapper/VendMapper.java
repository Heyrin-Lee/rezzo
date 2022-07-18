package com.rezzo.mes.comm.vend.mapper;

import java.util.List;

import com.rezzo.mes.comm.vend.service.VendVO;

public interface VendMapper {
	
	//전체목록 및 검색
	public List<VendVO> getVendList(VendVO vendVO);
	//입력 or 수정
	public void saveVend(VendVO vendVO);
	//삭제
	public void delVend(VendVO vendVO);
}
