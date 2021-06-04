package com.example.demo.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.PersonaDTO;
import com.example.demo.entity.Persona;

@Mapper
public interface IPersonaMapper {

	IPersonaMapper INSTANCE = Mappers.getMapper(IPersonaMapper.class);
	
	Persona personaDTOToPersona(PersonaDTO personaDTO);
	
	PersonaDTO personaToPersonaDTO(Persona persona);
	
	List<Persona> listPersonaDTOToListPersona(List<PersonaDTO> listPersonaDTO);
	
	List<PersonaDTO> listPersonaToListPersonaDTO(List<Persona> listPersona);
}
