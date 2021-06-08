package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.IProfileMapper;
import com.example.demo.dto.ProfileDTO;
import com.example.demo.entity.Profile;
import com.example.demo.repository.IProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private IProfileRepository profileRepository;

	public List<ProfileDTO> findAll() {
		return IProfileMapper.INSTANCE.profileListToProfileDTOList(profileRepository.findAll());
	}

	public ProfileDTO save(ProfileDTO profileDTO) {
		Profile profile = IProfileMapper.INSTANCE.profileDTOToProfile(profileDTO);
		return IProfileMapper.INSTANCE.profileToProfileDTO(profileRepository.save(profile));
	}

	public List<ProfileDTO> findByCode(String code) {
		return IProfileMapper.INSTANCE.profileListToProfileDTOList(profileRepository.findByCode(code));
	}
}
