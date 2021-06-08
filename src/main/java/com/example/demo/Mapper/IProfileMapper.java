package com.example.demo.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.ProfileDTO;
import com.example.demo.entity.Profile;

@Mapper
public interface IProfileMapper {

	IProfileMapper INSTANCE = Mappers.getMapper(IProfileMapper.class);
	
	Profile profileDTOToProfile(ProfileDTO profileDTO);
	
	ProfileDTO profileToProfileDTO(Profile profile);
	
	List<Profile> profileDTOListToProfileList(List<ProfileDTO> profileDTOList);
	
	List<ProfileDTO> profileListToProfileDTOList(List<Profile> profileList);
}
