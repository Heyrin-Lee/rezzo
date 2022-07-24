package com.rezzo.mes.resour.oust.service.impl;

import com.rezzo.mes.resour.oust.mapper.RscOustMapper;
import com.rezzo.mes.resour.oust.service.RscOustService;
import com.rezzo.mes.resour.oust.service.RscOustVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class RscOustServiceImpl implements RscOustService {

    private final RscOustMapper mapper;

    @Override
    @Transactional
    public void letHoldOust(List<RscOustVO> rscOustVOS) {
        String oustCd = mapper.getRscOustCd();
        for(RscOustVO rscOustVO : rscOustVOS) {
            rscOustVO.setRscOustCd(oustCd);
            mapper.letHoldOust(rscOustVO);
        }
    }
}
