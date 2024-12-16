package com.loc.web_organic_java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loc.web_organic_java.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


    // @Query(fields=" 'name' : 1, 'age' :1")
    List<Product> findAll();

    List<Product> findProductByCategoryId(long categoryId);

    
    List<Product> findProductBySlug(String slug);

    List<Product> findProductByIdIn(List<Long> Id);
}
