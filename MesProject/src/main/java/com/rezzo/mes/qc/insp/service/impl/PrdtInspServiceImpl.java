package com.rezzo.mes.qc.insp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.qc.insp.mapper.PrdtInspMapper;
import com.rezzo.mes.qc.insp.service.PrdtInspService;
import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.order.service.OrderVO;

@Service
public class PrdtInspServiceImpl implements PrdtInspService {

	@Autowired
	PrdtInspMapper mapper;

	@Override
	public List<PrdtInspVO> getInspCode() {
		return mapper.getInspCode();
	}

	@Override
	public List<OrderVO> prdtInspOrder() {
		return mapper.prdtInspOrder();
	}

	@Override
	public void delPrdtInsp(PrdtInspVO prdtInspVO) {
		mapper.delPrdtInsp(prdtInspVO);
	}

	@Override
	public void savePrdtInsp(List<PrdtInspVO> prdtInspList) {
		
		for (int i = 0; i < prdtInspList.size(); i++) {
			if (i == 0) {
				mapper.savePrdtInsp(prdtInspList.get(0));
			} else {
				mapper.savePrdtInspDtl(prdtInspList.get(i));
			}
		}
	}

	@Override
	public List<PrdtInspVO> getPrdtInsp(PrdtInspVO prdtInspVO) {
		return mapper.getPrdtInsp(prdtInspVO);
	}

}
