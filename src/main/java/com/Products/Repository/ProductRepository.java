package com.Products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Products.Entity.Product;

public interface ProductRepository extends JpaRepository<Product , Integer>{

}
