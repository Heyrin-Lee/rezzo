package com.rezzo.mes.resour.insp.service;

import com.rezzo.mes.resour.insp.vo.OrdrVO;
import com.rezzo.mes.resour.insp.vo.VendVO;

import java.util.List;

public interface InspService {

    List<VendVO> getVendList();
    List<VendVO> getVendListByKw(VendVO vendVO);
    List<OrdrVO> getOrdrList(OrdrVO ordrVO);

}
