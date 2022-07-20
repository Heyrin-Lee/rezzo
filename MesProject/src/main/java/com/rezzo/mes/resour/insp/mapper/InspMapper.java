package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.RscInfVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspMapper {

    List<VendVO> getVendors(VendVO vendVO);
    List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO);
    List<RscVO> getResources(RscVO rscVO);

    // 조회
    List<RscInspVO> getRscInspList(RscOrdrVO rscOrdrVO);

    // inspection list insert block
    String getRscInspCd();
    void setRscOrdrInspBool(RscInspVO rscInspVO);
    void setRscInspList(RscInspVO rscInspVO);
    void setRscInspDtList(RscInspVO rscInspVO);
    void setRscInfList(RscInfVO rscInfVO);

    // 수정
    List<RscInspVO> getRscInspListByDt(RscOrdrVO rscOrdrVO);
    List<RscInspVO> getRscInspHist(RscInspVO rscInspVO);
    List<RscInfVO> getRscInfHist(RscInspVO rscInspVO);
}
