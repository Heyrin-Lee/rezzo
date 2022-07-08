package com.rezzo.mes.resour.insp.web;

import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.vo.OrdrVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class InspController {

    InspService is;

    @RequestMapping("/getOrdrList")
    @ResponseBody
    public List<OrdrVO> getOrdrList() {
        return is.getOrdrList(null);
    }

    @RequestMapping("resour/rscInsp")
    public String rscInsp() {
        return "rscInsp";
    }

}
