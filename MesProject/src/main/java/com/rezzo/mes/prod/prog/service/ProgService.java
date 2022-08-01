package com.rezzo.mes.prod.prog.service;

import java.util.List;

public interface ProgService {
	public List<ProgVO> indicaListModal(ProgVO vo);
	public List<ProgVO> getPrcsProg(ProgVO vo);
	public void insertEqmCd(ProgVO vo);
	public void updateEqm1(ProgVO vo);
	public ProgVO selectEqm(ProgVO vo);
	public void updateOrderStatus(ProgVO vo);
	public void updateEqm2(ProgVO vo);
	public void insertProgPrcs(List<ProgVO> list);
	public void insertInfer(ProgVO vo);
	public void insertEdctsInfo(ProgVO vo);
	public void schedule(String eqmCd, String eqmCd2);
	public void updateIndica(ProgVO vo);
	public List<ProgVO> getHolding(ProgVO vo);
	public List<ProgVO> getProgPrcs(ProgVO vo);
}
