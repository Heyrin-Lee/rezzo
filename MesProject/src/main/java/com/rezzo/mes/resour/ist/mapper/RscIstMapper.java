package com.rezzo.mes.resour.ist.mapper;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.resour.ist.service.RscIstVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface RscIstMapper {

    String getRscIstCd(); // 입고 코드 발급
    String getRscIstLotCd(RscIstVO rscIstVO); // lot key 발급
    void setRscIstLotEach(RscIstVO rscIstVO);
    void setRscIst(RscIstVO rscIst);

    // grid search
    RscVO getRscSingle(RscVO rscVO);

    // 조회
    List<RscIstVO> getRscIstHist(RscIstVO rscIstVO);

    // 수정
    List<RscIstVO> getRscIstHistList(RscIstVO rscIstVO);
    List<RscIstVO> getRscIstHistMdfy(RscIstVO rscIstVO);
    void updRscIstHist(RscIstVO rscIstVO);
}
