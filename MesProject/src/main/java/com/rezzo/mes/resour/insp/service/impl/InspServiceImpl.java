package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InspServiceImpl implements InspService {

    private final InspMapper mapper;

    // 입고검사관리
    @Override
    public List<VendVO> getRscVendList(VendVO vendVO) {
        return mapper.getRscVendList(vendVO);
    }

    @Override
    public List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO) {
        return mapper.getRscOrdrList(rscOrdrVO);
    }

    @Override
    public void setRscInspList(List<RscInspVO> rscInspVOS) {
        String rscInspCd = mapper.genRscInspCd();
        for(RscInspVO rscInspVO : rscInspVOS) {
            rscInspVO.setRscInspCd(rscInspCd);
            mapper.setRscInspList(rscInspVO);
            mapper.updRscOrdrRmnCnt(rscInspVO);
        }
    }

    // 입고검사조회
    @Override
    public List<RscVO> getResource(RscVO rscVO) {
        return null;
    }
}
