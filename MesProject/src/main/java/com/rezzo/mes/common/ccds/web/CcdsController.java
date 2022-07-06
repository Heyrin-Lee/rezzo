package com.rezzo.mes.common.ccds.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.common.ccds.service.CcdsService;

@Controller
public class CcdsController {

	@Autowired CcdsService ccdsDao;
	
	@RequestMapping("ccdsList")
	public String ccdsList(Model model) {
		model.addAttribute("ccdsList", ccdsDao.getCcdsList(null));
		return "common/ccdsList";
	}
}
