package com.rezzo.mes.resour.insp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RordrVO;

@Mapper
public interface InspMapper {

    List<VendVO> getVendList(VendVO vendVO);
    List<RordrVO> getOrdrList(RordrVO ordrVO);
    void insertInspList(List<RscInspVO> rscInspVOS); // test
    List<RscVO> getRscList(RscVO rscVO);
    List<RscInspVO> getRscInspList(RordrVO ordrVO);
}
