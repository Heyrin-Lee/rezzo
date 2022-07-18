package com.rezzo.mes.resour.insp.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.comm.rsc.service.RscVO;
import com.rezzo.mes.comm.vend.service.VendVO;
import com.rezzo.mes.resour.insp.service.InspService;
import com.rezzo.mes.resour.insp.service.RscInspVO;
import com.rezzo.mes.resour.ordr.service.RordrVO;

import lombok.AllArgsConstructor;

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
        return "resour/rscInsp";
    }

    @RequestMapping("rscInspList")
    public String rscInspList() {
        return "resour/rscInspList";
    }

    @RequestMapping("VendList")
    @ResponseBody
    public List<VendVO> getVendList(@ModelAttribute VendVO vendVO) {
        return sv.getVendList(vendVO);
    }

    @RequestMapping("getOrdrList")
    @ResponseBody
    public List<RordrVO> getOrdrList(@RequestBody RordrVO ordrVO) {
        return sv.getOrdrList(ordrVO);
    }

    @RequestMapping("setRscInspList")
    @ResponseBody
    public void setRscInspList(@RequestBody List<RscInspVO> vo) {
        sv.insertInspList(vo);
    }

    @RequestMapping("RscList")
    @ResponseBody
    public List<RscVO> getRscList(RscVO rscVO) {
        return sv.getRscList(rscVO);
    }

    @RequestMapping("getRscInspList")
    @ResponseBody
    public List<RscInspVO> getRscInspList(@ModelAttribute RordrVO ordrVO) {
        return sv.getRscInspList(ordrVO);
    }

}
