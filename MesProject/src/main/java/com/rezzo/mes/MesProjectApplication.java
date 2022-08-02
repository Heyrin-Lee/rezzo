package com.rezzo.mes;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@MapperScan(basePackages = "com.rezzo.mes.**.mapper")
public class MesProjectApplication {
	
	@PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }

	public static void main(String[] args) {
		SpringApplication.run(MesProjectApplication.class, args);
	}

	@Bean
	public String saveDir() {
		return "C:imgfile/";
	}
	
	@RequestMapping("/")
	public String home() {
		return "home/home";
	}
	
	@RequestMapping("login")
    public String login(){
        return "home/login";
    }
	
	@RequestMapping("loginFail")
    public String loginFail(){
        return "home/login";
    }
	
}
