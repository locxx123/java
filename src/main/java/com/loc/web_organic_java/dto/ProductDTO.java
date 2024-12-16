package com.loc.web_organic_java.dto;

public class ProductDTO {
    private String id;
    private String name;
    private String image;
    private String slug;
    private String price;
    private String price_old;
    public String getName() {
        return name;
    }
    public ProductDTO(String name, String image, String slug, String price, String price_old) {
        this.name = name;
        this.image = image;
        this.slug = slug;
        this.price = price;
        this.price_old = price_old;
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
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice_old() {
        return price_old;
    }
    public void setPrice_old(String price_old) {
        this.price_old = price_old;
    }
    // public Object getId() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getId'");
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
