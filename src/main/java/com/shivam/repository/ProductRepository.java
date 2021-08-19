package com.shivam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
