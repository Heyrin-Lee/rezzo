package com.rezzo.mes.equip.eqm.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.rezzo.mes.comm.ccds.service.CcdsService;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.equip.eqm.service.EqmService;
import com.rezzo.mes.equip.eqm.service.EqmVO;
import com.rezzo.mes.equip.line.service.EqmLineService;
import com.rezzo.mes.equip.line.service.EqmLineVO;
import com.rezzo.mes.prod.prcs.service.PrcsService;
import com.rezzo.mes.prod.prcs.service.PrcsVO;

@Controller
public class EqmController {
	@Autowired
	String saveDir;
	@Autowired
	EqmService eqmService;
	@Autowired
	EqmLineService lineService;
	@Autowired
	PrcsService prcsService;
	@Autowired
	CcdsService ccdsService;
	@Value("${com.rezzo.upload.path}")
	private String uploadPath;

	
	// eqm 화면
	
	@RequestMapping("eqm")
	public String eqmLineList(Model model, EqmLineVO vo, PrcsVO prcsVo, CcdsVO ccdsVO) {
		List<EqmLineVO> eqmLineSelectList = lineService.eqmLineSelectList(vo);
		model.addAttribute("opList", eqmLineSelectList);

		List<PrcsVO> prcsList = prcsService.prcsList(prcsVo);
		model.addAttribute("prcsList", prcsList);

		model.addAttribute("ccds", ccdsService.getCodes("EQM"));

		return "equip/eqm";
	}

	// 다건조회
	
	@GetMapping("eqmList")
	@ResponseBody
	public List<EqmVO> EqmList(EqmVO vo, Model model) {
		List<EqmVO> eqmList = eqmService.eqmList(vo);
		return eqmList;
	}
	
	// 한건조회

	@PostMapping("eqmSelect")
	@ResponseBody
	public List<EqmVO> eqmSelect(@Param(value = "keyword") String keyword, @Param(value="opN") int opN) {
		return eqmService.eqmSelect(opN,keyword);
	}
	
	// 코드 조회	
	@PostMapping("eqmCdSelect")
	@ResponseBody
	public List<EqmVO> eqmCdSelect(@RequestParam(value = "keyword") String keyword, Model model) {
		return eqmService.eqmCdSelect(keyword);
	}
	
	//삭제

	@PostMapping("eqmDelete/{eqmCd}")
	@ResponseBody
	public EqmVO eqmDelete(@PathVariable String eqmCd, EqmVO vo) {
		vo.setEqmCd(eqmCd);
		eqmService.eqmDelete(vo);
		return vo;
	};

	//추가
	
	@PostMapping("eqmInsert")
	@ResponseBody
	public List<EqmVO> eqmInsert(EqmVO vo, MultipartFile file) {
		System.out.println(vo);
		if(file != null && file.getSize() >0) {
			String fileName = file.getOriginalFilename();
			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName;
			File target = new File(uploadPath, saveFileName);
			System.out.println(target.getPath());
			vo.setEqmImg(fileName);
			vo.setImgPath(saveFileName);
			try {
				FileCopyUtils.copy(file.getBytes(), target);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		eqmService.eqmInsert(vo);
		eqmService.eqmImgInsert(vo);
		return eqmService.eqmList(vo);
	};
	
	
	//다운로드
	
	@GetMapping("/download")
	public ResponseEntity<Object> download(String path) {
		try {
			Path filePath = Paths.get(uploadPath, path);
			Resource resource = new InputStreamResource(Files.newInputStream(filePath)); // 파일 resource 얻기
			
			File file = new File(path);
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDisposition(ContentDisposition.builder("attachment").filename(file.getName()).build());  
			// 다운로드 되거나 로컬에 저장되는 용도로 쓰이는지를 알려주는 헤더
			
			return new ResponseEntity<Object>(resource, headers, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.CONFLICT);
		}
	}
	
	
	//수정
	
	@PostMapping("eqmUpdate")
	@ResponseBody
	public List<EqmVO> eqmUpdate(EqmVO vo, MultipartFile file) {
		if(file != null && file.getSize() >0) {
			String fileName = file.getOriginalFilename();
			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName;
			File target = new File(uploadPath, saveFileName);
			System.out.println(target.getPath());
			vo.setEqmImg(fileName);
			vo.setImgPath(saveFileName);
			try {
				FileCopyUtils.copy(file.getBytes(), target);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		eqmService.eqmUpdate(vo);
		eqmService.eqmImgUpdate(vo);
		return eqmService.eqmList(vo);
	}
}
	
