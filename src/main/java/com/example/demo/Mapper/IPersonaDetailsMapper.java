package com.example.demo.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.PersonaDetailsDTO;
import com.example.demo.entity.PersonaDetails;

@Mapper
public interface IPersonaDetailsMapper {

	IPersonaDetailsMapper INSTANCE = Mappers.getMapper(IPersonaDetailsMapper.class);
	
	PersonaDetails personaDetailsDTOToPersonaDetails(PersonaDetailsDTO personaDetailsDTO);
	
	PersonaDetailsDTO personDetailsToPersonaDetailsDTO(PersonaDetails personaDetails);
}
