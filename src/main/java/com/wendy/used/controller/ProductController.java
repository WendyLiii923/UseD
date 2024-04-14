package com.wendy.used.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendy.used.model.Product;
import com.wendy.used.model.dao.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
//	@Autowired
//	private ProductService productService;

	@GetMapping("/products")
	public List<Product> products() {
		return productRepository.findAll();
	}
	@GetMapping("/product/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Integer id) {
		Optional<Product> product = productRepository.findById(id);
		return product.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
