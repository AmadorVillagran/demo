package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.IPersonaMapper;
import com.example.demo.repository.IPersonaRepository;
import com.example.demo.dto.PersonaDTO;
import com.example.demo.entity.Persona;


@Service
public class PersonaService {

	@Autowired
	private IPersonaRepository personaRespository;
	
		
	public List<PersonaDTO> findAll() {
		return IPersonaMapper.INSTANCE.listPersonaToListPersonaDTO(personaRespository.findAll());
	}
	
	public PersonaDTO save(PersonaDTO personaDTO) {
		Persona persona = IPersonaMapper.INSTANCE.personaDTOToPersona(personaDTO);
		return IPersonaMapper.INSTANCE.personaToPersonaDTO(personaRespository.save(persona));
	}
}
