package com.rezzo.mes.comm.edcts.service;

import java.util.List;

public interface EdctsmService {
	
	//전체목록 및 검색
	public List<EdctsmVO> getEdctsList(EdctsmVO edctsVO);
	//입력 or 수정
	public void saveEdcts(EdctsmVO edctsVO);
	//삭제
	public void delEdcts(EdctsmVO edctsVO);

}
