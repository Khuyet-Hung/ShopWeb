package com.lab8.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab8.dao.ProductDAO;
import com.lab8.dao.ProductsDAO;
import com.lab8.entity.Product;
import com.lab8.entity.Products;
import com.lab8.service.ProductService;
import com.lab8.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	ProductsDAO pdao;
	
	@Override
	public List<Products> findAll(){
		return pdao.findAll();
	}
	@Override
	public Products create(Products product) {
		return pdao.save(product);
	}

	@Override
	public Products update(Products product) {
		return pdao.save(product);
	}

	@Override
	public void delete(String id) {
		pdao.deleteById(id);
	}
	
	
}
