package com.jackson0714.passjava.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PassjavaMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaMemberApplication.class, args);
	}

}
