package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.CountryDTO;

@RequestMapping("/country")
public interface ICountryController {

	@GetMapping("/findAllCountries")
	public List<CountryDTO> findAllCountries();
}
