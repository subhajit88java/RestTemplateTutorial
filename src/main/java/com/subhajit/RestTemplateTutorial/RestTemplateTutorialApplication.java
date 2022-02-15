package com.subhajit.RestTemplateTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.subhajit")
public class RestTemplateTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateTutorialApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
		return restTemplate;
	}

}

/*
 * This Spring Boot app acts as a Web Service(Consumer) which calls another Web service(Provider)
 * named SpringBootInputOutputStorehouse using Spring RestTemplate.
 * 
 * This Web Service is not registered to Eureka or Zuul.
 */