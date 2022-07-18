package com.rezzo.mes.resour.ordr.mapper;

import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RscOrdrMapper {

	List<RscOrdrVO> RscOrdrList(RscOrdrVO vo);
}
