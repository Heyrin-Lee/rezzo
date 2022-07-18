package com.rezzo.mes.comm.vend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.vend.mapper.VendMapper;
import com.rezzo.mes.comm.vend.service.VendService;
import com.rezzo.mes.comm.vend.service.VendVO;

@Service
public class VendServiceImpl implements VendService {
	
	@Autowired VendMapper mapper;

	@Override
	public List<VendVO> getVendList(VendVO vendVO) {
		return mapper.getVendList(vendVO);
	}

	@Override
	public void saveVend(VendVO vendVO) {
		mapper.saveVend(vendVO);
	}

	@Override
	public void delVend(VendVO vendVO) {
		mapper.delVend(vendVO);
	}

}
