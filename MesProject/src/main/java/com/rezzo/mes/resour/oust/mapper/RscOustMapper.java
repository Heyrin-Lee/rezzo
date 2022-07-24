package com.rezzo.mes.resour.oust.mapper;

import com.rezzo.mes.resour.oust.service.RscOustVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RscOustMapper {

    String getRscOustCd();
    void letHoldOust(RscOustVO rscOustVO);
}
