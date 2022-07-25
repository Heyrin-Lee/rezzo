package com.rezzo.mes.prod.prog.mapper;

import java.util.List;

import com.rezzo.mes.prod.prog.service.ProgVO;

public interface ProgMapper {
	public List<ProgVO> indicaListModal(ProgVO vo);
	public List<ProgVO> getPrcsProg(ProgVO vo);
	public void insertEqmCd(ProgVO vo);
	public void updateEqm1(ProgVO vo);
	public ProgVO selectEqm(ProgVO vo);
	public void updateOrderStatus(ProgVO vo);
	public void updateEqm2(ProgVO vo);
}
