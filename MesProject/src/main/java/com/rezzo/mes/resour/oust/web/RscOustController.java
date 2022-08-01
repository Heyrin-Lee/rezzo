package com.rezzo.mes.resour.oust.web;

import com.rezzo.mes.resour.oust.service.RscOustService;
import com.rezzo.mes.resour.oust.service.RscOustVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class RscOustController {

    private final RscOustService sv;

    @RequestMapping("rscOust")
    public String rscOus() {
        return "resour/rscOust";
    }

    @RequestMapping("rscOustList")
    public String rscOustList() {
        return "resour/rscOustList";
    }

    @RequestMapping("getLotByRscCd")
    @ResponseBody
    public List<RscOustVO> getLotByRscCd(@RequestBody RscOustVO rscOustVO) {
        return sv.getLotByRscCd(rscOustVO);
    }

    @RequestMapping("setRscOust")
    @ResponseBody
    public void setRscOust(@RequestBody List<RscOustVO> rscOustVOS) {
    	System.out.println(rscOustVOS);
        sv.setRscOust(rscOustVOS);
    }

    @RequestMapping("schRscOustHist")
    @ResponseBody

    public List<RscOustVO> schRscOustHist(@ModelAttribute RscOustVO rscOustVO) {
        return sv.schRscOustHist(rscOustVO);
    }

    @RequestMapping("getRscOustHist")
    @ResponseBody
    public List<RscOustVO> getRscOustHist(@RequestBody RscOustVO rscOustVO) {
        return sv.getRscOustHist(rscOustVO);
    }

    @RequestMapping("updRscOustHist")
    @ResponseBody
    public void updRscOustHist(@RequestBody List<RscOustVO> rscOustVOS) {
        sv.updRscOustHist(rscOustVOS);
    }

    @RequestMapping("getRscOustList")
    @ResponseBody
    public List<RscOustVO> getRscOustList(@ModelAttribute RscOustVO rscOustVO) {
        return sv.getRscOustList(rscOustVO);
    }
}