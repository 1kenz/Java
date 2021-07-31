package com.javacourse.springBootDemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@GetMapping("/products")
	public String get() {
		return "Dell Laptop";
	}
	
	@GetMapping("/all")
	public String get2() {
		return "Dell 9550";
	}
}
