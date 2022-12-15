package com.pw12022.fourinfo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pw12022.fourinfo.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
    List<Product>findAllByOrderByNameAsc();
}
