package com.rezzo.mes.resour.insp.web;

import com.rezzo.mes.resour.insp.mapper.InspMapper;
import com.rezzo.mes.resour.insp.vo.OrdrVO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class InspController {

    private final InspMapper mapper;

    @PostMapping(path = "/getOrderList")
    @ResponseBody
    public List<OrdrVO> getOrderList(@RequestBody Map<String,String> param) {
        String startDt = param.get("startDt");
        String endDt = param.get("endDt");
        return mapper.getOrdrList(startDt, endDt);
    }

    @RequestMapping("/rscInsp")
    public String rscInsp() {
        return "resour/rscInsp";
    }

}
