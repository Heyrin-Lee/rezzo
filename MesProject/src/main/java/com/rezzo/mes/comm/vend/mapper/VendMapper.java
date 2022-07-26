package com.rezzo.mes.comm.vend.mapper;

import java.util.List;
import java.util.Map;

import com.rezzo.mes.comm.vend.service.VendVO;

public interface VendMapper {
	
	//전체목록 및 검색
	public List<VendVO> getVendList(VendVO vendVO);
	//입력 or 수정
	public void saveVend(VendVO vendVO);
	//삭제
	public void delVend(VendVO vendVO);
	//엑셀 전체목록받아오기
	public List<Map<String, Object>> getVendListMap(VendVO vendVO);
}
