package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InspMapper {

    // 입고검사등록
    List<VendVO> getRscVendList(VendVO vendVO);
    List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO);
    void setRscInsp(@Param("rscInspCd") String val1, @Param("inspDt") String val2);
    void setRscInspList(RscInspVO rscInspVOS);
    void updRscOrdrRmnCnt(RscInspVO rscInspVO);
    String genRscInspCd();

    // 입고검사수정
    List<RscInspVO> schRscInspHist(RscInspVO rscInspVO);

    List<RscInspVO> getRscInspHistByCd(RscInspVO rscInspVO);

    void updRscInspHist(RscInspVO rscInspVO);

    // 입고검사조회
    List<RscVO> getResources(RscVO rscVO);
    List<RscInspVO> getRscInspHist(RscInspVO rscInspVO);

}
