package com.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class WebConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/myjsps/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("STOREKEEPER");
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("CUSTOMER");
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("CUSTOMER");
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("CUSTOMER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/deleteBook**").access("hasRole('ROLE_ADMIN')").antMatchers("/addBook**")
				.access("hasAnyRole('ROLE_ADMIN','ROLE_STOREKEEPER')").antMatchers("/editBook**")
				.access("hasAnyRole('ROLE_ADMIN','ROLE_STOREKEEPER')").antMatchers("/placeOrder**")
				.access("hasAnyRole('ROLE_ADMIN','ROLE_STOREKEEPER')").antMatchers("/mylogin**")
				.access("hasAnyRole('ROLE_CUSTOMER')").and().formLogin().and().exceptionHandling()
				.accessDeniedPage("/WEB-INF/myjsps/invalidAccess.jsp");
	}

	private ApiInfo getApiDetails() {
		return new ApiInfo("My BookStore- API", "PlaceOrderMS- API - part of BookStore", "1.0", "Free to use ", "",
				null, null);
	}

	@Bean
	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
//				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build()
//				.apiInfo(getApiDetails());
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//enabling swagger-ui 
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/METAINF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/");
	}
}
