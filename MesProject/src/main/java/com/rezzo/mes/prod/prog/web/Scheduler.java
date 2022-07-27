package com.rezzo.mes.prod.prog.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rezzo.mes.prod.prog.service.ProgService;

@EnableScheduling
@Component
public class Scheduler {
	@Autowired
	ProgService service;

	@Scheduled(cron = "*/7 * * * * *")
	public void schedule() {
		service.schedule(null, "QHT001");
		service.schedule("QHT001", "MDC001");
		service.schedule("MDC001", "FUL001");
		service.schedule("FUL001", "CPP001");
		service.schedule("CPP001", "QCD001");
		service.schedule("QCD001", "OPG001");
	}

	
}
