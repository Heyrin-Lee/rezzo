package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.RscInfVO;
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
    void setRscInsp(@Param("rscInspCd") String rscInspCd, @Param("inspDt") String inspDt, @Param("inspTstr") String inspTstr);
    void setRscInspList(RscInspVO rscInspVOS);
    void updRscOrdrRmnCnt(RscInspVO rscInspVO);
    String genRscInspCd();
    String genRscNoOrdrCd();

    // 입고검사수정
    List<RscInspVO> schRscInspHist(RscInspVO rscInspVO);

    List<RscInspVO> getRscInspHistByCd(RscInspVO rscInspVO);

    List<RscInfVO> getRscInfHistByCd(RscInspVO rscInspVO);

    void updRscInspHist(RscInspVO rscInspVO);
    RscInspVO getRscInspInfoByCd(RscInspVO rscInspVO); // 입고정보

    // 입고검사조회
    List<RscVO> getResources(RscVO rscVO);
    List<RscInspVO> getRscInspHist(RscInspVO rscInspVO);

    // 검사상세
    List<CcdsVO> getInfCdList();
    void setRscInfList(@Param("insp") RscInspVO rscInspVO, @Param("inf")RscInfVO rscInfVO);

}
