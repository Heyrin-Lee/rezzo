package com.rezzo.mes.qc.insp.web;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.rezzo.mes.CommonExcelView;
import com.rezzo.mes.CommonPdfView;
import com.rezzo.mes.qc.insp.service.PrdtInspService;
import com.rezzo.mes.qc.insp.service.PrdtInspVO;
import com.rezzo.mes.sales.order.service.OrderVO;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@Controller
public class PrdtInspController {

	@Autowired PrdtInspService service;
	@Autowired DataSource dataSource;
	@Autowired CommonPdfView commonPdfView;
	@Autowired CommonExcelView commonExcelView;

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
	@ResponseStatus(value = HttpStatus.OK)
	public void savePrdtInsp(@RequestBody List<PrdtInspVO> prdtInspList) {
		service.savePrdtInsp(prdtInspList);
	}

	@RequestMapping("getPrdtInsp")
	@ResponseBody
	public List<PrdtInspVO> getPrdtInsp(PrdtInspVO prdtInspVO) {
		return service.getPrdtInsp(prdtInspVO);
	}

	@RequestMapping("getPrdtInspDtl")
	@ResponseBody
	public List<PrdtInspVO> getPrdtInspDtl(PrdtInspVO prdtInspVO) {
		return service.getPrdtInspDtl(prdtInspVO);
	}
	
	//컨트롤러에서 컴파일하기
	@RequestMapping(path = "report", produces = { MediaType.APPLICATION_PDF_VALUE })
	public void report(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		Connection conn = dataSource.getConnection();
		InputStream stream = getClass().getResourceAsStream("/jasper/reports/prdtReport.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(stream);
		// 파라미터 맵
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("param", request.getParameter("param"));
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, conn);
		JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());

	}
	
	//컴파일된 파일 이용
	@RequestMapping(path = "prdtInspPdf", produces = { MediaType.APPLICATION_PDF_VALUE })
	public void report2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		Connection conn = dataSource.getConnection();
		InputStream jasperStream = getClass().getResourceAsStream("/jasper/reports/aaa.jasper");
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
		JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
	}
	
	//공통뷰 상속받기
	//@RequestMapping(path = "prdtInspPdf", produces = { MediaType.APPLICATION_PDF_VALUE })
	public ModelAndView prdtInspPdf(@RequestParam Map<String,Object> pram) throws Exception {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("filename", "/jasper/reports/prdtReport.jrxml");
		map.put("params", pram);
		
		return new ModelAndView(commonPdfView, map);
	}
	
	//검사리스트 엑셀 다운로드
	@RequestMapping(path="prdtInspExel", produces = "application/vnd.ms-excel")
	public ModelAndView excelView(PrdtInspVO prdtInspVO, HttpServletResponse response) throws IOException {
		List<Map<String, Object>> list = service.getPrdtInspListMap(prdtInspVO);
		HashMap<String, Object> map = new HashMap<String, Object>();
		String[] header = {"LOT번호", "제품코드", "제품명", "최종판정", "검사날짜", "검사자"};
		map.put("headers", header);
		map.put("filename", "prdtInspList");
		map.put("datas", list);
		return new ModelAndView(commonExcelView, map);
	}

}
