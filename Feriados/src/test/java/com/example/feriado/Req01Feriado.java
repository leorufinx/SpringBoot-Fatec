package com.example.feriado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

class Req01Feriado {

	@Test
	void ct01_consultar_feriado_com_sucesso() {
		String baseUrl = "https://api.invertexto.com/v1/holidays/2023?token=5429|A5trx9fcXvrZXIDeBAQfonwWqO3qOqj4&state=SP";
		RestTemplate restTemplate = new RestTemplate(); 
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		record Feriado(String date, String name, String type, String level) {};
		HttpEntity request = new HttpEntity<>(headers);
		ResponseEntity<String> response = restTemplate.exchange(baseUrl, HttpMethod.GET, request, String.class);
		assertEquals("200 OK", response.getStatusCode().toString()); 
		assertEquals("application/json" , response.getHeaders().getContentType().toString());
		System.out.println(response.getBody());
		
		Gson gson = new Gson();
		Feriado[] lista = gson.fromJson(response.getBody(), Feriado[].class);
		System.out.println(lista[0]);
		assertEquals(17, lista.length);
	}

}
