package com.rezzo.mes.resour.ist.mapper;

import com.rezzo.mes.resour.ist.service.RscIstVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RscIstMapper {

    void saveRscIst(RscIstVO rscIstVO);
    String getRscIstCd(RscIstVO rscIstVO);

}
