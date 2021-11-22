package com.example.demo.spring.Eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = { "com.example.demo.spring.Eureka"} )
@EnableEurekaClient
public class AmazonShoppingApplication {
	    @LoadBalanced
		@Bean
		public RestTemplate getRestTemplate() {
			return new RestTemplate();
			
		}
	public static void main(String[] args) {
		SpringApplication.run(AmazonShoppingApplication.class, args);
	}

}
