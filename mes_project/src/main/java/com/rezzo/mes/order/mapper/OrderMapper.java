package com.rezzo.mes.order.mapper;

import java.util.List;

import com.rezzo.mes.order.service.OrderVO;

public interface OrderMapper {
	
	public List<OrderVO> searchOrdr();
	public void addOrdr();
}
