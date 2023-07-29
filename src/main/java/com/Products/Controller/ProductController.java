package com.Products.Controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Products.Entity.Product;
import com.Products.Service.ProductService;
//import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	@Autowired
	ProductService ps;
	
	@PostMapping(value="/set")
	public String set(@RequestBody Product p) {
		return ps.set(p);
	}
	
	@PostMapping(value="/setall")
	public String setall(@RequestBody List<Product> p) {
		return ps.setall(p);
	}
	
	@GetMapping(value="/getall")
	public List<Product> getall() {
		return ps.getall();
		
	}
	
	@GetMapping(value="/getbyid/{id}") 
	public Product getbyid(@PathVariable int id) {
		return ps.getbyid(id);
	}
	
	@GetMapping(value="/getstring")
	public String getstring() {
		return "Hello";
	}

}
