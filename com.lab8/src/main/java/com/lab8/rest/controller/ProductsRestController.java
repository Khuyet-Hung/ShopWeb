package com.lab8.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab8.entity.Product;
import com.lab8.entity.Products;
import com.lab8.service.ProductService;
import com.lab8.service.ProductsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/product")
public class ProductsRestController {
	@Autowired
	ProductsService productService;
	
	@GetMapping()
	public List<Products> getAll() {
		return productService.findAll();
	}
	
	@PostMapping()
	public Products create(@RequestBody Products product) {
		return productService.create(product);
	}
	
	@PutMapping("{id}")
	public Products update(@PathVariable("id") String id,@RequestBody Products product) {
		return productService.update(product);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") String id) {
		 productService.delete(id);
	}
}
