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
    public List<RscOustVO> getLotByRscCd(RscOustVO rscOustVO) {
        return mapper.getLotByRscCd(rscOustVO);
    }

    @Override
    @Transactional
    public void setRscOust(List<RscOustVO> rscOustVOS) {
        String rscOustCd = mapper.getRscOustCd();
        RscOustVO setOust = rscOustVOS.get(0);
        setOust.setRscOustCd(rscOustCd);
        rscOustVOS.remove(0);

        System.out.println("setOust = " + rscOustVOS);

        if (setOust.getFrom().equals("prod")) {
            mapper.letHoldingAway(setOust);
            for (RscOustVO rscOustVO : rscOustVOS) {
                rscOustVO.setRscOustCd(rscOustCd);
                mapper.letHoldOust(rscOustVO);
            }
        } else {
            for (RscOustVO rscOustVO : rscOustVOS) {
                rscOustVO.setRscOustCd(rscOustCd);
                mapper.setRscOustEach(rscOustVO);
            }
        }
        mapper.setRscOust(setOust);
    }

    @Override
    public List<RscOustVO> schRscOustHist(RscOustVO rscOustVO) {
        return mapper.schRscOustHist(rscOustVO);
    }

    @Override
    public List<RscOustVO> getRscOustHist(RscOustVO rscOustVO) {
        return mapper.getRscOustHist(rscOustVO);
    }

    @Override
    public void updRscOustHist(List<RscOustVO> rscOustVOS) {
        for (RscOustVO rscOustVO : rscOustVOS) {
            mapper.updRscOustHist(rscOustVO);
        }
    }

    @Override
    public List<RscOustVO> getRscOustList(RscOustVO rscOustVO) {
        return mapper.getRscOustList(rscOustVO);
    }
}
