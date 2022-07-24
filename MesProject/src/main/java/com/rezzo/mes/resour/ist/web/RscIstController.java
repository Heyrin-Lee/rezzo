package com.rezzo.mes.resour.ist.web;

import com.rezzo.mes.resour.ist.service.RscIstService;
import com.rezzo.mes.resour.ist.service.RscIstVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class RscIstController {

    private final RscIstService ris;

    @RequestMapping("rscIst")
    public String rscIst() {
        return "resour/rscIst";
    }

    @RequestMapping("rscIstList")
    public String rscIstList() {
        return "resour/rscIstList";
    }

    @RequestMapping("setRscIstLot")
    @ResponseBody
    public void setRscIstLot(@RequestBody List<RscIstVO> rscIstVOS) {
        ris.setRscIstLot(rscIstVOS);
    }

    @RequestMapping("getRscIstHist")
    @ResponseBody
    public List<RscIstVO> getRscIstHist(@ModelAttribute RscIstVO rscIstVO) {
        return ris.getRscIstHist(rscIstVO);
    }
}
