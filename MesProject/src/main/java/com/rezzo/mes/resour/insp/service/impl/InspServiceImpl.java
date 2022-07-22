package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class InspServiceImpl implements InspService {

    private final InspMapper mapper;

    // 입고검사등록
    @Override
    public List<VendVO> getRscVendList(VendVO vendVO) {
        return mapper.getRscVendList(vendVO);
    }

    @Override
    public List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO) {
        return mapper.getRscOrdrList(rscOrdrVO);
    }

    @Override
    @Transactional
    public void setRscInspList(List<RscInspVO> rscInspVOS) {
        // rsc_ordr insert
        String rscInspCd = mapper.genRscInspCd();
        String inspDt = rscInspVOS.get(0).getInspDt();
        String inspTstr = rscInspVOS.get(0).getInspTstr();
        mapper.setRscInsp(rscInspCd, inspDt, inspTstr);

        // rsc_ordr_dtl insert
        for(RscInspVO rscInspVO : rscInspVOS) {
            rscInspVO.setRscInspCd(rscInspCd);
            mapper.setRscInspList(rscInspVO);
            mapper.updRscOrdrRmnCnt(rscInspVO);
        }
    }

    // 입고검사 수정
    @Override
    public List<RscInspVO> schRscInspHist(RscInspVO rscInspVO) {
        return mapper.schRscInspHist(rscInspVO);
    }

    @Override
    public List<RscInspVO> getRscInspHistByCd(RscInspVO rscInspVO) {
        return mapper.getRscInspHistByCd(rscInspVO);
    }

    @Override
    @Transactional
    public void updRscInspHist(List<RscInspVO> rscInspVOS) {
        for (RscInspVO rscInspVO : rscInspVOS) {
            mapper.updRscInspHist(rscInspVO);
        }
    }

    // 입고검사조회
    @Override
    public List<RscVO> getResources(RscVO rscVO) {
        return mapper.getResources(rscVO);
    }

    @Override
    public List<RscInspVO> getRscInspHist(RscInspVO rscInspVO) {
        return mapper.getRscInspHist(rscInspVO);
    }
}
