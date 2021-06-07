package com.example.demo.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IPersonaController;
import com.example.demo.dto.PersonaDTO;
import com.example.demo.service.PersonaService;

@CrossOrigin(origins = "*")
@RestController
public class PersonaControllerImpl implements IPersonaController {

	@Autowired
	private PersonaService personaService;

	@Override
	public List<PersonaDTO> findAllPersonas() {
		return personaService.findAll();
	}

	@Override
	public PersonaDTO savePersona(PersonaDTO personaDTO) {
		return personaService.save(personaDTO);
	}

}
