
package com.rezzo.mes.prod.prog.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rezzo.mes.prod.prog.service.ProgService;

//@EnableScheduling
@Component
public class Scheduler extends Thread {
	@Autowired
	ProgService service;

	@Override
	public void run() {
		List<String> list = Arrays.asList(null, "QHT001","MDC001","FUL001", "CPP001", "QCD001", "OPG001");
		for(int i=1 ; i<list.size(); i++) {
			service.schedule(list.get(i-1), list.get(i));
			try {
				this.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
//	@Scheduled(fixedRate = 8000)
//	public void schedule() {
//		service.schedule(null, "QHT001");
//		service.schedule("QHT001", "MDC001");
//		service.schedule("MDC001", "FUL001");
//		service.schedule("FUL001", "CPP001");
//		service.schedule("CPP001", "QCD001");
//		service.schedule("QCD001", "OPG001");
//	}

	
	
	
}
