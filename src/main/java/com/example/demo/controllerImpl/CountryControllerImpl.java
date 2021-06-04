package com.example.demo.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.CountryController;
import com.example.demo.dto.CountryDTO;
import com.example.demo.external.service.CountryService;
import com.example.demo.controller.Demo2Controller;

@RestController
public class CountryControllerImpl implements CountryController {

	@Autowired
	private CountryService countryService;
	
	@Autowired
	private Demo2Controller demo2Controller;
	
	@Override
	public List<CountryDTO> findAllCountries() {
		 return countryService.findAll();
//		return null;
	}

	@Override
	public List<CountryDTO> findAllPaises(){
		return demo2Controller.findAllCountries().getBody();
	}
	
}
