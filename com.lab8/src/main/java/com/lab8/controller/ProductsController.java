package com.lab8.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lab8.entity.Product;
import com.lab8.service.ProductsService;

@Controller
public class ProductsController {
	@Autowired
	ProductsService producsService;
	
	@RequestMapping("/products/list")
	public String list() {
		return "products/index";
	}
}
