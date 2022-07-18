package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspMapper {

    List<VendVO> getVendors(VendVO vendVO);
    List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO);
    void setRscInspList(List<RscInspVO> rscInspVOS); // test
    List<RscVO> getResources(RscVO rscVO);
    List<RscInspVO> getRscInspList(RscOrdrVO rscOrdrVO);
}
