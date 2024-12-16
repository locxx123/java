// // package com.loc.web_organic_java.services;

// // import java.util.List;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.stereotype.Service;

// // import com.loc.web_organic_java.models.Product;
// // import com.loc.web_organic_java.repository.ProductRepository;

// // @Service
// // public class ProductService {
// //     @Autowired
// //     private ProductRepository productRepository;
// //     public List<Product> getAllProduct() {
// //         return productRepository.findAll();
// // //         // throw new UnsupportedOperationException("Not supported yet.");
// //     }

// //     public List<Product> getAllProductSorted(long categoryId) {
// //         return productRepository.findProductByCategoryId(categoryId);
// //     }
// // }



package com.loc.web_organic_java.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loc.web_organic_java.dto.ProductDTO;
import com.loc.web_organic_java.interfaces.ProductInterface;
import com.loc.web_organic_java.models.Product;
import com.loc.web_organic_java.repository.ProductRepository;

@Service
public class ProductService implements ProductInterface{
    @Autowired
    private ProductRepository productRepository;

    
//     public List<Product> getAllProduct() {
//         return productRepository.findAll();
// //         // throw new UnsupportedOperationException("Not supported yet.");
//     }
    @Override
    public List<ProductDTO> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                       .map(product -> new ProductDTO(product.getName(),product.getImage(), product.getSlug(),product.getPrice(),product.getPrice_old()))
                       .collect(Collectors.toList());
//         // throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Product> getAllProductSorted(long categoryId) {
        return productRepository.findProductByCategoryId(categoryId);
    }

    @Override
    public List<Product> getAllProductSlug(String slug) {
        return productRepository.findProductBySlug(slug);
    }

    @Override
    public List<ProductDTO> getProductsByIds(List<Long> productIds) {
        List<Product>  products = productRepository.findProductByIdIn(productIds);
        return products.stream()
                       .map(product -> new ProductDTO(product.getName(),product.getImage(), product.getSlug(),product.getPrice(),product.getPrice_old()))
                       .collect(Collectors.toList());
        // return productRepository.findProductByIdIn(productIds);
    }
}
