package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "persona_details")
public class PersonaDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@JoinColumn(name = "persona_id")
	@OneToOne
	private Persona persona;
	
	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name = "birth_city")
	private String birthCity;

	@Column(name = "job")
	private String job;

	@Column(name = "address")
	private String address;

}
