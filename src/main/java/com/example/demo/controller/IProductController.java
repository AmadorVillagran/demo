package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.ProductDTO;

@RequestMapping("/product")
public interface IProductController {

	@GetMapping("/findAllProducts")
	public List<ProductDTO> findAllProducts();
}
