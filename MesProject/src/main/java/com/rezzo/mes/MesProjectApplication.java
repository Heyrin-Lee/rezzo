package com.rezzo.mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(basePackages = "com.rezzo.mes.**.mapper")
public class MesProjectApplication {

//	@PostConstruct
//	public void getStarted() {
//		TimeZone.setDefault(TimeZone.getTimeZone("europe/london"));
//		System.out.println(new Date());
//	}

	public static void main(String[] args) {
		SpringApplication.run(MesProjectApplication.class, args);
	}

	@Bean
	public String saveDir() {

		return "imgfile";
	};
}
