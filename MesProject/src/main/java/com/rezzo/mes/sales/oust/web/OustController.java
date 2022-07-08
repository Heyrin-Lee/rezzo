package com.rezzo.mes.sales.oust.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rezzo.mes.sales.oust.mapper.OustMapper;

@Controller
public class OustController {

	@Autowired OustMapper mapper;
}
