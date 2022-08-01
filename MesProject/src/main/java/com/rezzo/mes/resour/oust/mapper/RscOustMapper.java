package com.rezzo.mes.resour.oust.mapper;

import com.rezzo.mes.resour.oust.service.RscOustVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RscOustMapper {

    String getRscOustCd();
    List<RscOustVO> getLotByRscCd(RscOustVO rscOustVO);

    // 입력
    void setRscOust(RscOustVO rscOustVOS);
    void setRscOustEach(RscOustVO rscOustVO);
    void letHoldOust(RscOustVO rscOustVO);
    List<RscOustVO> schRscOustHist(RscOustVO rscOustVO);

    //수정
    List<RscOustVO> getRscOustHist(RscOustVO rscOustVO);
    void updRscOustHist(RscOustVO rscOustVO);

    // 조회
    List<RscOustVO> getRscOustList(RscOustVO rscOustVO);
}
