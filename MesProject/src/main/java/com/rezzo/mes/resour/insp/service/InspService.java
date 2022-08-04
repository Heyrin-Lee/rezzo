package com.rezzo.mes.resour.insp.service;

import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;

import java.util.List;

public interface InspService {

    // 입고검사 등록
    List<VendVO> getRscVendList(VendVO vendVO);
    List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO);
    void setRscInspList(List<RscInspVO> rscInspVOS);

    // 입고검사 수정
    List<RscInspVO> schRscInspHist(RscInspVO rscInspVO);
    List<RscInspVO> getRscInspHistByCd(RscInspVO rscInspVO);
    void updRscInspHist(List<RscInspVO> rscInspVOS);

    // 입고검사조회
    List<RscVO> getResources(RscVO rscVO);
    List<RscInspVO> getRscInspHist(RscInspVO rscInspVO);

    // 검사상세
    List<CcdsVO> getInfCdList();

    // 삭제
    void delRscInspHistSingle(List<RscInspVO> rscInspVOS);

    void delRscInspHistAll(RscInspVO rscInspVO);

}
