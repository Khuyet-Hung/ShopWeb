package com.lab8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping( {"/", "/home/index"})
	public String home() {
		return "home/index";
	}
	
	@RequestMapping( {"/admin", "/admin/home/index"})
	public String admin() {
		return "redirect:/admin/index.html";
	}
}
