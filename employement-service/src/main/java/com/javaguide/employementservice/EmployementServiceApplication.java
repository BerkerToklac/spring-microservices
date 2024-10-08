package com.javaguide.employementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class EmployementServiceApplication {

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}
	/*
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	 */

	public static void main(String[] args) {
		SpringApplication.run(EmployementServiceApplication.class, args);
	}

}
