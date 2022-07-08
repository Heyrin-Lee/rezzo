package com.rezzo.mes.sales.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.order.mapper.OrderMapper;
import com.rezzo.mes.sales.order.service.OrderService;
import com.rezzo.mes.sales.order.service.OrderVO;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired OrderMapper mapper;

	@Override
	public List<OrderVO> searchOrdr(OrderVO vo) {
		return mapper.searchOrdr(vo);
	}


}
