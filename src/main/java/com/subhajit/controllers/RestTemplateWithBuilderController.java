package com.subhajit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.subhajit.models.SuperModel;
import com.subhajit.utilities.CreateSuperModel;

@RestController
public class RestTemplateWithBuilderController {

	@Autowired
	@Qualifier("restTemplateWithBuilder")
	private RestTemplate restTemplate;
	
	@GetMapping("/testJSON-restTemplateWithBuilder")
	public ResponseEntity<?> testJSONRestTemplateWithBuilder() {

		// --------------------------------------- [Common tasks] -------------------------------------------

		// Create this object to provide it to the called service in form of JSON
		SuperModel superModel = CreateSuperModel.getSuperModel();

		// Set all the headers key-value pair
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Merge the headers and the request body parameters under entity
		HttpEntity<SuperModel> entity = new HttpEntity<>(superModel, headers);


		// --------------------------------------- [Technique using post for exchange] -------------------------------------------
		System.out.println("Rest Template with builder : " + System.identityHashCode(restTemplate));

		try {
		ResponseEntity<SuperModel> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/spring-json", HttpMethod.POST, entity,
				SuperModel.class);
		System.out.println("Result is : " + responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
				+ " - " + responseEntity.getBody());
		return responseEntity;
		}catch(HttpStatusCodeException e) {
			e.printStackTrace();
			System.out.println("Status code : " + e.getRawStatusCode());
			System.out.println("Message : " + e.getMessage());
			System.out.println("Response : " + e.getResponseBodyAsString());
			return new ResponseEntity("Failed!!", HttpStatus.OK);
		}

	}
}
