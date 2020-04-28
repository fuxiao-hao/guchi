package com.newer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.newer.dao")
@SpringBootApplication
public class TrendshomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendshomeApplication.class, args);
	}

}
