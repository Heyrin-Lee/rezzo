package com.rezzo.mes.resour.stc.mapper;

import com.rezzo.mes.resour.stc.service.RscIOVO;
import com.rezzo.mes.resour.stc.service.RscLotVO;
import com.rezzo.mes.resour.stc.service.RscStcVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RscStcMapper {

    // 입출고조회
    List<RscIOVO> getIOList(RscIOVO rscIOVO);

    // Lot 재고조회
    List<RscLotVO> getRscLotList(RscLotVO rscLotVO);

    // 자재별 재고조회
    List<RscStcVO> getRscStcList(RscStcVO rscStcVO);

    // 월마감 스케줄러
    void stcStack();
}
