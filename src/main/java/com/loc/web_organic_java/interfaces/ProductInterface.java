package com.loc.web_organic_java.interfaces;

import java.util.List;

import com.loc.web_organic_java.dto.ProductDTO;
import com.loc.web_organic_java.models.Product;

// Interface cấu hình các phương thức làm việc với database
public interface ProductInterface {

    // Lấy tất cả sản phẩm
    public List<ProductDTO> getAllProduct();

    // Lấy sản phẩm theo category_id
    public List<Product> getAllProductSorted(long categoryId);

    public List<Product> getAllProductSlug(String slug);

    public List<ProductDTO> getProductsByIds(List<Long> productIds);
}
