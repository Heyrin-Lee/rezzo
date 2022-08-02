package com.rezzo.mes.resour.stc.web;

import com.rezzo.mes.resour.stc.mapper.RscStcMapper;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@EnableAsync
@AllArgsConstructor
public class StcScheduler {

    private final RscStcMapper mapper;

    @Transactional
    @Scheduled(cron = "0 0 0 1 * ?")
    public void stcStack() {
        System.out.println("Execute stock scheduler");
        mapper.stcStack();
    }
}
