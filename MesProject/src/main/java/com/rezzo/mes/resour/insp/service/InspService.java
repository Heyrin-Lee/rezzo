package com.rezzo.mes.resour.insp.service;

import java.util.List;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.ordr.service.RordrVO;

public interface InspService {

    List<VendVO> getVendList(VendVO vendVO);
    List<RordrVO> getOrdrList(RordrVO ordrVO);
    void insertInspList(List<RscInspVO> rscInspVOS); // test
    List<RscVO> getRscList(RscVO rscVO);
    List<RscInspVO> getRscInspList(RordrVO ordrVO);
}
