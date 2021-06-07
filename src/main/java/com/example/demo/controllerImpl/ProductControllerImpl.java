package com.example.demo.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IDemo1Controller;
import com.example.demo.controller.IProductController;
import com.example.demo.dto.ProductDTO;

@RestController
public class ProductControllerImpl implements IProductController {
	
	@Autowired
	private IDemo1Controller demo1Controller;

	@Override
	public List<ProductDTO> findAllProducts() {
		return demo1Controller.findAllProducts().getBody();
	}

}
