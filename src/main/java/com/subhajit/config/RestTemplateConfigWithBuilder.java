package com.subhajit.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfigWithBuilder {
	
	@Bean(name="restTemplateWithBuilder")
	public RestTemplate getRestTemplateWithBuilder(RestTemplateBuilder restTemplateBuilder) {
		RestTemplate restTemplate = restTemplateBuilder.interceptors(new HeaderInterceptor()).build();
		return restTemplate;
	}
}
