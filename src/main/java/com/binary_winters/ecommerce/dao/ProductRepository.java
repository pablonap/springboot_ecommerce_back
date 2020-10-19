package com.binary_winters.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.binary_winters.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	// This allows go to: localhost:8080/api/products/search/findByCategoryId?id=1
	Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

}