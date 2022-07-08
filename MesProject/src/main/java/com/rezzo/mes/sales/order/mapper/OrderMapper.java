package com.rezzo.mes.sales.order.mapper;

import java.util.List;

import com.rezzo.mes.sales.order.service.OrderVO;

public interface OrderMapper {
	
	public List<OrderVO> searchOrdr(OrderVO vo);
}
