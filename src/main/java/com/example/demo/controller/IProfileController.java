package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.ProfileDTO;

@RequestMapping("profile")
public interface IProfileController {

	@GetMapping("/findAll")
	public List<ProfileDTO> findAllProfiles();
	
	@PostMapping("/")
	public ProfileDTO save(@RequestBody ProfileDTO profileDTO);
}
