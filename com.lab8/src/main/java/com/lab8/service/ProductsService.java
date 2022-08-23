package com.lab8.service;

import java.util.List;
import java.util.Optional;

import com.lab8.entity.Product;
import com.lab8.entity.Products;

public interface ProductsService {

	List<Products> findAll();
	
	Products create(Products product);

	Products update(Products product);

	void delete(String id);

}
