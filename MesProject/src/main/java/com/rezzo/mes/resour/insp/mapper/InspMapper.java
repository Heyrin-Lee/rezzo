package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.resour.insp.vo.OrdrVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InspMapper {

    public List<OrdrVO> getOrdrList(@Param("startDt") String startDt, @Param("endDt") String endDt);

}
