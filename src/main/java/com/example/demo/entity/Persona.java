package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "personas")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@Column(name = "name")
	private String name;

	@JoinColumn(name = "persona_id")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Document> documents;

	@JoinTable(name = "personas_profiles")
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Profile> profiles;
}
