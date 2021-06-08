package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.IDocumentMapper;
import com.example.demo.dto.DocumentDTO;
import com.example.demo.entity.Document;
import com.example.demo.repository.IDocumentRepository;

@Service
public class DocumentService {

	@Autowired
	private IDocumentRepository documentRepository;

	public List<DocumentDTO> findAll() {
		return IDocumentMapper.INSTANCE.documentListToDocumentDTOList(documentRepository.findAll());
	}

	public DocumentDTO save(DocumentDTO documentDTO) {
		Document document = IDocumentMapper.INSTANCE.documentDTOToDocument(documentDTO);
		return IDocumentMapper.INSTANCE.documentToDocumentDTO(documentRepository.save(document));
	}

	public List<DocumentDTO> findByNumber(String type) {
		return IDocumentMapper.INSTANCE.documentListToDocumentDTOList(documentRepository.findByType(type));
	}
}
