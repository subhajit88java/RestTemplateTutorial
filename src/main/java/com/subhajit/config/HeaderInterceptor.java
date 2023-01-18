package com.subhajit.config;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class HeaderInterceptor implements ClientHttpRequestInterceptor{

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		System.out.println("In HeaderInterceptor, request : " + System.identityHashCode(request));
		System.out.println(new String(body));	
		request.getHeaders().add("TestHeader", "This is test header");
		return execution.execute(request, body);
	}

}
