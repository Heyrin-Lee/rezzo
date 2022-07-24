package com.rezzo.mes.resour.oust.web;

import com.rezzo.mes.resour.oust.service.RscOustService;
import com.rezzo.mes.resour.oust.service.RscOustVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("letHoldOust")
    @ResponseBody
    public void letHoldOust(@RequestBody List<RscOustVO> rscOustVOS) {
        sv.letHoldOust(rscOustVOS);
    }

}
