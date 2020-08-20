package com.yc.C86S3KhaoSpringBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.C86S3KhaoSpringBoot.dao")//扫包
public class C86S3KhaoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(C86S3KhaoSpringBootApplication.class, args);
	}

}
