package com.example.demo.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IProfileController;
import com.example.demo.dto.ProfileDTO;
import com.example.demo.service.ProfileService;

@RestController
public class ProfileControllerImpl implements IProfileController {

	@Autowired
	private ProfileService profileService;

	@Override
	public List<ProfileDTO> findAllProfiles() {
		return profileService.findAll();
	}

	@Override
	public ProfileDTO save(ProfileDTO profileDTO) {
		return profileService.save(profileDTO);
	}

}
