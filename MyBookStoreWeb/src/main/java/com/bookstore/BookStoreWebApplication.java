package com.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 
@EnableFeignClients 
@EnableEurekaClient 
@EnableCircuitBreaker 
public class BookStoreWebApplication {
	static Logger log = LoggerFactory.getLogger(BookStoreWebApplication.class);

	public static void main(String args[]) {
		log.info(" BookStoreWeb - Begin ");
		SpringApplication.run(BookStoreWebApplication.class, args);
		log.info(" BookStoreWeb - End ");
	}
	
	

}