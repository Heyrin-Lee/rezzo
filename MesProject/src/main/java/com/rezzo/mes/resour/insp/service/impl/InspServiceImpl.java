package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInfVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class InspServiceImpl implements InspService {

    private final InspMapper mapper;

    @Override
    public List<VendVO> getVendors(VendVO vendVO) {
        return mapper.getVendors(vendVO);
    }

    @Override
    public List<RscVO> getResources(RscVO rscVO) {
        return mapper.getResources(rscVO);
    }

    @Override
    public List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO) {
        return mapper.getRscOrdrList(rscOrdrVO);
    }

    // get, set inspection list
    @Override
    public void setRscInspList(List<RscInspVO> rscInspVOS) {
        String rscInspCd = mapper.getRscInspCd();
        Date inspDt = new Date();

        for (RscInspVO rscInspVO : rscInspVOS) {
            inspDt = rscInspVO.getInspDt();
            rscInspVO.setRscInspCd(rscInspCd);
            mapper.setRscOrdrInspBool(rscInspVO);
            mapper.setRscInspDtList(rscInspVO);

            if (rscInspVO.getInspFailCnt() > 0) {
                for (RscInfVO rscInfVO : rscInspVO.getRscInf()) {
                    rscInfVO.setRscInspCd(rscInspCd);
                    rscInfVO.setRscCd(rscInspVO.getRscCd());
                    rscInfVO.setOrdrCd(rscInspVO.getOrdrCd());
                    mapper.setRscInfList(rscInfVO);
                }
            }
        }
        RscInspVO vo = new RscInspVO();
        vo.setRscInspCd(rscInspCd);
        vo.setInspDt(inspDt);
        mapper.setRscInspList(vo);
    }

    @Override
    public List<RscInspVO> getRscInspList(RscOrdrVO rscOrdrVO) {
        return mapper.getRscInspList(rscOrdrVO);
    }

    @Override
    public List<RscInspVO> getRscInspListByDt(RscOrdrVO rscOrdrVO) {
        return mapper.getRscInspListByDt(rscOrdrVO);
    }
    @Override
    public List<RscInspVO> getRscInspHist(RscInspVO rscInspVO) {
        return mapper.getRscInspHist(rscInspVO);
    }

    @Override
    public List<RscInfVO> getRscInfHist(RscInspVO rscInspVO) {
        return mapper.getRscInfHist(rscInspVO);
    }


}
