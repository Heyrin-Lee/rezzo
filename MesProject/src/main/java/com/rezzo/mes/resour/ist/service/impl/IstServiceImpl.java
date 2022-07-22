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
    public void saveRscIstLot(List<RscIstVO> rscIstVOS) {
        for(RscIstVO rscIstVO : rscIstVOS) {
            String key = mapper.getRscIstCd(rscIstVO);
            rscIstVO.setLotCd(key); // lot key 발급
            mapper.saveRscIstLotEach(rscIstVO); // lot 입고 등록
            mapper.updRscInspBool(rscIstVO); // 입고검사마감
        }
    }

}
