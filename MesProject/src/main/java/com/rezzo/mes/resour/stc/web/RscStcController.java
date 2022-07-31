package com.rezzo.mes.resour.stc.web;

import com.rezzo.mes.resour.stc.service.RscIOVO;
import com.rezzo.mes.resour.stc.service.RscLotVO;
import com.rezzo.mes.resour.stc.service.RscStcService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class RscStcController {

    private final RscStcService rss;

    @RequestMapping("rscIOList")
    public String rscIOList() {
        return "resour/rscIOList";
    }

    @RequestMapping("rscStcList")
    public String rscStcList() {
        return "resour/rscStcList";
    }

    @RequestMapping("rscLotList")
    public String rscLotList() {
        return "resour/rscLotList";
    }

    @RequestMapping("rscInfList")
    public String rscInfList() {
        return "resour/rscInfLists";
    }

    @RequestMapping("getIOList")
    @ResponseBody
    public List<RscIOVO> getIOList(@ModelAttribute RscIOVO rscIOVO) {
        return rss.getIOList(rscIOVO);
    }

    @RequestMapping("getRscLotList")
    @ResponseBody
    public List<RscLotVO> getRscLotList(@ModelAttribute RscLotVO rscLotVO) {
        return rss.getRscLotList(rscLotVO);
    }
}
