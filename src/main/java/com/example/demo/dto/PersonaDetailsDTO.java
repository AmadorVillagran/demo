package com.example.demo.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaDetailsDTO {

	private Integer id;
	
	private PersonaDTO persona;
	
	private Date birthDate;
	
	private String birthCity;
	
	private String job;
	
	private String address;
}
