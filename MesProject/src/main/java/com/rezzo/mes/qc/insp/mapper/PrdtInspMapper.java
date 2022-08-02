package com.rezzo.mes.qc.insp.mapper;

import java.util.List;
import java.util.Map;

import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.order.service.OrderVO;

public interface PrdtInspMapper {

	public List<PrdtInspVO> getInspCode();
	public List<OrderVO> prdtInspOrder();
	public void delPrdtInsp(PrdtInspVO prdtInspVO);
	public void savePrdtInsp(PrdtInspVO prdtInspVO);
	public void savePrdtInspDtl(PrdtInspVO prdtInspVO);
	public List<PrdtInspVO> getPrdtInsp(PrdtInspVO prdtInspVO);
	public List<PrdtInspVO> getPrdtInspDtl(PrdtInspVO prdtInspVO);
	public List<Map<String, Object>> getPrdtInspListMap(PrdtInspVO prdtInspVO);
}
