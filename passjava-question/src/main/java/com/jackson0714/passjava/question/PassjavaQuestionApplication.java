package com.jackson0714.passjava.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.jackson0714.passjava.question.dao")
public class PassjavaQuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaQuestionApplication.class, args);
	}

}
