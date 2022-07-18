package com.rezzo.mes.resour.insp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RordrVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InspServiceImpl implements InspService {

    private final InspMapper mapper;

    @Override
    public List<VendVO> getVendList(VendVO vendVO) {
        return mapper.getVendList(vendVO);
    }
    @Override
    public List<RordrVO> getOrdrList(RordrVO ordrVO) {
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
    public List<RscInspVO> getRscInspList(RordrVO ordrVO) {
        return mapper.getRscInspList(ordrVO);
    }
}
