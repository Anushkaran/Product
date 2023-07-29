package com.Products.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Products.Entity.Product;
import com.Products.Repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository pr;
	public String set(Product p) {
		pr.save(p);
		return "Success";
	}
	public String setall(List<Product> p) {
		pr.saveAll(p);
		return "Success";
	}
	public List<Product> getall() {
		
		return pr.findAll();
	}
	public Product getbyid(int id) {
	       
		return pr.findById(id).get();
	}

}
