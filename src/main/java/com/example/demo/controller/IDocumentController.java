package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.DocumentDTO;

@RequestMapping("/document")
public interface IDocumentController {

	@GetMapping("/findAll")
	public List<DocumentDTO> findAllDocuments();

	@PostMapping("/")
	public DocumentDTO save(@RequestBody DocumentDTO documentDTO);
}
