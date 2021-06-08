package com.example.demo.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IDocumentController;
import com.example.demo.dto.DocumentDTO;
import com.example.demo.service.DocumentService;


@RestController
public class DocumentControllerImpl implements IDocumentController {

	@Autowired
	private DocumentService documentService;

	@Override
	public List<DocumentDTO> findAllDocuments() {
		return documentService.findAll();
	}

	@Override
	public DocumentDTO save(DocumentDTO documentDTO) {
		return documentService.save(documentDTO);
	}

}
