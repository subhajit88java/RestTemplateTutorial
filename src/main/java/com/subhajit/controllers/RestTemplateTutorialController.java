package com.subhajit.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.subhajit.models.CollegeModel;
import com.subhajit.models.MiniModel;
import com.subhajit.models.MiniModelException;
import com.subhajit.models.SuperModel;
import com.subhajit.utilities.CreateSuperModel;

@RestController
public class RestTemplateTutorialController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/testFormUrlEncoded")
	public ResponseEntity<String> testFormUrlEncoded() {

		// --------------------------------------- [Common tasks] -------------------------------------------

		// Create this map to hold all the Form field key-value pairs.
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("id", 1);
		map.add("name1", "Pallobi Das");

		// Set all the headers key-value pair
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		// Merge the headers and the request body parameters under HttpEntity
		HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(map, headers);

		// --------------------------------------- [Technique 1 using restTemplate.postForObject] -------------------------------------------

		/*
		 * This postForObject() is a very specific method which initiates a post call
		 * and populates the data returned by the called service into the instance of
		 * the class we send as last parameter and returns the same
		 */

		/*
		 * String result = restTemplate.postForObject(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-form-urlencoded",
		 * entity, String.class);
		 * 
		 * System.out.println("Result is : " + result); return new
		 * ResponseEntity(result, HttpStatus.OK);
		 */

		// --------------------------------------- [Technique 2 using restTemplate.postForEntity] -------------------------------------------

		/*
		 * This postForEntity() is a very specific method which initiates a post call
		 * and returns a ResponseEntity object(based on certain class type) sent by the
		 * called service The last parameter should be equal to the Class type over
		 * which the ResponseEntity of the called service is based
		 */

		/*
		 * ResponseEntity<String> responseEntity = restTemplate.postForEntity(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-form-urlencoded",
		 * entity, String.class); System.out.println("Result is : " +
		 * responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
		 * + " - " + responseEntity.getBody()); return responseEntity;
		 */

		// --------------------------------------- [Technique 3 using restTemplate.exchange] -------------------------------------------

		/*
		 * This exchange() is a generic method which initiates a call The method type
		 * will depend on the method we sent as parameter It returns a ResponseEntity
		 * object(based on certain class type) sent by the called service The last
		 * parameter should be equal to the Class type over which the ResponseEntity of
		 * the called service is based
		 */

		ResponseEntity<String> responseEntity = null;

		try {
			responseEntity = restTemplate.exchange(
					"http://localhost:10000/spring-boot-input-output-storehouse/request-param-with-diff-name",
					HttpMethod.POST, entity, String.class);
			System.out.println("Result is : " + responseEntity.getStatusCodeValue() + " - "
					+ responseEntity.getStatusCode() + " - " + responseEntity.getBody());
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			System.out.println("Exception  is : " + responseEntity.getStatusCodeValue() + " - "
					+ responseEntity.getStatusCode() + " - " + responseEntity.getBody());
		}

		return responseEntity;

	}

	@GetMapping("/testQueryString")
	public ResponseEntity<String> testQueryString() {

		// --------------------------------------- [Technique 1 using get for object] -------------------------------------------

		/*
		 * This getForObject() is a very specific method which initiates a get call and
		 * populates the data returned by the called service into the instance of the
		 * class we send as last parameter and returns the same
		 */

		/*
		 * String result = restTemplate.getForObject(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-querystring?id=1&name=Subhajit",
		 * String.class); System.out.println("Result : " + result); return new
		 * ResponseEntity(result, HttpStatus.OK);
		 */

		// --------------------------------------- [Technique 2 using get for entity] -------------------------------------------

		/*
		 * This getForEntity() is a very specific method which initiates a get call and
		 * returns a ResponseEntity object(based on certain class type) sent by the
		 * called service The last parameter should be equal to the Class type over
		 * which the ResponseEntity of the called service is based
		 */

		/*
		 * ResponseEntity<String> responseEntity = restTemplate.getForEntity(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-querystring?id=1&name=Subhajit",
		 * String.class); System.out.println("Result is : " +
		 * responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
		 * + " - " + responseEntity.getBody()); return responseEntity;
		 */

		// --------------------------------------- [Technique 3 using exchange] -------------------------------------------

		/*
		 * This exchange() is a generic method which initiates a call The method type
		 * will depend on the method we sent as parameter It returns a ResponseEntity
		 * object(based on certain class type) sent by the called service The last
		 * parameter should be equal to the Class type over which the ResponseEntity of
		 * the called service is based
		 */

		ResponseEntity<String> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/spring-querystring?id=1&name=Subhajit",
				HttpMethod.GET, null, String.class);
		System.out.println("Result is : " + responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
				+ " - " + responseEntity.getBody());
		return responseEntity;

	}

	@GetMapping("/testPathParam")
	public ResponseEntity<String> testPathParam() {
		// --------------------------------------- [Technique 1 using get for object] -------------------------------------------

		/*
		 * This getForObject() is a very specific method which initiates a get call and
		 * populates the data returned by the called service into the instance of the
		 * class we send as last parameter and returns the same
		 */

		/*
		 * String result = restTemplate.getForObject(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-pathparam/1/Subhajit",
		 * String.class); System.out.println("Result : " + result); return new
		 * ResponseEntity(result, HttpStatus.OK);
		 */

		// --------------------------------------- [Technique 2 using get for entity] -------------------------------------------

		/*
		 * This getForEntity() is a very specific method which initiates a get call and
		 * returns a ResponseEntity object(based on certain class type) sent by the
		 * called service The last parameter should be equal to the Class type over
		 * which the ResponseEntity of the called service is based
		 */

		/*
		 * ResponseEntity<String> responseEntity = restTemplate.getForEntity(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-pathparam/1/Subhajit",
		 * String.class); System.out.println("Result is : " +
		 * responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
		 * + " - " + responseEntity.getBody()); return responseEntity;
		 */

		// --------------------------------------- [Technique 3 using exchange] -------------------------------------------

		/*
		 * This exchange() is a generic method which initiates a call The method type
		 * will depend on the method we sent as parameter It returns a ResponseEntity
		 * object(based on certain class type) sent by the called service The last
		 * parameter should be equal to the Class type over which the ResponseEntity of
		 * the called service is based
		 */

		ResponseEntity<String> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/spring-pathparam/1/Subhajit",
				HttpMethod.GET, null, String.class);
		System.out.println("Result is : " + responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
				+ " - " + responseEntity.getBody());
		return responseEntity;

	}

	@GetMapping("/testMatrixParam")
	public ResponseEntity<String> testMatrixParam() {
		// --------------------------------------- [Technique 1 using get for object] -------------------------------------------

		/*
		 * This getForObject() is a very specific method which initiates a get call and
		 * populates the data returned by the called service into the instance of the
		 * class we send as last parameter and returns the same
		 */

		/*
		 * String result = restTemplate.getForObject(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-matrixparam/data;id=1;name=Subhajit",
		 * String.class); System.out.println("Result : " + result); return new
		 * ResponseEntity(result, HttpStatus.OK);
		 */

		// --------------------------------------- [Technique 2 using get for entity] -------------------------------------------

		/*
		 * This getForEntity() is a very specific method which initiates a get call and
		 * returns a ResponseEntity object(based on certain class type) sent by the
		 * called service The last parameter should be equal to the Class type over
		 * which the ResponseEntity of the called service is based
		 */

		/*
		 * ResponseEntity<String> responseEntity = restTemplate.getForEntity(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-matrixparam/data;id=1;name=Subhajit",
		 * String.class); System.out.println("Result is : " +
		 * responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
		 * + " - " + responseEntity.getBody()); return responseEntity;
		 */

		// --------------------------------------- [Technique 3 using exchange] -------------------------------------------

		/*
		 * This exchange() is a generic method which initiates a call The method type
		 * will depend on the method we sent as parameter It returns a ResponseEntity
		 * object(based on certain class type) sent by the called service The last
		 * parameter should be equal to the Class type over which the ResponseEntity of
		 * the called service is based
		 */

		ResponseEntity<String> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/spring-matrixparam/data;id=1;name=Subhajit",
				HttpMethod.GET, null, String.class);
		System.out.println("Result is : " + responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
				+ " - " + responseEntity.getBody());
		return responseEntity;

	}

	@GetMapping("/testJSON")
	public ResponseEntity<SuperModel> testJSON() {

		// --------------------------------------- [Common tasks] -------------------------------------------

		// Create this object to provide it to the called service in form of JSON
		SuperModel superModel = CreateSuperModel.getSuperModel();

		// Set all the headers key-value pair
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Merge the headers and the request body parameters under entity
		HttpEntity<SuperModel> entity = new HttpEntity<>(superModel, headers);

		// --------------------------------------- [Technique 1 using post for object] -------------------------------------------

		/*
		 * SuperModel superModelResponse = restTemplate.postForObject(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-json",
		 * entity, SuperModel.class); System.out.println("Returned College Model : " +
		 * superModelResponse); return new ResponseEntity(superModelResponse,
		 * HttpStatus.OK);
		 */

		// --------------------------------------- [Technique 2 using post for entity] -------------------------------------------

		/*
		 * ResponseEntity<SuperModel> responseEntity = restTemplate.postForEntity(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-json",
		 * entity, SuperModel.class); System.out.println("Result is : " +
		 * responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
		 * + " - " + responseEntity.getBody()); return responseEntity;
		 */

		// --------------------------------------- [Technique 3 using post for exchange] -------------------------------------------

		
		ResponseEntity<SuperModel> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/spring-json", HttpMethod.POST, entity,
				SuperModel.class);
		System.out.println("Result is : " + responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
				+ " - " + responseEntity.getBody());
		return responseEntity;

	}

	// XML is problematic, research is on.......
	@GetMapping("/testXML")
	public ResponseEntity<SuperModel> testXML() {

		// --------------------------------------- [Common tasks] -------------------------------------------

		// Create this object to provide it to the called service in form of JSON
		SuperModel superModel = CreateSuperModel.getSuperModel();

		// Set all the headers key-value pair
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		// Merge the headers and the request body parameters under entity
		HttpEntity<SuperModel> entity = new HttpEntity<>(superModel, headers);

		// --------------------------------------- [Technique 1 using post for object] -------------------------------------------

		/*
		 * SuperModel superModelResponse = restTemplate.postForObject(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-XML",
		 * entity, SuperModel.class); System.out.println("Returned SuperModel Model : "
		 * + superModelResponse); return new ResponseEntity(superModelResponse,
		 * HttpStatus.OK);
		 */

		// --------------------------------------- [Technique 2 using post for entity] -------------------------------------------

		/*
		 * ResponseEntity<SuperModel> responseEntity = restTemplate.postForEntity(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/spring-json",
		 * entity, SuperModel.class); System.out.println("Result is : " +
		 * responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
		 * + " - " + responseEntity.getBody()); return responseEntity;
		 */

		// --------------------------------------- [Technique 3 using post for exchange] -------------------------------------------

		ResponseEntity<SuperModel> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/spring-json", HttpMethod.POST, entity,
				SuperModel.class);
		System.out.println("Result is : " + responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
				+ " - " + responseEntity.getBody());
		return responseEntity;

	}

	@GetMapping("/testListOfSuperModels")
	public ResponseEntity<CollegeModel[]> testCollegeModelList() {

		// --------------------------------------- [Technique 1 using post for object] -------------------------------------------

		List<SuperModel> superModel = CreateSuperModel.getSuperModelList();

		/*
		 * CollegeModel[] collegeModelList = restTemplate.postForObject(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/list-of-colleges",
		 * null, CollegeModel[].class);
		 * System.out.println("Returned College Model List : " +
		 * Arrays.asList(collegeModelList)); return new ResponseEntity(collegeModelList,
		 * HttpStatus.OK);
		 */

		// --------------------------------------- [Technique 2 using post for entity] -------------------------------------------

		/*
		 * ResponseEntity<CollegeModel[]> responseEntity = restTemplate.postForEntity(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/list-of-colleges",
		 * null, CollegeModel[].class); System.out.println("Result is : " +
		 * responseEntity.getStatusCodeValue() + " - " + responseEntity.getStatusCode()
		 * + " - " + responseEntity.getBody()); return responseEntity;
		 */

		// --------------------------------------- [Technique 3 using exchange] -------------------------------------------

		return restTemplate.exchange("http://localhost:10000/spring-boot-input-output-storehouse/list-of-colleges",
				HttpMethod.POST, null, CollegeModel[].class);

	}

	@GetMapping("/testResponseEntityVarietiesJSON")
	public ResponseEntity<?> testResponseEntityVarietiesJSON() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		// Merge the headers and the request body parameters under entity
		HttpEntity<SuperModel> entity = new HttpEntity<>(headers);

		/*
		 * ResponseEntity<SuperModel> responseEntity = restTemplate.exchange(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/test-reponseentity-single_object_body-and-status",
		 * HttpMethod.GET, entity, SuperModel.class);
		 * 
		 * SuperModel superModel = responseEntity.getBody();
		 * System.out.println("superModel : " + superModel); return new
		 * ResponseEntity(responseEntity.getBody(), HttpStatus.OK);
		 * 
		 * ResponseEntity<List> responseEntity = restTemplate.exchange(
		 * "http://localhost:10000/spring-boot-input-output-storehouse/test-reponseentity-list_object_body-and-status",
		 * HttpMethod.GET, entity, List.class);
		 * 
		 * List<SuperModel> superModelList = responseEntity.getBody();
		 * System.out.println("superModelList " + superModelList); return new
		 * ResponseEntity(responseEntity.getBody(), HttpStatus.OK);
		 */

		ResponseEntity<Map> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/test-reponseentity-map_object_body-and-status",
				HttpMethod.GET, entity, Map.class);
		Map<String, SuperModel> superModelMap = responseEntity.getBody();
		System.out.println("superModelMap : " + superModelMap);
		return new ResponseEntity(superModelMap, HttpStatus.OK);

	}
	
	@GetMapping("/testFileDownloadHardcodeFilepath")
	public ResponseEntity<?> testFileDownloadHardcodeFilepath() {
		
		ResponseEntity<Resource> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/test-file-download-hardcode-filepath",
				HttpMethod.GET, null, Resource.class);
		Resource resource = responseEntity.getBody();
		System.out.println("resource : " + resource.getFilename());
		
		return responseEntity;

	}
	
	@GetMapping("/tesFileDownloadByteArray")
	public ResponseEntity<?> tesFileDownloadByteArray() {
		
		ResponseEntity<byte[]> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/test-file-download-bytearray",
				HttpMethod.GET, null, byte[].class);
		
		String encodedString = Base64.encodeBase64String(responseEntity.getBody());
		System.out.println("encodedString : " + encodedString);
		
		return ResponseEntity.ok(encodedString);

	}
	
	@GetMapping(value = "/test", produces = "application/json")
	public ResponseEntity<?> test() {
		
		try {
			ResponseEntity<MiniModel> responseEntity = restTemplate.exchange(
				"http://localhost:10000/spring-boot-input-output-storehouse/test",
				HttpMethod.POST, null, MiniModel.class);
				
		System.out.println("Status code value : " + responseEntity.getStatusCodeValue());
		System.out.println("Status code : " + responseEntity.getStatusCode());
		System.out.println("Body : " + responseEntity.getBody());
		
		return responseEntity;
		}catch(Exception e) {
			e.printStackTrace();
			MiniModelException ex = new MiniModelException(500, "Error");
			return new ResponseEntity<MiniModelException>(ex, HttpStatus.INTERNAL_SERVER_ERROR );
		}
		

	}

}
