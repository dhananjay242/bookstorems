package com.bookprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient 
public class BookPriceApplication {
	static Logger log = LoggerFactory.getLogger(BookPriceApplication.class);

	public static void main(String args[]) {
		log.info(" BookPriceMS - Begin ");
		SpringApplication.run(BookPriceApplication.class, args);
		log.info(" BookPriceMS - End ");
	}
	


//	private ApiInfo getApiDetails() {
//		return new ApiInfo("JLC BookStore- API", "BookPrice API - part of BookStore", "1.0", "Free to use ",
//				new Contact("Srinivas Dande", "https://www.jlcindia.com", "sri@jlcindia.com"), "API Under Free Licence",
//				"https://www.jlcindia.com");
//	}
//
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
//				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build()
//				.apiInfo(getApiDetails());
//	}

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
////enabling swagger-ui 
//		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/METAINF/resources/");
//		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/");
//	}

}