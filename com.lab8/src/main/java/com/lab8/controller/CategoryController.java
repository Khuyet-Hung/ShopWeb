package com.lab8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	@RequestMapping( {"/category/index"})
	public String home() {
		return "category/index";
	}
}
