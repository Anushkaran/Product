package com.Products.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Products.Dao.ProductDao;
import com.Products.Entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao pd;
	public String set(Product p) {
		
		return pd.set(p);
	}
	public String setall(List<Product> p) {
		
		return pd.setall(p);
	}
	public List<Product> getall() {
		
		return pd.getall();
	}
	public Product getbyid(int id) {
		
		return pd.getbyid(id);
	}

}
