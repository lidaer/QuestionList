package com.jackson0714.passjava.channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PassjavaChannelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaChannelApplication.class, args);
	}

}
