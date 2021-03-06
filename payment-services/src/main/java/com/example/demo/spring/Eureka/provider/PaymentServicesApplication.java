package com.example.demo.spring.Eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = { "com.example.demo.spring.Eureka"} )
@EnableEurekaClient
public class PaymentServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(PaymentServicesApplication.class, args);
	}

}
