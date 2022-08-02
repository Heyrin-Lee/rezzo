package com.rezzo.mes.qc.insp.web;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.qc.insp.service.PrdtInspService;
import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.order.service.OrderVO;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Controller
public class PrdtInspController {
	
	@Autowired PrdtInspService service;
	@Autowired DataSource dataSource;

	
	@RequestMapping("prdtInsp")
	public String prdtInsp(Model model) {
		model.addAttribute("lots", service.getPrdtInsp(null));
		return "qc/prdtInsp";
	}
	
	@RequestMapping("getInspCode")
	@ResponseBody
	public List<PrdtInspVO> getInspCode() {
		return service.getInspCode();
	}

	@RequestMapping("prdtInspOrder")
	@ResponseBody
	public List<OrderVO> prdtInspOrder() {
		return service.prdtInspOrder();
	}
	
	@RequestMapping("delPrdtInsp")
	public void delPrdtInsp(PrdtInspVO prdtInspVO) {
		service.delPrdtInsp(prdtInspVO);
	}
	
	@RequestMapping("savePrdtInsp")
	public void savePrdtInsp(@RequestBody List<PrdtInspVO> prdtInspList) {
		service.savePrdtInsp(prdtInspList);
	}
	
	@RequestMapping("getPrdtInsp")
	@ResponseBody
	public List<PrdtInspVO> getPrdtInsp(PrdtInspVO prdtInspVO) {
		return service.getPrdtInsp(prdtInspVO);
	}
	
	@RequestMapping(path="report", produces = {MediaType.APPLICATION_PDF_VALUE})	
	public void report(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		Connection conn = dataSource.getConnection();
		InputStream stream = getClass().getResourceAsStream("/jasper/reports/prdtReport.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(stream);
		//파라미터 맵
		//HashMap<String,Object> map = new HashMap<>();
		//map.put("p_departmentId", request.getParameter("dept"));
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
		JasperExportManager.exportReportToPdfStream( jasperPrint, response.getOutputStream());

	}

}
