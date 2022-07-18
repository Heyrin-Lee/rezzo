package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InspServiceImpl implements InspService {

    private final InspMapper mapper;

    @Override
    public List<VendVO> getVendors(VendVO vendVO) {
        return mapper.getVendors(vendVO);
    }
    @Override
    public List<RscVO> getResources(RscVO rscVO) {
        return mapper.getResources(rscVO);
    }
    @Override
    public List<RscOrdrVO> getRscOrdrList(RscOrdrVO rscOrdrVO) {
        return mapper.getRscOrdrList(rscOrdrVO);
    }

    // get, set inspection list
    @Override
    public void setRscInspList(List<RscInspVO> rscInspVOS) {
        mapper.setRscInspList(rscInspVOS);
    }
    @Override
    public List<RscInspVO> getRscInspList(RscOrdrVO rscOrdrVO) {
        return mapper.getRscInspList(rscOrdrVO);
    }
}
