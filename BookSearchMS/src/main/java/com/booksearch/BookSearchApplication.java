package com.booksearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
@EnableSwagger2
@EnableFeignClients 
@EnableEurekaClient
//@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class BookSearchApplication implements WebMvcConfigurer{
	static Logger log = LoggerFactory.getLogger(BookSearchApplication.class);

	public static void main(String args[]) {
		log.info(" BookSearchMS - Begin "); 
		 SpringApplication.run(BookSearchApplication.class, args); 
		 log.info(" BookSearchMS - End "); 
	}
	


	private ApiInfo getApiDetails() {
		return new ApiInfo("My BookStore- API", "BookPrice API - part of BookStore", "1.0", "Free to use ","", null, null);
	}

	@Bean
	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
//				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build()
//				.apiInfo(getApiDetails());
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.any())              
		          .paths(PathSelectors.any())                          
		          .build(); 
	}

	@Override 
	public void addResourceHandlers(ResourceHandlerRegistry registry) { 
	registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/METAINF/resources/"); 
	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/"); 
	} 

}