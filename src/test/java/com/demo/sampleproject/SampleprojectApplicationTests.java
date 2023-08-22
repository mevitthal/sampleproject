package com.demo.sampleproject;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SampleprojectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testGetAllEmployee() throws URISyntaxException {
		
		URI uri=new URI("http://localhost:8080/getallemployee");
		
	RestTemplate resttemplate=	new RestTemplate();
	ResponseEntity<String> string=resttemplate.getForEntity(uri,String.class);
	
  Assertions.assertEquals(HttpStatus.OK,string.getStatusCode());
		
		
	}

}
