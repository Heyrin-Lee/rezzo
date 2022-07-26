package com.rezzo.mes.resour.ist.service;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;

import java.util.List;

public interface RscIstService {

    void setRscIstLot(List<RscIstVO> rscIstVO);
    List<RscIstVO> getRscIstHist(RscIstVO rscIstVO);
    RscVO getRscSingle(RscVO rscVO);

    // 수정
    List<RscIstVO> getRscIstHistList(RscIstVO rscIstVO); // in modal
    List<RscIstVO> getRscIstHistMdfy(RscIstVO rscIstVO); // in main grid
}
