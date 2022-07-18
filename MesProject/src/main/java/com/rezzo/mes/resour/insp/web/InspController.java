package com.rezzo.mes.resour.insp.web;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
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

    // direct to page
    @RequestMapping("rscInsp")
    public String rscInsp() {
        return "resour/rscInsp";
    }
    @RequestMapping("rscInspList")
    public String rscInspList() {
        return "resour/rscInspList";
    }

    // search conditions
    @RequestMapping("getVendors")
    @ResponseBody
    public List<VendVO> getVendors(@ModelAttribute VendVO vendVO) {
        return sv.getVendors(vendVO);
    }
    @RequestMapping("getResources")
    @ResponseBody
    public List<RscVO> getResources(RscVO rscVO) {
        return sv.getResources(rscVO);
    }
    @RequestMapping("getRscInfList")
    @ResponseBody
    public Map<String, List<CcdsVO>> getRscInfList() {
        return cdsv.getCodes("INF");
    }

    // get rsc order list
    @RequestMapping("getRscOrdrList")
    @ResponseBody
    public List<RscOrdrVO> getRscOrdrList(@RequestBody RscOrdrVO rscOrdrVO) {
        return sv.getRscOrdrList(rscOrdrVO);
    }

    // set inspection list
    @RequestMapping("setRscInspList")
    @ResponseBody
    public void setRscInspList(@RequestBody List<RscInspVO> vo) {
        sv.setRscInspList(vo);
    }

    // get inspection list
    @RequestMapping("getRscInspList")
    @ResponseBody
    public List<RscInspVO> getRscInspList(@ModelAttribute RscOrdrVO rscOrdrVO) {
        return sv.getRscInspList(rscOrdrVO);
    }

}
