package com.example.demo.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.ICountryController;
import com.example.demo.controller.IDemo2Controller;
import com.example.demo.dto.CountryDTO;

@RestController
public class CountryControllerImpl implements ICountryController {

	@Autowired
	private IDemo2Controller demo2Controller;

	@Override
	public List<CountryDTO> findAllCountries() {
		return demo2Controller.findAllCountries().getBody();
	}

}
