package com.rezzo.mes.equip.eqm.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
	@Value("$com.rezzo.upload.path}")
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
	public List<EqmVO> eqmSelect(@RequestParam(value = "keyword") String keyword, Model model) {
		return eqmService.eqmSelect(keyword);
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

	//이미지 파일
	@GetMapping(value = "image/{imagename}", produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> userSearch(@PathVariable("imagename") String imagename) throws IOException {
		InputStream imageStream = new FileInputStream("c://imgfile/" + imagename);
		byte[] imageByteArray = IOUtils.toByteArray(imageStream);
		imageStream.close();
		return new ResponseEntity<byte[]>(imageByteArray, HttpStatus.OK);
	}
	
	//추가
	
	@PostMapping("eqmInsert")
	@ResponseBody
	public List<EqmVO> eqmInsert(EqmVO vo, MultipartFile file) {	
		String fileName = file.getOriginalFilename();
		if(fileName != null && !fileName.isEmpty() && fileName.length () !=0) {
			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName.substring(fileName.indexOf("_"));
			File target = new File(saveDir, saveFileName);
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
	
	//수정
	
	@PostMapping("eqmUpdate")
	@ResponseBody
	public List<EqmVO> eqmUpdate(EqmVO vo, MultipartFile file) {
		String fileName = file.getOriginalFilename();
		if(fileName != null && !fileName.isEmpty() && fileName.length () !=0) {
			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName.substring(fileName.indexOf("_"));
			File target = new File(saveDir, saveFileName);
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