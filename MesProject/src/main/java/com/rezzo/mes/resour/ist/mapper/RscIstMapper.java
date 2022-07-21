package com.rezzo.mes.resour.ist.mapper;

import com.rezzo.mes.resour.ist.service.RscIstVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RscIstMapper {

    String getRscIstCd(RscIstVO rscIstVO);
    void saveRscIstLot(List<RscIstVO> rscIstVO);
    void saveRscIstLotEach(RscIstVO rscIstVO);
    void updRscInspBool(RscIstVO rscIstVO); // 입고마감
}
