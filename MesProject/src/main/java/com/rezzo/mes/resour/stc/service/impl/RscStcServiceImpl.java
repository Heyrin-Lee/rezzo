package com.rezzo.mes.resour.stc.service.impl;

import com.rezzo.mes.resour.stc.mapper.RscStcMapper;
import com.rezzo.mes.resour.stc.service.RscIOVO;
import com.rezzo.mes.resour.stc.service.RscLotVO;
import com.rezzo.mes.resour.stc.service.RscStcService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RscStcServiceImpl implements RscStcService{

    private final RscStcMapper mapper;

    // 입출고조회
    @Override
    public List<RscIOVO> getIOList(RscIOVO rscIOVO) {
        return mapper.getIOList(rscIOVO);
    }

    @Override
    public List<RscLotVO> getRscLotList(RscLotVO rscLotVO) {
        return mapper.getRscLotList(rscLotVO);
    }
}
