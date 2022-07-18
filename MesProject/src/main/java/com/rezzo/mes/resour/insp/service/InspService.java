package com.rezzo.mes.resour.insp.service;

import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.web.vo.OrdrVO;
import com.rezzo.mes.resour.insp.web.vo.RscInspVO;
import com.rezzo.mes.resour.insp.web.vo.RscVO;

import java.util.List;

public interface InspService {

    List<VendVO> getVendList(VendVO vendVO);
    List<OrdrVO> getOrdrList(OrdrVO ordrVO);
    void insertInspList(List<RscInspVO> rscInspVOS); // test
    List<RscVO> getRscList(RscVO rscVO);
    List<RscInspVO> getRscInspList(OrdrVO ordrVO);
}
