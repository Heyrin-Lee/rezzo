package com.rezzo.mes.prod.prog.web;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.prod.prog.service.ProgService;
import com.rezzo.mes.prod.prog.service.ProgVO;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Controller
public class ProgController {
	@Autowired ProgService service;
	@Autowired CcdsService ccdsService;
	
	@Autowired DataSource dataSource;
	
	
	@GetMapping("/prcsSearch")
	public String vend(Model model, CcdsVO vo) {
		model.addAttribute("ccds", ccdsService.getCodes("PRC", "PNF"));
		return "prod/prcsSearch";
	}
	
	@RequestMapping("indicaListModal")
	@ResponseBody
	public List<ProgVO> indicaListModal(ProgVO vo) {
		return service.indicaListModal(vo);
	}
	
	@RequestMapping("getPrcsProg")
	@ResponseBody
	public List<ProgVO> getPrcsProg(ProgVO vo) {
		return service.getPrcsProg(vo);
	}
	// +설비 켜기 추가
	@RequestMapping("insertEqmCd")
	@ResponseBody
	@Transactional
	public void insertEqmCd(ProgVO vo) {
		service.insertEqmCd(vo);
		service.updateEqm1(vo);
		
		Scheduler scheduler = new Scheduler();
		scheduler.start();
	}
	
	@RequestMapping("selectEqm")
	@ResponseBody
	public ProgVO selectEqm(ProgVO vo) {
		return service.selectEqm(vo);
	}
	
	// 주문서 상태 생산완료로, 설비 끄기, 불량 업데이트
	@RequestMapping("afterProd")
	@ResponseBody
	@Transactional
	public void afterProd(ProgVO vo) {
		service.updateOrderStatus(vo);
		service.updateEqm2(vo);
		service.insertEdctsInfo(vo);
		service.updateIndica(vo);
	}
	
	// 공정 insert 공정상세, 불량상세
	@RequestMapping("insertProgPrcs")
	@ResponseBody
	public void insertProgPrcs(@RequestBody List<ProgVO> list) {
		service.insertProgPrcs(list);
	}
	
	@RequestMapping("insertInfer")
	@ResponseBody
	public void insertInfer(ProgVO vo) {
		service.insertInfer(vo);
	}
	
	@RequestMapping("getHolding")
	@ResponseBody
	public List<ProgVO> getHolding(ProgVO vo) {
		System.out.println(vo);
		return service.getHolding(vo);
	}
	
	@RequestMapping("getProgPrcs")
	@ResponseBody
	public List<ProgVO> getProgPrcs(ProgVO vo) {
		return service.getProgPrcs(vo);
	}
	
	@RequestMapping("updateYn")
	@ResponseBody
	public List<ProgVO> updateYn () {
		service.updateYn();
		List<ProgVO> list = service.getNoOprEqm();
		service.insertOprEqm(list);
		
		return list; 
	}
	
	@RequestMapping("updateYn2")
	@ResponseBody
	public List<ProgVO> updateYn2 () {
		service.updateYn2();
		List<ProgVO> list = service.getNoOprEqm2();
		service.updateOprEqm(list);
		
//		Scheduler scheduler = new Scheduler();
//		scheduler.start();
		
		return list;
	}

	@RequestMapping(path="prcsReport", produces = {MediaType.APPLICATION_PDF_VALUE})	
	public void report(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		Connection conn = dataSource.getConnection();
		InputStream stream = getClass().getResourceAsStream("/jasper/reports/prcsReport.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(stream);
		//파라미터 맵
		//HashMap<String,Object> map = new HashMap<>();
		//map.put("p_departmentId", request.getParameter("dept"));
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
		JasperExportManager.exportReportToPdfStream( jasperPrint, response.getOutputStream());
	}
	
	class Scheduler extends Thread {

		@Override
		public void run() {
			List<String> list = Arrays.asList(null, "QHT001","MDC001","FUL001", "CPP001", "QCD001", "OPG001", null);
			for(int i=1 ; i<list.size(); i++) {
				service.schedule(list.get(i-1), list.get(i));
				try {
					this.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
