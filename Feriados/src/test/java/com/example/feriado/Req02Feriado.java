package com.example.feriado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

class Req02Feriado {

	@Test
	void ct02_consulta_feriados_token_invalido() {
		String baseUrl = "https://api.invertexto.com/v1/holidays/2023?token=5429|A5trx9fcXvrZXIDeBAQfonwWqO3qOqj4&state=SP";
		System.out.println(baseUrl); 
		RestTemplate restTemplate = new RestTemplate(); 
		HttpHeaders headers = new HttpHeaders(); 
		headers.setContentType(MediaType.APPLICATION_JSON); 
		ResponseEntity<String> response= null; 
		HttpEntity request = new HttpEntity<>(headers); 
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, request, String.class);
			
		} catch(HttpClientErrorException e) {
			assertEquals ("401 UNAUTHORIZED", e.getStatusCode().toString()); 
			 System.out.println(e.getResponseBodyAsString());
		}
	}


}
