package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.web.vo.OrdrVO;
import com.rezzo.mes.resour.insp.web.vo.RscInspVO;
import com.rezzo.mes.resour.insp.web.vo.RscVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InspServiceImpl implements InspService {

    private final InspMapper mapper;

    @Override
    public List<VendVO> getVendList(VendVO vendVO) {
        return mapper.getVendList(vendVO);
    }
    @Override
    public List<OrdrVO> getOrdrList(OrdrVO ordrVO) {
        return mapper.getOrdrList(ordrVO);
    }
    @Override
    public void insertInspList(List<RscInspVO> rscInspVOS) {
        mapper.insertInspList(rscInspVOS);
    }
    @Override
    public List<RscVO> getRscList(RscVO rscVO) {
        return mapper.getRscList(rscVO);
    }
    @Override
    public List<RscInspVO> getRscInspList(OrdrVO ordrVO) {
        return mapper.getRscInspList(ordrVO);
    }
}
