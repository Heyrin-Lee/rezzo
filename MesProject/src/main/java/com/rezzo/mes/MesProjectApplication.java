package com.rezzo.mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.rezzo.mes.**.mapper")
public class MesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MesProjectApplication.class, args);
	}

}
