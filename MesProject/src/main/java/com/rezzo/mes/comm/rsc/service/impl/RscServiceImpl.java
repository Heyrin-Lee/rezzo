package com.rezzo.mes.comm.rsc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.rsc.mapper.RscMapper;
import com.rezzo.mes.comm.rsc.service.RscService;
import com.rezzo.mes.comm.rsc.service.RscVO;

@Service
public class RscServiceImpl implements RscService {
	
	@Autowired RscMapper mapper;

	@Override
	public List<RscVO> getRscList(int state, String Keyword) {
		return mapper.getRscList(state, Keyword);
	}

	@Override
	public void saveRsc(RscVO rscVO) {
		mapper.saveRsc(rscVO);
	}

	@Override
	public void delRsc(RscVO rscVO) {
		mapper.delRsc(rscVO);
	}

}
