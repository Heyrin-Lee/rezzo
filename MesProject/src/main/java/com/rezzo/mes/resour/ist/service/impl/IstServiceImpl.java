package com.rezzo.mes.resour.ist.service.impl;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ist.mapper.RscIstMapper;
import com.rezzo.mes.resour.ist.service.RscIstService;
import com.rezzo.mes.resour.ist.service.RscIstVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IstServiceImpl implements RscIstService {

    private final RscIstMapper mapper;

    @Override
    @Transactional
    public void setRscIstLot(List<RscIstVO> rscIstVOS) {
        Date istDt = rscIstVOS.get(0).getIstDt(); // 입고날짜
        String rscIstCd = mapper.getRscIstCd(); // 입고코드
        for (RscIstVO rscIstVO : rscIstVOS) {
            String lotKey = mapper.getRscIstLotCd(rscIstVO);
            rscIstVO.setRscLotCd(lotKey); // lot key set
            rscIstVO.setRscIstCd(rscIstCd); // ist key set
            mapper.setRscIstLotEach(rscIstVO); // lot 입고 등록
        }
        mapper.setRscIst(rscIstCd, istDt);
    }

    @Override
    public List<RscIstVO> getRscIstHist(RscIstVO rscIstVO) {
        return mapper.getRscIstHist(rscIstVO);
    }

    @Override
    @Transactional
    public RscVO getRscSingle(RscVO rscVO) throws NullPointerException {
        return mapper.getRscSingle(rscVO);
    }

    @Override
    public List<RscIstVO> getRscIstHistList(RscIstVO rscIstVO) {
        return mapper.getRscIstHistList(rscIstVO);
    }

    @Override
    public List<RscIstVO> getRscIstHistMdfy(RscIstVO rscIstVO) {
        return mapper.getRscIstHistMdfy(rscIstVO);
    }

    @Override
    @Transactional
    public void updRscIstHist(List<RscIstVO> rscIstVOS) {
        for(RscIstVO rscIstVO : rscIstVOS) {
            mapper.updRscIstHist(rscIstVO);
        }
    }
}
