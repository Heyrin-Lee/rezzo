package com.rezzo.mes.resour.ist.web;

import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ist.service.RscIstService;
import com.rezzo.mes.resour.ist.service.RscIstVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class IstController {

    private final RscIstService ris;

    @RequestMapping("rscIst")
    public String rscIst() {
        return "resour/rscIst";
    }

    @RequestMapping("saveRscIstLot")
    @ResponseBody
    public void saveRscIstLot(@RequestBody List<RscIstVO> rscIstVOS) {
        System.out.println("rscIstVOS = " + rscIstVOS);
        ris.saveRscIstLot(rscIstVOS);
    }
}
