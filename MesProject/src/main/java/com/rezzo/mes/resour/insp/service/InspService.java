package com.rezzo.mes.resour.insp.service;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;

import java.util.List;

public interface InspService {

    List<VendVO> getVendors(VendVO vendVO);
    List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO);
    void setRscInspList(List<RscInspVO> rscInspVOS); // test
    List<RscVO> getResources(RscVO rscVO);
    List<RscInspVO> getRscInspList(RscOrdrVO rscOrdrVO);
}
