package com.rezzo.mes.comm.rsc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rezzo.mes.comm.rsc.service.RscVO;

public interface RscMapper {
	
	//전체목록 및 검색
	public List<RscVO> getRscList(@Param("state") int state, @Param("keyword") String keyword);
	//입력 or 수정
	public void saveRsc(RscVO rscVO);
	//삭제
	public void delRsc(RscVO rscVO);

}
