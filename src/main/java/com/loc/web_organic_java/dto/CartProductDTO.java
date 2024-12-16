package com.loc.web_organic_java.dto;

public class CartProductDTO {
    private Long id; // Cart ID
    private Long userId;
    private Long productId;
    private String name; // Product name
    private String num; // From Cart (as String)
    private String image; // Product image
    private String price; // Product price

    // Constructor
    public CartProductDTO(Long id, Long userId, Long productId, String num, String name, String image, String price) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.name = name;
        this.num = num;
        this.image = image;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
