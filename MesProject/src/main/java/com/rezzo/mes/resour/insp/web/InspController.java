package com.rezzo.mes.resour.insp.web;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.vo.OrdrVO;
import com.rezzo.mes.resour.insp.vo.VendVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
public class InspController {

    private final InspService sv;

    private final CcdsService cdsv;

    @RequestMapping("getInfList")
    @ResponseBody
    public Map<String, List<CcdsVO>> getInfList() {
        return cdsv.getCodes("INF");
    }

    @RequestMapping("rscInsp")
    public String rscInsp() {
        return "resour/insp/rscInsp";
    }

    @RequestMapping("getVendList")
    @ResponseBody
    public List<VendVO> getVendList() {
        return sv.getVendList();
    }

    @RequestMapping("getVendListByKw")
    @ResponseBody
    public List<VendVO> getVendListByKw(@ModelAttribute VendVO vendVO) {
        return sv.getVendListByKw(vendVO);
    }

    @RequestMapping("getOrdrList")
    @ResponseBody
    public List<OrdrVO> getOrdrList(@RequestBody OrdrVO ordrVO) {
        return sv.getOrdrList(ordrVO);
    }

}
