package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.PersonaDTO;

@RequestMapping(value = "/persona")
public interface IPersonaController {
	
	@GetMapping(value = "/findAll")
	public List<PersonaDTO> findAllPersonas();
	
	@PostMapping(value = "/")
	public PersonaDTO savePersona(@RequestBody PersonaDTO personaDTO);
	
}
