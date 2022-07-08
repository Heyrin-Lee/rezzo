package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.resour.insp.vo.OrdrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspMapper {

    public List<OrdrVO> getOrdrList(OrdrVO ordrVO);

}
