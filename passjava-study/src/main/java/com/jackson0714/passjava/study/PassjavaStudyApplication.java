package com.jackson0714.passjava.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PassjavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaStudyApplication.class, args);
	}

}
