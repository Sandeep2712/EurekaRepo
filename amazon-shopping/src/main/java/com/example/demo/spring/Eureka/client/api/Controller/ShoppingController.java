package com.example.demo.spring.Eureka.client.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RefreshScope
@RestController
public class ShoppingController {
	@Autowired
	@Lazy
	private RestTemplate template;
	@Value("${microservice.payment-services.endpoints.endpoint.uri}")
	private String Enpoint_URL;
	@GetMapping("/shopping-services/{price}")
	public String invokepaymentservices(@PathVariable int price) {
		String url=Enpoint_URL+"/"+price;
		return template.getForObject(url, String.class);
	}
	

}
