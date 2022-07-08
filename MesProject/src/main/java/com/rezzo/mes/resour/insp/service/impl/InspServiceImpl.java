package com.rezzo.mes.resour.insp.service.impl;

import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.vo.OrdrVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspServiceImpl implements InspService {

    InspMapper mapper;

    @Override
    public List<OrdrVO> getOrdrList(OrdrVO ordrVO) {
        return mapper.getOrdrList(null);
    }
}
