package com.rezzo.mes.sales.oust.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.sales.oust.mapper.OustMapper;

@Controller
public class OustController {

	@Autowired OustMapper mapper;
	
	//출고조회 페이지 불러오기
	@RequestMapping("oust")
	public String oust() {
		return "sales/oust";
	}
	
	//출고등록 페이지 불러오기
	@RequestMapping("addOust")
	public String addOust() {
		return "sales/addOust";
	}
}
