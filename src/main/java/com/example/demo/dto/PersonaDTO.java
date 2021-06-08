package com.example.demo.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaDTO {

	private Integer id;

	private String name;

	private List<DocumentDTO> documents;
	
	private List<ProfileDTO> profiles;
}
