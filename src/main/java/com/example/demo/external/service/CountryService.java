package com.example.demo.external.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.CountryDTO;

@Service
public class CountryService {

//	@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	public List<CountryDTO> findAll() {
		ResponseEntity<List<CountryDTO>> findAll = restTemplate.exchange("http://localhost:8081/country/findAll",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<CountryDTO>>() {
				});

		if (findAll != null) {
			return findAll.getBody();
		}

		return null;
	}
}
