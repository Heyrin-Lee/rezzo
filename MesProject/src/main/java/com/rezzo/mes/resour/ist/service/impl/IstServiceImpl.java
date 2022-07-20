package com.rezzo.mes.resour.ist.service.impl;

import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ist.mapper.RscIstMapper;
import com.rezzo.mes.resour.ist.service.RscIstService;
import com.rezzo.mes.resour.ist.service.RscIstVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IstServiceImpl implements RscIstService {

    private final RscIstMapper mapper;

    @Override
    public void saveRscIst(List<RscIstVO> rscIstVOS) {
        for(RscIstVO rscIstVO : rscIstVOS) {
            String rscIstCd = mapper.getRscIstCd(rscIstVO);
            rscIstVO.setIstCd(rscIstCd);
            mapper.saveRscIst(rscIstVO);
        }
    }
}
