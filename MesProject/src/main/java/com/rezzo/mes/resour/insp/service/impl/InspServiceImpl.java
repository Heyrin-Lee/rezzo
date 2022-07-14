package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.vo.OrdrVO;
import com.rezzo.mes.resour.insp.vo.RscInfVO;
import com.rezzo.mes.resour.insp.vo.RscInspVO;
import com.rezzo.mes.resour.insp.vo.VendVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InspServiceImpl implements InspService {

    private final InspMapper mapper;

    @Override
    public List<VendVO> getVendList() {
        return mapper.getVendList();
    }
    @Override
    public List<VendVO> getVendListByKw(VendVO vendVO) {
        return mapper.getVendListByKw(vendVO);
    }
    @Override
    public List<OrdrVO> getOrdrList(OrdrVO ordrVO) {
        return mapper.getOrdrList(ordrVO);
    }

    @Override
    public void insertInspList(RscInspVO rscInspVO, List<RscInfVO> rscInfVOS) {
        mapper.insertInspList(rscInspVO, rscInfVOS);
    }


}
