package com.rezzo.mes.release.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReleaseController {

	@RequestMapping("/release.do")
	public String release() {
		return "release/release";
	}
}
