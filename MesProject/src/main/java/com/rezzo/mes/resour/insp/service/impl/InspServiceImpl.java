package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInfVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import lombok.AllArgsConstructor;
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
        // rsc_insp insert
        String rscInspCd = mapper.genRscInspCd();
        Date inspDt = rscInspVOS.get(0).getInspDt();
        String inspTstr = rscInspVOS.get(0).getInspTstr();
        mapper.setRscInsp(rscInspCd, inspDt, inspTstr);

        // rsc_insp_dtl insert
        for (RscInspVO rscInspVO : rscInspVOS) {

            // when ordrCd doesn't exist -> gen cd and set cd
            if (rscInspVO.getOrdrCd() == null) {
                String noOrdrCd = mapper.genRscNoOrdrCd();
                rscInspVO.setOrdrCd(noOrdrCd);
            }

            // set rsc insp dtl each
            rscInspVO.setRscInspCd(rscInspCd);
            mapper.setRscInspList(rscInspVO);
            mapper.updRscOrdrRmnCnt(rscInspVO);

            // set rsc inf list each
            for (RscInfVO rscInfVO : rscInspVO.getRscInfList()) {
                mapper.setRscInfList(rscInspVO, rscInfVO);
            }
        }
    }

    // 입고검사 수정
    @Override
    public List<RscInspVO> schRscInspHist(RscInspVO rscInspVO) {
        return mapper.schRscInspHist(rscInspVO);
    }

    @Override
    public List<RscInspVO> getRscInspHistByCd(RscInspVO rscInspVO) {
        List<RscInspVO> rscInspVOS = mapper.getRscInspHistByCd(rscInspVO);
        for(RscInspVO vo : rscInspVOS) {
            List<RscInfVO> rscInfVOS = mapper.getRscInfHistByCd(vo);
            vo.setRscInfList(rscInfVOS);
        }
        rscInspVOS.add(0, mapper.getRscInspInfoByCd(rscInspVO));
        return rscInspVOS;
    }

    @Override
    @Transactional
    public void updRscInspHist(List<RscInspVO> rscInspVOS) {
        for (RscInspVO rscInspVO : rscInspVOS) {
            // update insp, insp-dtl
            mapper.updRscInspHist(rscInspVO);

            // update inf
            for(RscInfVO rscInfVO : rscInspVO.getRscInfList()) {
                mapper.setRscInfList(rscInspVO, rscInfVO);
            }
        }
    }

    @Override
    public List<RscVO> getResources(RscVO rscVO) {
        return mapper.getResources(rscVO);
    }

    @Override
    public List<RscInspVO> getRscInspHist(RscInspVO rscInspVO) {
        return mapper.getRscInspHist(rscInspVO);
    }


    // 검사상세
    @Override
    public List<CcdsVO> getInfCdList() {
        return mapper.getInfCdList();
    }

    // 삭제
    @Override
    @Transactional
    public void delRscInspHistSingle(List<RscInspVO> rscInspVOS) {
        for (RscInspVO vo : rscInspVOS) {
            mapper.delRscInspHistSingle(vo);
        }
    }

    @Override
    @Transactional
    public void delRscInspHistAll(List<RscInspVO> rscInspVOS) {
        for (RscInspVO vo : rscInspVOS) {
            mapper.delRscInspHistSingle(vo);
        }
        mapper.delRscInspHist(rscInspVOS.get(0));
    }

}