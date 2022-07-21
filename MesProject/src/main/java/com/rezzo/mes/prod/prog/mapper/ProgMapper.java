package com.rezzo.mes.prod.prog.mapper;

import java.util.List;

import com.rezzo.mes.prod.prog.service.ProgVO;

public interface ProgMapper {
	public List<ProgVO> indicaListModal(ProgVO vo);
	public List<ProgVO> getPrcsProg(ProgVO vo);
}
