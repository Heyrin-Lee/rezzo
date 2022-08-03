package com.rezzo.mes.resour.search.web;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.resour.search.service.OrdrSearchService;
import com.rezzo.mes.resour.search.service.OrdrSearchVO;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Controller
public class OrdrSearchController {
	
	@Autowired
	OrdrSearchService service;
	
	@Autowired 
	DataSource dataSource;
	
	@RequestMapping("rscOrdrSearch")
	public String resourOrdrSearch() {
		return "resour/rscOrdrSearch";
	}
	
	@GetMapping("ordrSearchList")
	@ResponseBody
	public List<OrdrSearchVO> ordrSearchList(OrdrSearchVO vo) {
		List<OrdrSearchVO> ordrSearchList = service.ordrSearchList(vo);
		return ordrSearchList;
	}
	
	@PostMapping("ordrSearchOneList")
	@ResponseBody
	List<OrdrSearchVO> ordrSearchOneList (OrdrSearchVO vo){
		System.out.println(vo);
		return service.ordrSearchOneList(vo);
	}
	
	@PostMapping("ordrDtlList")
	@ResponseBody
	List<OrdrSearchVO> ordrDtlList (OrdrSearchVO vo){
		System.out.println(vo);
		return service.ordrDtlList(vo);
	}
	
	@PostMapping("ordrDtlUpdate")
	@ResponseBody
	public List<OrdrSearchVO> ordrDtlUpdate(@RequestBody List<OrdrSearchVO> ordrSearchList, OrdrSearchVO vo){
		
		service.ordrDtlUpdate(ordrSearchList);
		return ordrSearchList;
		
	}
	

	
	@RequestMapping(path="reports", produces = {MediaType.APPLICATION_PDF_VALUE})
	public void report(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		Connection conn = dataSource.getConnection();
		InputStream stream = getClass().getResourceAsStream("/jasper/reports/rscOrdrReport.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(stream);
		//파라미터 맵
		HashMap<String,Object> map = new HashMap<>();
		map.put("P_ordrCd", request.getParameter("ordrCd"));
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, conn);
		JasperExportManager.exportReportToPdfStream( jasperPrint, response.getOutputStream());
		
	}
	
}
