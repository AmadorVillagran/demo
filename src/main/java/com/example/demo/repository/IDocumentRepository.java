package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Document;

@Repository
public interface IDocumentRepository extends JpaRepository<Document, Integer> {

	List<Document> findByType(String type);
	
}
