package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;

import com.example.demo.dto.CountryDTO;

@FeignClient(name = "CountryService")
@RequestMapping("/country")
public interface Demo2Controller {

	@GetMapping(path = "/findAll", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CountryDTO>> findAllCountries();
}
