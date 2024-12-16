package com.loc.web_organic_java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loc.web_organic_java.dto.ProductDTO;
import com.loc.web_organic_java.models.Product;
import com.loc.web_organic_java.services.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    public List<ProductDTO> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/getAllProductSorted")
    public List<Product> getProductDetail(@RequestParam long categoryId) {
        return productService.getAllProductSorted(categoryId);
    }

    @GetMapping("/getProductDetail")
    public List<Product> getProductDetail(@RequestParam String slug) {
        return productService.getAllProductSlug(slug);
    }
}
