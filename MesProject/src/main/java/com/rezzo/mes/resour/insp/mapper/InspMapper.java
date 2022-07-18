package com.rezzo.mes.resour.insp.mapper;

import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.web.vo.OrdrVO;
import com.rezzo.mes.resour.insp.web.vo.RscInspVO;
import com.rezzo.mes.resour.insp.web.vo.RscVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspMapper {

    List<VendVO> getVendList(VendVO vendVO);
    List<OrdrVO> getOrdrList(OrdrVO ordrVO);
    void insertInspList(List<RscInspVO> rscInspVOS); // test
    List<RscVO> getRscList(RscVO rscVO);
    List<RscInspVO> getRscInspList(OrdrVO ordrVO);
}
