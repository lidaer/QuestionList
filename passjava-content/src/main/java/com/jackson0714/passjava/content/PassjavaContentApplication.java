package com.jackson0714.passjava.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PassjavaContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaContentApplication.class, args);
	}

}
