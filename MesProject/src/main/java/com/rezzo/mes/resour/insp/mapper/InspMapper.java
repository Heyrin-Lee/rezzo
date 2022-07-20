package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspMapper {

    // 입고검사관리
    List<VendVO> getRscVendList(VendVO vendVO);
    List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO);
    void setRscInspList(RscInspVO rscInspVOS);
    void updRscOrdrRmnCnt(RscInspVO rscInspVO);
    String genRscInspCd();

    // 입고검사조회
    List<RscVO> getResource(RscVO rscVO);

}
