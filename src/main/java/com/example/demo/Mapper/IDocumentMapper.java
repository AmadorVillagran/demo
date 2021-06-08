package com.example.demo.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.DocumentDTO;
import com.example.demo.entity.Document;

@Mapper
public interface IDocumentMapper {

	IDocumentMapper INSTANCE = Mappers.getMapper(IDocumentMapper.class);
	
	Document documentDTOToDocument(DocumentDTO documentDTO);
	
	DocumentDTO documentToDocumentDTO(Document document);
	
	List<Document> documentDTOListToDocumentList(List<DocumentDTO> documentDTOList);
	
	List<DocumentDTO> documentListToDocumentDTOList(List<Document> documentList);
}
