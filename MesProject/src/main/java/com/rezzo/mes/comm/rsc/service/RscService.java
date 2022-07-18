package com.rezzo.mes.comm.rsc.service;

import java.util.List;

public interface RscService {
	
	//전체목록 및 검색
	public List<RscVO> getRscList(int state, String keyword);
	//입력 or 수정
	public void saveRsc(RscVO rscVO);
	//삭제
	public void delRsc(RscVO rscVO);

}
