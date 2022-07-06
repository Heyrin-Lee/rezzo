package com.rezzo.mes.eqm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rezzo.mes.eqm.vo.EqmVO;

public interface EqmMapper {
	
	List<EqmVO> eqmList();

	EqmVO eqmSelect(EqmVO vo);

	int eqmInsert(EqmVO vo);

	int eqmUpdate(EqmVO vo);

	int eqmDelete(EqmVO vo);

}
