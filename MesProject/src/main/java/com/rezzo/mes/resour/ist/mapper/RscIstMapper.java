package com.rezzo.mes.resour.ist.mapper;

import com.rezzo.mes.resour.ist.service.RscIstVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RscIstMapper {

    String getRscIstCd(); // 입고 코드 발급
    String getRscIstLotCd(RscIstVO rscIstVO); // lot key 발급
    void setRscIstLotEach(RscIstVO rscIstVO);
    void setRscIst(@Param("rscIstCd") String rscIstcd, @Param("istDt") String istDt);
    void updRscInspBool(RscIstVO rscIstVO); // 입고마감

    // 조회
    List<RscIstVO> getRscIstHist(RscIstVO rscIstVO);
}
